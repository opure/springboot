package com.design.factorymethod;

public class Main {
	public static void main(String[] args) {
		LoggerFactory factory = new DatabaseLoggerFactory();
		Logger logger = factory.createLogger();
		logger.writeLog();
	}
}
