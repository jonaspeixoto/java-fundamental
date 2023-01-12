package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		double media = 4.6;
		String resusltadoRecuperacao = media >= 5.0 ? "em Recumperação" : "Reprovado"; 
		String resultado = media >= 7.0 ? "Aprovado" : resusltadoRecuperacao;
		
		System.out.println("O aluno está " + resultado);
	}
}
