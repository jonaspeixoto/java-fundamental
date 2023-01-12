package colecoes;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("anna");
		lista.add(u1);
		lista.add(new Usuario("carlos"));
		lista.add(new Usuario("Matheus"));
		lista.add(new Usuario("Roger"));
		
		System.out.println(lista.get(3)); // Acessar pelo indice
		
		lista.remove(1);
		lista.remove(new Usuario("Roger"));
		
		System.out.println(lista.contains(new Usuario("anna")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}
}
