package nelio.oo.vetores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TesteEmployeer {
	public static void main(String[] args) {
		ArrayList <Emplyee> lista = new ArrayList<>();
		Emplyee f1;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a quantidades de numeros");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			System.out.println("Digite o id do funcionario");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("digite o nome do funcionario");
			String nome = sc.nextLine();
			
			System.out.println("digite o salario");
			double salario = sc.nextDouble();
			
			lista.add(new Emplyee(id, nome, salario));
			
			
		}
		
		System.out.println("Qual o id do fucionario que recebera aumento");
		int id = sc.nextInt();
		System.out.println("Quantos por cento será aumentado?");
		int aumento = sc.nextInt();
		
		for (Emplyee emplyee : lista) {
			if(emplyee.getId() == id) {
				emplyee.aumentarPorcentagem(aumento);
			}
		}
		
		for (Emplyee emplyee : lista) {
			System.out.println(emplyee);
		}
		sc.close();
	}
}

