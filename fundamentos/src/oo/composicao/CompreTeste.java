package oo.composicao;

public class CompreTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		c1.itens.add(new Item("caneta",20, 7.45));
		c1.itens.add(new Item("Borracha",22, 10.45));
		c1.itens.add(new Item("caderno",10, 17.45));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}
}
