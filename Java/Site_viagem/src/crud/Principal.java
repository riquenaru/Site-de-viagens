package crud;

import modelo.Login;
import modelo.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		Login p1 = new Login(1, "comum");
		Login p2 = new Login(2, "administrador");
		
		Usuario u1 = new Usuario(2, " maria@email.com", "1234 ", " 453086 ", p2);
		Usuario u2 = new Usuario(1, "joao@email.com", "7421 ", "588912", p1);
		Usuario u3 = new Usuario(1, "paulo@email.com", "1422 ", "028851", p1);
		
		//u1.setEmail("maria@email.com");
		//u2.setEmail("joao@email.com");
		//u3.setEmail("paulo@email.com");
		
		System.out.println(u1.mostrar());
		System.out.println(u2.mostrar());
		System.out.println(u3.mostrar());
		
	} 

}
