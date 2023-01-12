package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calc = (x, y) ->{
			return x + y;
		};
		
		System.out.println(calc.execultar(1, 2));
		
		calc = (x, y) -> x * y;
		
		System.out.println(calc.execultar(1, 2));
	}
}
