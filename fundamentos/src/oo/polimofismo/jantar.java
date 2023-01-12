package oo.polimofismo;

public class jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.200);
		feijao ingrediente2 = new feijao(0.100);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvet sobremesa = new Sorvet(0.400);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
		
	}
}
