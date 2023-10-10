package ex.entities;

public class Product{
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if(price < 0 || price > 5000.0)
			throw new Exception("Price must be positive and less than $ 5,000.0");
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		
		return String.format("Product data: %s, $ %.2f, %d units, Total: % .2f%n%n",
				          name, price, quantity, totalValueInStock());
	}
}