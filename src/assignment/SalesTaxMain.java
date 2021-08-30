package assignment;

import java.util.*;

public class SalesTaxMain {
	public static void main(String[] args) {

		String productInfo = "";
		String answer = "N";
		StringExtractor str = new StringExtractor();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter Quantity ,Name & Price of Item");
			productInfo = sc.nextLine();
			System.out.println("Do you want to add more item? type 'y' or else 'n'.. (Don't press enter)");
			answer = sc.nextLine();
			str.processString(productInfo);

		} while (answer.equalsIgnoreCase("y"));

		if (!answer.isEmpty()) {
			str.calc_and_show();
		} else {
			System.out.println("Please restart program");
		}
	}

}
