 package nelio.oo.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o oome do departamento");
		String departamentoNome = sc.nextLine();
		
		System.out.println("entre com os dados do trabalhador");
		System.out.print("Name");	
		String workerName= sc.nextLine();
		
		System.out.print("Nivel");	
		String workerNivel= sc.nextLine();
		
		System.out.print("Salario base");	
		double baseSalario = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkedLevel.valueOf(workerNivel), baseSalario, new Departments(departamentoNome));
		
		
		System.out.print("Quantos contratos o trabalhador tem ? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			System.out.println("Entre com os dados do contrato "+i);
			System.out.print("Date (DD/MM/YYYY):");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração(horas)");
			int horas = sc.nextInt();
			HoursContracts contract = new HoursContracts(contractDate, valorPorHora, horas);
			
			worker.addContract(contract);
			
			
		}
		System.out.println("");
		System.out.print("Entre com mes e ano para calcular (MM/YYYY)");
		String monthAndYear = sc.next();
		int month =Integer.parseInt(monthAndYear.substring(0,2));
		int year =Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+ worker.getName());
		System.out.println("Departamento: "+ worker.getDepartments().getName());
		System.out.println("Totar ano" + monthAndYear +":"+ String.format("%.2f", worker.income(year, month)) );
		
		
		sc.close();
	}
}

