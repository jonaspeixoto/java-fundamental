package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// se Trabalho 1  deu certo comprar tv 32"
		// se os dois deram  certo comprar tv 52"
		// se algum dos dois deram certo ir ao shopping e tomar sovert
		// se os dois dera errado familia fica em casa
		// nao tomou sorvet // familia mais saudável 
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean UmtrabalhoCerto = (trabalho1 ^ trabalho2); 
		boolean doistrabalhoCerto = (trabalho1 & trabalho2);
		boolean algumCerto = (trabalho1 || trabalho2);
		System.out.printf("Comprou tv de 32' %s", UmtrabalhoCerto);
		System.out.printf("\nComprou tv de 52' %s", doistrabalhoCerto);
		System.out.printf("\nTomou sorvete' %s", algumCerto);
		System.out.printf("\nFicou com fome' %s", !algumCerto);
		
		
		
	}

}
