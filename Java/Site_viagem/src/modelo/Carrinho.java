package modelo;

import java.util.Date;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	// Atributos
	private int idCarrinho;
	private int qtd_item;
	private Date data_compra;
	private double valor_total;
	private double valorPassagem;

	List<Passagem> passagem = new ArrayList<Passagem>();

	// Construtores
	public Carrinho() {

	}

	public Carrinho(int idCarrinho, int qtd_item, Date data_compra, Passagem passagem, double valor_total) {
		this.idCarrinho = idCarrinho;
		this.qtd_item = qtd_item;
		this.data_compra = data_compra;
		this.passagem = (List<Passagem>) passagem;
		valorPassagem(getValor_total());

	}

	private void valorPassagem(double valor_total2) {
		// TODO Auto-generated method stub
		
	}

	// Geters e Seters

	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public int getIdCarrinho() {
		return this.idCarrinho;
	}

	public void setQdt_item(int qtd_item) {
		this.qtd_item = qtd_item;
	}

	public int getQtd_item() {
		return this.qtd_item;
	}

	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}

	public Date getData_compra() {
		return this.data_compra;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public double getValor_total() {
		return this.valor_total;
	}

	// metodo mostrar
	@Override
	public String toString() {
		return "Carrinho [idCarrinho=" + idCarrinho + ", qtd_item=" + qtd_item + ", data_compra=" + data_compra
				+ ", passagem=" + passagem + ", valor_total=" + valor_total + "]";
	}

	public void valorCompra(double total) {
		for (int i = 0; i < passagem.size(); i++) {
		this.valor_total += passagem.get(i).get
		}
	}

	// metodo somar

	private void valorTotal(double preco_passagem) {
		this.valor_total = this.qtd_item * preco_passagem;
	}

}
