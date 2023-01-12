package nelio.oo.enume;

import java.util.Date;

public class Program {
	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDIG_PAYMENT);
		
		
		OrderStatus os1 = OrderStatus.DEVILERED;
		
		OrderStatus os1 = OrderStatus.valueOf("DEVILERED");
		
		System.out.println(order);
	}
}
