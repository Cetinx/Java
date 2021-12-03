package nLayeredDemo.core.concretes;

import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdaptrr implements  LoggerService{

	@Override
	public void logSy(String message) {
		
	
		JLoggerManager manager = new JLoggerManager();
		
		manager.log(message);
	
		System.out.println(message);
		
	
		
		
	}

}
