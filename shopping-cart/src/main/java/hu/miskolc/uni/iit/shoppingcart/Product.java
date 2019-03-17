package hu.miskolc.uni.iit.shoppingcart;

public interface Product {

	double getPrice();

	default void addProduct(Product product) {
		throw new UnsupportedOperationException();
	}

	default void removeProduct(Product product) {
		throw new UnsupportedOperationException();
	}

}
