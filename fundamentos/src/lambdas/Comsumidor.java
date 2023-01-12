package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Comsumidor {
	
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notbook", 2987.99, 0.09);
		Produto p3 = new Produto("Caderno", 19.90, 0.09);
		Produto p4 = new Produto("Boracha", 7.80, 0.09);
		Produto p5 = new Produto("Lapis", 4.39, 0.09);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
