package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double numero1 = Double.parseDouble(teclado.next());
		
		System.out.println("Digite o segundo numero");
		double numero2 = Double.parseDouble(teclado.next());
		
		System.out.println("Digite a operação: + - * /");
		String operacao = teclado.next();
		
		double resultado = operacao.equals("+") ? numero1 + numero2 : 0 ;
		resultado = operacao.equals("-") ? numero1 - numero2 : resultado ;
		resultado = operacao.equals("*") ? numero1 * numero2 : resultado ;
		resultado = operacao.equals("/") ? numero1 / numero2 : resultado ;
		
		System.out.printf("%.2f %s %.2f = %.2f",numero1,operacao,numero2,resultado);
		
		
		
		teclado.close();
	}
}
