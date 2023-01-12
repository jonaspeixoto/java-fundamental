package oo.heranca.desafio;

public class Ferrari extends Carro implements Exportivo {
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
	@Override
	public void ligarTurbo() {
		delta = 25;
		
	}
	@Override
	public void desligarTurbo() {
		delta = 15;
	}
	
 @Override
public void acelerar() {
	velocidadeAtual += 100;
 }
}
