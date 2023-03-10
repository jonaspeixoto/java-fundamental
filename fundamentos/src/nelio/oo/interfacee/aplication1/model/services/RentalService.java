package nelio.oo.interfacee.aplication1.model.services;

import nelio.oo.interfacee.aplication1.model.entities.CarRental;
import nelio.oo.interfacee.aplication1.model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinsh().getTime();
		double hours = (double) (t2 - t1)/1000 / 60/ 60;
		
		double basicPayments;
		if(hours <=12.00) {
			basicPayments = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayments = Math.ceil(hours/24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayments);
		
		carRental.setInvoice(new Invoice(basicPayments, tax));
	}
	
	
}
