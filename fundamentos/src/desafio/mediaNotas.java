package desafio;

import java.util.Arrays;
import java.util.Scanner;

public class mediaNotas {
	public static void main(String[] args) {
		System.out.println("Quantas notas voce quer informar");
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeNotas = teclado.nextInt();
		double [] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d \n", i + 1);
			
			 notas[i] = teclado.nextInt();
		}
		System.out.println(Arrays.toString(notas));

		teclado.close();
		
		double total = 0;
		for(double nota:notas) {
			total += nota;
		}
		System.out.printf("A media é %f",(total/notas.length));
		
		teclado.close();
	}
}
