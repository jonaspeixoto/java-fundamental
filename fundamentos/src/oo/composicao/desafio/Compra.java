package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens = new ArrayList<>();
	
	
	void adicionarItem(Produto p,int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
