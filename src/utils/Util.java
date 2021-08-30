package utils;

import java.util.ArrayList;
import java.util.Arrays;

import assignment.SalesTaxMain;

public class Util {
	// range of categories to not apply sales tax
	static String[] values = { "books", "book", "chocolate", "chocolates", "milk", "headache pills", "chocolatebox" };

	// range of categories to not apply sales tax
	static double salesTax = 0;
	public static boolean validateText(String product) {

	
		  if(product.toLowerCase().contains("books") ||
				  product.toLowerCase().contains("chocolates") || 
				  product.toLowerCase().contains("headache pills"))
	        {
	            return true;
	        }
	        else
	        {
	           	return false;
	        }
	
	}

	public static double applyInterestRate(int qty, double price, int interestRate) {

		double finalresult = qty * (price + (price * interestRate) / 100);
		finalresult = roundOff(finalresult);
		return finalresult;
	}
	
	
	public static double calcTotalInterest(int qty, double salesAmount, int interestRate) {
		
		double finalresult = qty * ((salesAmount * interestRate) / 100);
		finalresult = roundOff(finalresult);
		salesTax += finalresult;
		return salesTax;
	}

	public static double roundOff(double amount) {
		return Math.round(amount * 100.0) / 100.0;
	}

}
