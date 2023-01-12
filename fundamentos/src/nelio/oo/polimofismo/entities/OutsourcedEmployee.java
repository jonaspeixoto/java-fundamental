package nelio.oo.polimofismo.entities;

public class OutsourcedEmployee extends Employer{
	
	private Double additionalCharger;
	
	
	public OutsourcedEmployee() {
		super();
	}
	
	
	
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, Double additionalCharger) {
		super(name, hours, valuePerHour);
		this.additionalCharger = additionalCharger;
	}



	public Double getAdditionalCharger() {
		return additionalCharger;
	}



	public void setAdditionalCharger(Double additionalCharger) {
		this.additionalCharger = additionalCharger;
	}
		
	@Override
	public double payments() {
		return super.payments() + this.additionalCharger * 1.1; 
	}
	
}
