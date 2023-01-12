package nelio.oo.heranca.polimosfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("Digite a quantidade de funcionarios");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			System.out.println("Dado do funcionario" + i); 
			System.out.println("O funcionario é tecerizado?");
			char ch = sc.next().charAt(0);
			System.out.println("Nome : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Quantidade de horas");
			int horas = sc.nextInt();
			System.out.println("Valor por hora");
			double valorPorHora =sc.nextDouble();
			
			if( ch == 'y') {
				System.out.println("Digite a dispesa adicional");
				double dispesa = sc.nextDouble();
				list.add(new OutsoucerEmployyer(name, horas, valorPorHora, dispesa));
			}
			else {
				list.add(new Employee(name, horas, valorPorHora));
			}
			
			System.out.println();
			
			System.out.println("PAGAMENTO");
			for (Employee emp : list) {
				System.out.println(emp.getName() + " $" + emp.payment());
			}
			
		}
		
		sc.close();
	}
}
