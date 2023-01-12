package Enumeration.Oder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do cliente");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data de aniversario: ");
		Date dataAniversario = sdf.parse(sc.next());
		
		System.out.println("Entre com os dados do pedido");
		String status = sc.nextLine();
		
		Date dataAtual = new Date();
		
		Order order = new Order(dataAtual, OderStatus.valueOf("PENDING_PAYMENT"), 
				new Client(name, email, dataAniversario)); 
		
		
		System.out.println("Digite a quantidade de itens");
		int quantidade = sc.nextInt();
		for(int i = 0; i<quantidade;i++) {
			System.out.println("Digite o produto"+ i);
			sc.nextLine();			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("preço: ");
			double preco = sc.nextDouble();
			
			System.out.print("Qunatidade: ");
			int quant = sc.nextInt();
			
			OrderIntem oderItem = new OrderIntem(quant,preco, new Product(nome, preco));
			order.addItem(oderItem);
		}
		
		
		System.out.println(order);
//		System.out.println("ORDER SUMARY");
//		System.out.print("Order momment:");
//		System.out.print("Order status:");
//		System.out.print("Client:");
//		System.out.println("Order intems");
//		System.out.println();
		
		sc.close();
	}
}
