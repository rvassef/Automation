package demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);


	public static void main(String[] args) {
		System.out.println("\n  Hello World...!   \n");
		
		logger.info("This is information Message");
		logger.error("This is an error");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal");
		
		System.out.println("\n  Completed");
		
	}		


}
