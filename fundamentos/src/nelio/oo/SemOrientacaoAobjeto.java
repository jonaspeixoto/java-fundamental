package nelio.oo;

import java.util.Locale;
import java.util.Scanner;

public class SemOrientacaoAobjeto {
	public static void main(String[] args) {
		double xA, xB, xC, yA, yB, yC;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in the measures of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter in the measures of triangle X:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		
		double p = (xA + xB + xC)/2.0;
		double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC)/2.0;
		double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Trinagle X area: %.4f%n",areax);
		System.out.printf("Trinagle X area: %.4f%n",areay);
		
		if (areax > areay) {
			System.out.println("Maior area x");
		}
		else System.out.println("Maior area Y");
		
		sc.close();
	}
}
