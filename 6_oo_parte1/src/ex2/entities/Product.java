package ex2.entities;

public class Product{
	public String name;
	public double price;
	public int quantity;

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