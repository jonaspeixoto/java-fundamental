package ProjetoComClasse.ProjetoBar;

public class Bill {
	char gender;
	int beer;
	int barbecue;
	int softDrinks;

	
	public Bill(char gender, int beer , int barbecue, int softDrinks) {
		this.gender = gender;
		this.barbecue =barbecue;
		this.softDrinks =softDrinks;
		this.beer = beer;
	}
	
	double feeding() {
		return this.beer*5 + this.barbecue*7 + this.softDrinks*3;
	}

	double ticket() {
		 if(this.gender == 'f' || this.gender == 'F') {
			 return 8;
		 }
		 else {
			 return 10;
		 }
		 
	 }
	double cover() {
		if(feeding() < 30) {
			return 4.00;
		}
		else {
			return 0;
		}
	}
	double total() {
		return ticket() + cover() + feeding() ;
	}
	
	public String toString() {
		return "\n\nRelatorio \n" + "Consumo = R$ "+ feeding()
		+ "\nCouvert = R$ "+ cover()
		+  "\nIngresso = R$ "+ cover()
		+ "\n \n" +"Valor a pagar = R$ " +total();
	}

}
