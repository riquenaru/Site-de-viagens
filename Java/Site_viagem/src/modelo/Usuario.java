package modelo;

public class Usuario {
	
		// Atributos
		private int idUsuario;
		private String email;
		private String senha;
		private String cpf_cnpj;
		
		private Login login;
		

		// Construtores
		public Usuario() {

		}

		public Usuario(int idUsuario, String email, String senha, String cpf_cnpj, Login login) {
			this.idUsuario = idUsuario;
			this.email = email;
			this.senha = senha;
			this.cpf_cnpj = cpf_cnpj;
			this.login = login;
		}
		
		public void setIdUsuario(int idUsuario) {
			this.idUsuario = idUsuario;
		}
		public int getIdUsuario() {
			return this.idUsuario;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return this.email;
		}
		
		public void setCpf_cpnj(String cpf_cnpj) {
			this.cpf_cnpj = cpf_cnpj;
		}
		public String getCpf_cnpj () {
			return this.cpf_cnpj;
		}
		
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getSenha () {
			return this.senha;
		}
		
		
		public Login getLogin() {
			return login;
		}

		public void setLogin(Login login) {
			this.login = login;
		}

		//metodos
		public String mostrar() {
			return "idUsuario: "
					+ this.idUsuario 
					+ " Senha: " +this.senha
					+ " Email: " +this.email
					+ "Tipo Login: " +this.login.getTipo();
		}
}
