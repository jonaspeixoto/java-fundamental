package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		Ferrari carro1 = new Ferrari(200);
		Carro carro2 = new Civic();
		
		carro1.acelerar();
		System.out.println(carro1);
		carro1.ligarTurbo();
		
		
		carro1.acelerar();
		System.out.println(carro2);
		
		carro2.acelerar();
		System.out.println(carro2);
		
		

		
	}
	
	

}
