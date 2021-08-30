package assignment;

import java.util.ArrayList;

import model.SalesModel;
import utils.Util;
import view.ShoppingView;

public class StringExtractor {

	String productDetail;
	ShoppingView shop;

	ArrayList<SalesModel> item = new ArrayList<SalesModel>();

	void processString(String productDetail) {
		int productquantity = Integer.parseInt(productDetail.substring(0, productDetail.indexOf(" ")));

		Double productprice = Double.parseDouble(productDetail.substring(productDetail.lastIndexOf(" ") + 1));

		String productdescription = productDetail.replaceAll("[0-9]", "").replaceAll("[.]", "")
				.replaceAll("\\bat\\b", "").trim();

		if (!Util.validateText(productdescription)) {

			double salesTax = Util.calcTotalInterest(productquantity, productprice, 15);
			new ShoppingView(salesTax);
			item.add(new SalesModel(productdescription, productquantity,
					Util.applyInterestRate(productquantity, productprice, 15)));

		} else {
			double salesTax = Util.calcTotalInterest(productquantity, productprice, 5);
			new ShoppingView(salesTax);
			item.add(new SalesModel(productdescription, productquantity, Util.applyInterestRate(productquantity, productprice, 5)));

		}

	}

	void calc_and_show() {
		
		ShoppingView.billDetails(item);
		
	}

}
