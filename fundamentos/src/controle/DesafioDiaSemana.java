package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		System.out.println("Digite o dia da semana");
		Scanner teclado = new Scanner(System.in);
		String dia = teclado.next();
		int numeroDia = 0;
		if (dia.equals("domingo")) {
			numeroDia = 1;
		}
		else if (dia.equalsIgnoreCase("segunda")) {
			numeroDia = 2;
		}
		else if (dia.equalsIgnoreCase("terça")) {
			numeroDia = 3;
		}
		else if (dia.equalsIgnoreCase("quarta")) {
			numeroDia = 4;
		}
		else if (dia.equalsIgnoreCase("quinta")) {
			numeroDia = 5;
		}
		else if (dia.equalsIgnoreCase("sexta")) {
			numeroDia = 6;
		}
		else if (dia.equalsIgnoreCase("sabado")) {
			numeroDia = 7;
		}
		

		System.out.printf("O dia %s corresponde ao dia %d",dia, numeroDia);
		teclado.close();
	}
}
