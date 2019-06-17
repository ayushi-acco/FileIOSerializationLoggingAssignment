package ayushi1;
import java.io.*;
import java.util.logging.*;

public class logger {

	public static void main(String[] args)throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(logger.class.getName());
		FileHandler fh;
		  
		try {  

	        // This block configure the logger with handler and formatter  
			
	        fh = new FileHandler("C:\\Users\\ayushi.jain\\Desktop\\MS TRAINING\\mylog.log");  
	        log.addHandler(fh);
		
		log.severe("my severe message");
		 log.warning("my warning message");
		 log.info("my info message");
		 log.config("my config message");
		//Write Content
		
	}
		catch (SecurityException e) {  
	        e.printStackTrace();  
	    } 
	   
		log.info("this is my first log");

}
}
