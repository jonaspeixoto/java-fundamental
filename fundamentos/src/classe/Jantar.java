package classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("jonas", 55.0);
		
		Comida c1 = new Comida("arroz", 0.250);
		Comida c2 = new Comida("feijao", 0.400);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
	}
	
	
}
