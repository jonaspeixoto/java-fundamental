package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("jonas",-30);
		p1.setIdade(-40); // alterar o valor da variavel
		
		System.out.println(p1.getIdade()); // ler o valor
		System.out.println(p1.getNome());
		System.out.println(p1);
	} 
}
