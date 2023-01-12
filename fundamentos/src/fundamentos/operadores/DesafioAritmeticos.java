package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int a = (int) Math.pow((6 *(3 + 2)),2);
		int b = 3 * 2;
		
		double a2 = ((1-5)*(2-7))/2;
		a2 = Math.pow(a2, 2); 
		
		float r1 = a/b;
		
		System.out.println(r1);
		System.out.println(a2);
		
		int resultado =(int) Math.pow((r1 - a2),3)/(10*10*10);
		System.out.println(resultado);
		

	}
}
