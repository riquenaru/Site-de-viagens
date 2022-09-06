package modelo;

public class Login {
	
	// Atributos
	private int id;
	private String tipo;

	// Construtores
	public Login() {

	}

	public Login(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	// Geters e Seters
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}
	

	// Metodos
	public String mostrar() {
		return " id: " + this.id + " tipo: " + this.tipo;
	}

}
