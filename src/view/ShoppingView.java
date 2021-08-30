package view;

import java.util.ArrayList;

import model.SalesModel;
import utils.Util;

public class ShoppingView {
	
	static double salesTax;
	public ShoppingView(double salesTax) {
		this.salesTax = salesTax;
	}

	public static void billDetails(ArrayList<SalesModel> sales) {

		double amount = 0;
	
		for (SalesModel product : sales) {
			System.out.println(product.quantity + " " + product.description + ": " + product.price);

			amount = amount + product.price;
		}
		
		
		System.out.println("Sales Taxes: " + salesTax);

		System.out.println("Total: " + Util.roundOff(amount));

	}
}
