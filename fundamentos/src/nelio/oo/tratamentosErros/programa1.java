package nelio.oo.tratamentosErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class programa1 {
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("end program");
	}
	
	public static void method1() {
		System.out.println(" Metodo1 start");
		method2();
		System.out.println("Fim metodo 1");
	}
	
	public static void method2() {
		
		System.out.println(" Metodo2 start");
		Scanner sc = new Scanner(System.in);
		
		
	try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid position");
		e.printStackTrace();
		sc.next();;
		
	}
	catch(InputMismatchException e ) {
		System.out.println("input error");
	}
	
		
		sc.close();
	}
}

