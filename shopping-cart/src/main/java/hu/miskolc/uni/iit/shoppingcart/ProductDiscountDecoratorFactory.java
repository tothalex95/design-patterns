package hu.miskolc.uni.iit.shoppingcart;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductDiscountDecoratorFactory {

	private static ProductDiscountDecoratorFactory instance;

	public static ProductDiscountDecoratorFactory getInstance() {
		if (instance == null) {
			instance = new ProductDiscountDecoratorFactory();
		}
		return instance;
	}

	public ProductDiscountDecorator getProductDiscountDecorator(int discount, Product product) {
		return new ProductDiscountDecorator(discount, product);
	}

}
