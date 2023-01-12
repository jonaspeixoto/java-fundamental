package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14;
	
	AreaCirc(double RaioInicial) {
		raio = RaioInicial;
	}
	
	double area() {
		return raio * raio * PI;
	}
}
