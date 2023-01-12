package Enumeration.Oder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment;
	private OderStatus status;
	
	private Client client;
	private List<OrderIntem> itens = new ArrayList<>();
	
	
	public Order(Date moment, OderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OderStatus getStatus() {
		return status;
	}


	public void setStatus(OderStatus status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public List<OrderIntem> getOrderItem() {
		return itens;
	}

	void addItem(OrderIntem iten) {
		itens.add(iten);
	}
	
	void removeIten(OrderIntem iten) {
		itens.remove(iten);
	}
	
	public double total() {
		double sum = 0 ;
		for (OrderIntem order: itens) {
			sum += order.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Ordeer moment:" +moment);
		sb.append("Order Status:" +status +"\n");
		sb.append("Client" + client.getName() + " "+ client.getBirthDate() 
		+ "" +client.getEmail()+ "\n");
		
		sb.append("Order items: \n");
		
		for (OrderIntem item: itens) {
			sb.append(item);
			sb.append("\n");
		}
		sb.append("Total : " +total());
		return sb.toString();
	}
	
}
