package emcapsulamento.challengefight;

import java.util.Scanner;

public class ChampionProgram {
	public static void main(String[] args) {
		Champion capeao1;
		Champion capeao2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão");
		System.out.print("nome:");
		String name = sc.nextLine();
		
		System.out.print("Vida inicial:");
		int life = sc.nextInt();
		
		System.out.print("ataque:");
		int attack = sc.nextInt();
		
		System.out.print("Armadura:");
		int armor = sc.nextInt();
		capeao1= new Champion(name, life, attack, armor);
		
		
		sc.nextLine();
		System.out.println("Digite os dados do segundo campeão");
		System.out.print("nome:");
		name = sc.nextLine();
		
		System.out.print("Vida inicial:");
		life = sc.nextInt();
		
		System.out.print("ataque:");
		attack = sc.nextInt();
		
		System.out.print("Armadura:");
		armor = sc.nextInt();
		capeao2 = new Champion(name, life, attack, armor);
		
		System.out.println("Darios:" + capeao1.getLife());
		System.out.println("Darios:" + capeao2.getLife());
		
		
		System.out.print("Quantos turnos voce deseja execultar?");
		int quantidade = sc.nextInt();
		int cont = 0;
		while(quantidade!=0) {
			if(capeao1.getLife() == 0 || capeao2.getLife() == 0) {
				System.out.println("FIM DE COMBATE");
				break;
			}
			else {
				System.out.println("Resultado do turno "+cont+"\n");
				capeao1.takeDamage(capeao2);
				capeao2.takeDamage(capeao1);
				
				System.out.println("Darios:" + capeao1.getLife());
				System.out.println("Fiora:" + capeao2.getLife());
			}
			cont++;
			quantidade--;
		}
		
		
		
		
		
		
		
		
		//System.out.printf("%s %d %d %d",name,life,attack,armor);
		
		sc.close();
	}
}
