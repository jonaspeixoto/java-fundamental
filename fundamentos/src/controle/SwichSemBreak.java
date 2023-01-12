package controle;

public class SwichSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("Sei o Bassai");
		case "amarela":
			System.out.println("Sei o Tekki shodan");
		//default:
			//System.out.println("Não sei de nada");
		}
	}
}
