package modelo;

import java.util.Date;

public class Destino {

	//Atributos
	private int idDestino;
	private String destino;
	private Date data_viagem;
	
	// Construtores
		public Destino() {

		}
		public Destino(int  idDestino, String destino, Date data_viagem) {
			this. idDestino =  idDestino;
			this.destino = destino;
			this.data_viagem = data_viagem;
		}
		
		// Gets e Sets
		public void setIdDestino(int  idDestino) {
			this. idDestino = idDestino;
		}
		public int getId_destino() {
			return this. idDestino;
		}
		
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getDestino() {
			return this.destino;
		}
		
		public void setData_viagem(Date data_viagem) {
			this.data_viagem = data_viagem;
		}

		public Date getData_viagem() {
			return this.data_viagem;
		}
		
}
