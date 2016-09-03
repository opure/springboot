package com.design.simpleFactory;

public class Main {
	public static void main(String[] args) {
		Product aProduct = Factory.bulidProduct("a") ;
		aProduct.doSomething();
	}
}
