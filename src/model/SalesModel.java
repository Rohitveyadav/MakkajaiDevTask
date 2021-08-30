package model;

public class SalesModel {
	
	public String description;
	public int quantity;
	public double price;
	
	public SalesModel(String description,int quantity, double price)
	{
		this.description =  description;
		this.quantity =  quantity;
		this.price =  price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}