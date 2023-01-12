package classe;

public class Data {
	int dia;
	String mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = "janeiro";
		ano = 1970;
	}
	
	Data(int dia, String mes, int ano ){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String retornaData() {
		
		//return (String.valueOf(dia)+" " + mes +" "+String.valueOf(ano));
		return String.format("%d %s %d", dia , mes ,ano);
	}
}
