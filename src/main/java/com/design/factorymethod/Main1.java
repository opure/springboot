package com.design.factorymethod;

public class Main1 {
	public static void main(String[] args) {
		LoggerFactory1 factory1 = new FileLoggFactory1();
		factory1.writeLog();
	}
}
