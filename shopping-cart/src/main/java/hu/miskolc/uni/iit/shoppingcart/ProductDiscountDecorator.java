package hu.miskolc.uni.iit.shoppingcart;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductDiscountDecorator implements Product {

	private int discount;

	private Product product;

	@Override
	public double getPrice() {
		return (100 - discount) / 100.0 * product.getPrice();
	}

}
