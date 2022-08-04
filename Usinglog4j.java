package Logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Usinglog4j {
	static Logger log=Logger.getLogger(Usinglog4j.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Logging information");
		log.error("Logging error");
		log.fatal("Logging information is critical");//critical error
		log.warn("Logging warning");
		log.debug("Information debug");
		
		int num1=10;
		int num2=0;
		try {
			System.out.println(num1/num2);
		}
		catch(Exception e){
			log.error("Dont divide any number by using Zero", e);
			
		}
	}

}
