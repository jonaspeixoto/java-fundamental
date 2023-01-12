package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo calculo = new Soma();
		
		System.out.println(calculo.execultar(2, 3));
		
		calculo= new Mutiplicar();
		System.out.println(calculo.execultar(2, 3));
	}
}
