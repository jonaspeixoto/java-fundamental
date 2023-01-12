package nelio.oo.interfacee.aplication1.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import nelio.oo.interfacee.aplication1.model.entities.CarRental;
import nelio.oo.interfacee.aplication1.model.entities.Vehicle;
import nelio.oo.interfacee.aplication1.model.services.BrazilTaxService;
import nelio.oo.interfacee.aplication1.model.services.RentalService;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("ddd/MM/yyyy HH:mm");
		
		System.out.println("Entre com rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.println("Pickup (dd/MM/yyyy hh:mm)");
		Date start = sdf.parse(sc.nextLine());
		System.out.println("Retunr (dd/MM/yyyy hh:mm)");
		Date Finish = sdf.parse(sc.nextLine());
		
		CarRental cr = new CarRental(start, Finish, new Vehicle(carModel));
		
		
		System.out.println("Enter price per hour:");
		double pricePerHour = sc.nextDouble();
		System.out.println("Enter price per day:");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE: ");
		System.out.println("Basic payment" + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax" + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment" + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		sc.close();
		
	}
}
