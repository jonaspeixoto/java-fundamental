import java.util.Iterator;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos ? ");
		int QtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double[QtdeAlunos][qtNotas];
		
		double total = 0; 
		
			for (int i = 0; i < notasDaTurma.length; i++) {
				for (int j = 0; j < notasDaTurma[i].length; j++) {
					System.out.printf("Informe a nota %d do aluno %d", j , i);
					
					notasDaTurma[i][j] = entrada.nextDouble(); 
					total += notasDaTurma[i][j];
				}
			}
			double media = total/ (QtdeAlunos * qtNotas);
			
			System.out.println(media);
		entrada.close();
	}
}
