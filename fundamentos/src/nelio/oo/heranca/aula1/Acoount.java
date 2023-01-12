package nelio.oo.heranca.aula1;

public class Acoount {
	private Integer number;
	private String holder;
	protected double balance;
	
	
	public Acoount() {
		
	}
	
	public Acoount(Integer number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	
	
}
