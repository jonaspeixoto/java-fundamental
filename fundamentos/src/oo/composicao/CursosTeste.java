package oo.composicao;

public class CursosTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("jonas");
		Aluno aluno2 = new Aluno("joao");
		Aluno aluno3 = new Aluno("josivania");
		
		Cursos curso1 = new Cursos("Java Completo");
		Cursos curso2 = new Cursos("Java web");
		Cursos curso3 = new Cursos("Java se");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos ) {
			System.out.println("Estou matriculado no de" + curso3.nome);
			System.out.println("e o meu nome é "+ aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(2).alunos);
		
		Cursos CursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		if(CursoEncontrado != null) {
			System.out.println(CursoEncontrado.nome);
			System.out.println(CursoEncontrado.alunos);
		}
	}
}
