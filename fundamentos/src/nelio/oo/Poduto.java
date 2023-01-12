package nelio.oo;

import java.util.jar.Attributes.Name;

import oo.composicao.desafio.Produto;

public class Poduto {
	String nome;
	double preco;
	int quantidade;
	
	Poduto(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	
	public String retorno() {
		return "Total"+ preco*quantidade;
	}
	
	public void addProducts(int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void removeProducts(int quantidade) {
		this.quantidade -= quantidade; 
	}
	
	public String toString() {
		return nome +", $ "+ preco +", "+quantidade+" units , Total : $" +retorno();
	}
	
}
