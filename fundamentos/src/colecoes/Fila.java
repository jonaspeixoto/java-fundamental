package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add > adiciona elemento na fila, 
		// Diferencia é o comportamento quando a fila está cheia
		fila.add("Anna");
		fila.offer("Bia");
		fila.offer("jonas");
		fila.offer("teo");
		fila.offer("wesley");
		
		System.out.println(fila.peek()); // primeiro elemento da lista
		System.out.println(fila.poll()); // retorna o elemento da fila já removendo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
	
}
