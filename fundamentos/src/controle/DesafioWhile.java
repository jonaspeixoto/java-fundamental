package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		// calcular a media da turma (não sabe quantos alunos tem)
		// usuario vai digitar nota 0 a 10
		// total = total + notavalida
		// quantas notasvalidas foram digitadas
		// para sai o usuario precisa digitar -1

		Scanner teclado = new Scanner(System.in);
		double media = 0;
		int notaValida = 0;
		double nota = 0;
		while (nota != -1) {
			System.out.println("Digite uma nota ou -1 para sair");
			nota = teclado.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("nota invalida");
			}

			else {
				media += nota;
				notaValida++;
			}
		}

		System.out.println(media / notaValida);
		teclado.close();
		
	}
}
