package classe;

public class EqualsHachCode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro silva";
		u1.email = "pedro@gamil";
		
		
		Usuario u2 = new Usuario();
		u1.nome = "Pedro silva";
		u1.email = "pedro@gamil";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
						
	}
}
