package nelio.oo.exercicio.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTeste {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Funcionario f1 = new Funcionario();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Name:");
		f1.name = teclado.nextLine();
		
		System.out.print("Gross Salary : ");
		f1.grossySalary = teclado.nextInt();
		
		System.out.print("tax : ");
		f1.tax = teclado.nextDouble();
		
		System.out.println(f1);
		
		f1.aumentarSalario(0.1);
		
		System.out.println(f1);
		
		teclado.close();
	}
}
