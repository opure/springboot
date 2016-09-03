package com.design.factorymethod;

public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		return new DatabaseLogger();
	}

}
