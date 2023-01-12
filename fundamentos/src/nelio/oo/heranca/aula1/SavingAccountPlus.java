package nelio.oo.heranca.aula1;

public class SavingAccountPlus extends SavingsAccount{
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2 ;
	}
}
