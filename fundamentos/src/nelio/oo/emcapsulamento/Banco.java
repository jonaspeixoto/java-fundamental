package nelio.oo.emcapsulamento;

public class Banco {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	
	
	public Banco(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	

	public Banco(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	
	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getValorDeposito() {
		return saldo;
	}

	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= saque + 5.0;
	}
	
	


	

	
	
}
