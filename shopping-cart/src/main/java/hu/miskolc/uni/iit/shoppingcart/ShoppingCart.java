package hu.miskolc.uni.iit.shoppingcart;

import java.util.Set;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ShoppingCart implements Product {

	private final Set<Product> products;

	@Override
	public double getPrice() {
		return products.stream().mapToDouble(Product::getPrice).sum();
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public void removeProduct(Product product) {
		products.remove(product);
	}

}
