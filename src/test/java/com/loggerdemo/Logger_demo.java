package com.loggerdemo;

import org.apache.log4j.Logger;

public class Logger_demo {

	public static Logger logg=Logger.getLogger(clazz);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug");
		log.info("Info");
		log.warn("warn");
		log.error("Error");
		log.fatal("Fatal");
	}
}
