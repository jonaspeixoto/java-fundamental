package nelio.oo.polimofismo.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import nelio.oo.polimofismo.entities.Employer;
import nelio.oo.polimofismo.entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employer> list = new ArrayList<Employer>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Empoyee #"+ i+" data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours : ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valePerHours = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valePerHours, additionalCharge));
			}
			else {
				Employer emp = new Employer(name, hours, valePerHours);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for(Employer emp: list) {
			System.out.println(emp.getName()+ " $ " +String.format("%.2f", emp.payments()));
		}
		
		sc.close();
	}
}


