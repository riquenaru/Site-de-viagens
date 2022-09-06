package modelo;

public class Passagem {

	private int idPassagem;
	private double preco_passagem;

	private Carrinho carrinho;
	private Destino destino;

	// Construtores
	public Passagem() {

	}

	public Passagem(int idPassagem, int preco_passagem, Carrinho carrinho, Destino destino) {
		super();
		this.idPassagem = idPassagem;
		this.preco_passagem = preco_passagem;
		this.carrinho = carrinho;
		this.destino = destino;
	}

	// gets and sets
	public void setIdPassagem(int idPassagem) {
		this.idPassagem = idPassagem;
	}

	public int getIdPassagem() {
		return this.idPassagem;
	}

	public void setPreco_passagem(double preco_passagem) {
		this.preco_passagem = preco_passagem;
	}

	public double getPreco_passagem() {
		return preco_passagem;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	// Metodo mostrar
	@Override
	public String toString() {
		return "Passagem [idPassagem=" + idPassagem + ", preco_passagem=" + preco_passagem + "]";
	}

}
