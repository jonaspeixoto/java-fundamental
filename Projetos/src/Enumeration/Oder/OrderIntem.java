package Enumeration.Oder;

public class OrderIntem {
	private Integer quantily;
	private Double price;
	
	private Product produc;
	
	public OrderIntem() {
		
	}

	public OrderIntem(Integer quantily, Double price, Product produc) {
	this.quantily = quantily;
	this.price = price;
	this.produc = produc;
}

	public Product getProduc() {
		return produc;
	}

	public void setProduc(Product produc) {
		this.produc = produc;
	}

	public Integer getQuantily() {
		return quantily;
	}

	public void setQuantily(Integer quantily) {
		this.quantily = quantily;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return quantily*price;
	}
	 public String toString() {
		 return produc.getName()
				 +", $"
				 + String.format("%.2f", price)
				 +", Quantidade"
				 + quantily
				 +", SubTotal: $"
				 + String.format("%.2f", subTotal());
	 }
	
	
}
