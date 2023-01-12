package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Set<String> lista = new HashSet<>();
		Set<String> lista = new TreeSet<>();
		lista.add("1.2");
		lista.add("Ana");
		lista.add("Pedro");
		lista.add("xuca");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
