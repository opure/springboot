package com.design.factorymethod;

public abstract class LoggerFactory1 {
	public abstract Logger createLogger();
	public void writeLog() {
		Logger factroy = this.createLogger();
		factroy.writeLog();
	}
}
