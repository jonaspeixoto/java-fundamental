package nelio.oo.emcapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class BancoTeste {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Banco cliente1;
		int numeroDaConta;
		String nome;
		double deposito;
		String verificador;
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("Digite o numero da sua conta");
		numeroDaConta = teclado.nextInt();
		
		teclado.nextLine();
		System.out.print("Digite o numero da seu nome");
		nome = teclado.nextLine();
		
		System.out.print("Ira realizar deposito inicial (y/n)");
		verificador = teclado.nextLine();
		
		if(verificador == "y" ) {
			System.out.print("Qual o valor de deposito");
			deposito = teclado.nextDouble();
		
			cliente1 = new Banco(numeroDaConta, nome, deposito);
			
		}else {
			cliente1 = new Banco(numeroDaConta, nome);
		}
		
			
		
		
		
		
		teclado.close();
	}
}
