package entities;

public class Product {
	

	private String name;
	private Double price;
	private Integer quantity;
	
	private Sales sale;
	private SalesItem salesItem;
	
	public Product() {};
	
	

	public Product(String name, Double price, Integer quantity, Sales sale, SalesItem salesItem) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.sale = sale;
		this.salesItem = salesItem;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Sale number: " + sale.getSaleNumber()
		+ "\nProduct id: " + salesItem.getItemId()
		+ "\nProduct name: " + getName()
		+ "\nPrice: " + getPrice()
		+ "\nQuantity : " + getQuantity();
		
	}
}
