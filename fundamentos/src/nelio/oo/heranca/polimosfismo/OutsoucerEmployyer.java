package nelio.oo.heranca.polimosfismo;

public class OutsoucerEmployyer extends Employee {
	private Double additionalCharge;

	
	public OutsoucerEmployyer() {
		super();
	}
	public OutsoucerEmployyer(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	
	
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge*1.1;
	}
	
	
	
	
}
