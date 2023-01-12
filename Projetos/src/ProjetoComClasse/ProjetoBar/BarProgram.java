package ProjetoComClasse.ProjetoBar;

import java.util.Locale;
import java.util.Scanner;

public class BarProgram {
	public static void main(String[] args) {
		char gender;
		int qtBeer;
		int qtBarbecue;
		int qtSoftDrink;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("sexo:");
		gender = sc.next().charAt(0);
		
		System.out.print("quantidade de cerveja:");
		qtBeer = sc.nextInt();	
		
		System.out.print("quantidade de refrigerantes:");
		qtSoftDrink = sc.nextInt();	
		
		System.out.print("quantidade de churasco:");
		qtBarbecue = sc.nextInt();
		
		Bill bill = new Bill(gender, qtBeer, qtBarbecue, qtSoftDrink);		
		
		System.out.println(bill);
		
		//System.out.printf("%s %d %d", gender, qtBeer , qtBarbecue);
		sc.close();
	}
}
