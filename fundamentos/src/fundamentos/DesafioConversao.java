package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String salario1 = teclado.next();
		String salario2 = teclado.next();
		String salario3 = teclado.next();
		//System.out.printf("salario 1 =  %s salario2 =  %s salario3 = %s","salario1","salario2","salario3");
		System.out.printf("%s %s",salario1);
		//usar o scanner, pegar 3 string pelo nextLine(), as string recebe os salario de uma pessoa e agente quer a media salarial 
		
		teclado.close();
	}
}
