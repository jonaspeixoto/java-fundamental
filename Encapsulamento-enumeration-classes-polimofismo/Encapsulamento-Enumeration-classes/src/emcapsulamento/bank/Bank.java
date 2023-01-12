package emcapsulamento.bank;

public class Bank {
	private int account;
	private String name;
	private double ballance;
	
	
	public Bank(int account, String name, double initaildeposit) {
		this.account = account;
		this.name = name;
		this.ballance = deposito(initaildeposit);
	}
	
	public Bank(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	
	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBallance() {
		return ballance;
	}


	double deposito(double deposito) {
		return this.ballance += deposito;
	}
	
	double withdraw(double saque) {
		return this.ballance -= (saque + 5);
	}
	
	public String toString() {	
		return "Acconut data\nAccount " + account +", nome " +name + ", Ballance $" + ballance;
	}
	
	
	
}
