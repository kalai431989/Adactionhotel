package com.FebProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_run {

	public static Logger logg=Logger.getLogger(Logger_run.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		logg.debug("Debug");
		logg.info("Info");
		logg.warn("warn");
		logg.error("Error");
		logg.fatal("Fatal");
	}
}
