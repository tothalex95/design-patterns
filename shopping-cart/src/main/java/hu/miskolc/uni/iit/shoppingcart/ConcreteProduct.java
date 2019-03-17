package hu.miskolc.uni.iit.shoppingcart;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ConcreteProduct implements Product {

	private String name;

	private double price;

}
