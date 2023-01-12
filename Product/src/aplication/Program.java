package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int numberProduct = sc.nextInt();
		
		sc.nextLine();
		for(int i = 1; i <= numberProduct; i++) {
			System.out.println("Product "+ i +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("price : ");
			double price = sc.nextDouble();
			if(ch == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			}
			else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date dateManufacture = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, dateManufacture);
				list.add(product);
			}
			else {
				System.out.print("Customs fee : ");
				double Customsfee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, Customsfee);
				list.add(product);
			}
			
			
		
			
		}
		
		for (Product product: list) {
			System.out.println(product.priceTag());
			
		}
		
		sc.close();
		
	}
}
