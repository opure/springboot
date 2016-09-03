package com.design.simpleFactory;

public class Factory {
	public static Product bulidProduct(String types) {
		if (types.equals("a")) {
			return new ProductA();
		} else  {
			return new ProductB();
		} 
	}
}
