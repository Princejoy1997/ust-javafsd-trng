package com.ust;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Sample {
	
	static Logger log = LogManager.getLogger(Sample.class.getName());
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
	}
}
