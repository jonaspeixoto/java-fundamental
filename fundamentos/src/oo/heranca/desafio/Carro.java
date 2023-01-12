package oo.heranca.desafio;

public class Carro {
	final int VELOCIDADEMAXIMA;
	int velocidadeAtual = 0;
	int delta = 5;
	protected Carro(int velocidademaxima) {
		VELOCIDADEMAXIMA = velocidademaxima;
	}
	
	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		}
		else {
			this.velocidadeAtual += delta;			
		}
		
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}
		else {
			velocidadeAtual = 0;
		}
	}
	public String toString() {
		return "Velocidade atual é "+ velocidadeAtual +"Km/h";
	}
}
