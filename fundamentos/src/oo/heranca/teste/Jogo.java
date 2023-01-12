package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Mostro;

public class Jogo {
	public static void main(String[] args) {
		Mostro montro = new Mostro();
		
		montro.x = 10;
		montro.y = 10;

		
		Heroi heroi = new Heroi(10,11);
		
		
		
		System.out.println(montro.vida);
		System.out.println(heroi.vida);
		
		montro.atacar(heroi);
		heroi.atacar(montro);
		
		montro.atacar(heroi);
		heroi.atacar(montro);
		
		System.out.println("Monstro tem " +montro.vida);
		System.out.println("Heroi tem " +heroi.vida);
	}
}
