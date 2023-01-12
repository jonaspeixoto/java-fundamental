package nelio.oo.vetores.maiorposicao;

import java.util.Scanner;

public class MaiorPosicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite A quantidade de numeros");
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		for(int i = 0; i<vect.length;i++) {
			System.out.println("Digite um numero");
			double numero = sc.nextDouble();
			vect[i] = numero;
		}
		double menor = vect[0];
		double maior = vect[0];
		
		int index = 0;
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]> maior) {
				maior = vect[i];
				index = i;
			}
			else if(vect[i]< menor) {
				menor = vect[i];
			}
		}
		System.out.println("O maior numero é "+ maior +" na posiçao"+index+ " E o menor é "+menor);
		
		sc.close();
	}
}
