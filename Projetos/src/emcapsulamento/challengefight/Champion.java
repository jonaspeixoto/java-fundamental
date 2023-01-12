package emcapsulamento.challengefight;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int damager) {
		if(life < damager) {
			this.life = 0;
		}
		else
		this.life -=damager ;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion oponent) {
		if(oponent.attack < armor) {
			setLife(1);
		}else {
//			System.out.println("Entrei no else tenho ataque " + attack + "e a armadura do meu oponente é "+oponent.armor);
			int damager = Math.abs(oponent.attack - armor);
			setLife(damager);			
		}
	}
	

//	public String toString() {
//	
//	}
	
	
	
}
