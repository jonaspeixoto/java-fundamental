package nelio.oo.exercicio.funcionario;

public class Funcionario {
	String name; 
	double grossySalary;
	double tax;
	
	double salarioLiquido() {
		return grossySalary - tax;
	}
	
	void aumentarSalario(double tax) {
		grossySalary+= grossySalary *(tax);
	}
	
	public  String toString() {
		return "Nome " + name
				+" tem o salario bruto de"+ grossySalary
				+ " Porem com o desconto de " + tax 
				+ " fica de " + salarioLiquido();
				
	}
}
