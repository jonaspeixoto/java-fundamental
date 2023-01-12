package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> lang = Stream.of("java ", "Lua ", "JS\n");
		lang.forEach(print);
		
		String[] mainlang = {"python", "Lisp","Perl\n"};
		
		Stream.of(mainlang).forEach(print);
		Arrays.stream(mainlang).forEach(print);
		Arrays.stream(mainlang, 1, 3).forEach(print); // pega do elemento 1 ao 3 mais nao inclue o 3
		
		List<String> outrasLang = Arrays.asList("C ", " PHP",  " kotlin\n");
		outrasLang.stream().forEach(print);
		
		//Stream.generate(()-> "a" ).forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(print);
		
	}
}
