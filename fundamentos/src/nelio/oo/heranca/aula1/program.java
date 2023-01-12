package nelio.oo.heranca.aula1;

public class program {
	public static void main(String[] args) {
		Acoount acc1 = new Acoount(1001, "Alex", 1000.0);
		
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		
		Acoount acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		Acoount acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.00);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
		
	}
	
	
	
}
