package nelio.oo.polimofismo.entities;

public class Employer {
	private String name;
	private Integer hours;
	private double valuePerHour;
	
	
	public Employer() {
		
	}
	
	public Employer(String name, Integer hours, double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}


	public double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	
	public double payments() {
		return this.hours * this.valuePerHour;
	}
	
	
	
}
