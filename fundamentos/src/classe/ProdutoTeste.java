package classe;



public class ProdutoTeste {
	
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4332.2);

		
		var p2  = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco= 12.57;
		
		Produto.desconto = 0.29;
		
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		
		System.out.println("Media do carrinho "+ mediaCarrinho);
		System.out.println();
	}
}
