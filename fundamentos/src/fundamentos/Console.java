package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.println("Diigite o seu nome");
		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.nextLine();
		
		System.out.println("Digite su sobre nome");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. ", nome, sobrenome, idade);
		
		entrada.close();
		
	}
}
