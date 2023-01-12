package nelio.oo;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Enter product dada:");
		
		String nome = teclado.next();
		double price = teclado.nextDouble();
		int quantidade = teclado.nextInt();
		
		Poduto p1 = new Poduto(nome, price, quantidade);
		
		System.out.println(p1);
		
		teclado.close();
		
	}
	
}
