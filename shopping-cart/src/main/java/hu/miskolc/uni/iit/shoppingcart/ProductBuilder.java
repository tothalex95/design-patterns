package hu.miskolc.uni.iit.shoppingcart;

import java.util.Set;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductBuilder {

	private static ProductBuilder instance;

	private String name;

	private double price;

	private Set<Product> products;

	public static ProductBuilder getInstance() {
		if (instance == null) {
			instance = new ProductBuilder();
		}
		return instance;
	}

	public Product build() {
		if (products == null) {
			return new ConcreteProduct(name, price);
		}
		return new ShoppingCart(products);
	}

}
