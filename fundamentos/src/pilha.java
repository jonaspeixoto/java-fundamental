import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		
		System.out.println(livros.poll());
		
	}
}
