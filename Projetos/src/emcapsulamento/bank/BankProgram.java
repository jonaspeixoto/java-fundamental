package emcapsulamento.bank;

import java.util.Locale;
import java.util.Scanner;

public class BankProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Bank conta;
		Scanner sc = new Scanner(System.in);
		
		int account;
		String name;
		double deposit;
		char validate;
		double saque;
		
		
		System.out.print("Enter accont number ");
		account = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter accont name ");
		name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		validate = sc.next().charAt(0);
		
		if(validate == 'y' || validate =='Y') {
			System.out.print("Enter intial deposit value");
			deposit = sc.nextDouble();
			conta = new Bank(account, name, deposit);  
		}
		else {
			conta = new Bank(account, name);
		}
		
		System.out.println(conta);
		
		
		System.out.print("Enter a value deposit");
		deposit = sc.nextDouble();
		conta.deposito(deposit);
		
		System.out.println("Updated acconut data");
		System.out.println(conta);
	    
		System.out.print("Enter a value withdraw");
		saque = sc.nextDouble();
		conta.withdraw(saque);
		
		System.out.println("Updated acconut data");
		
		
		
		System.out.println(conta);
		sc.close();
		

	}

}
