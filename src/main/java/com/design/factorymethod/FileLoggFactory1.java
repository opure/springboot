package com.design.factorymethod;

public class FileLoggFactory1 extends LoggerFactory1 {

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		return new FileLogger();
	}

}
