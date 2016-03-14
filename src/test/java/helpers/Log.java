package helpers;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName());

	public static void startTestCase(String sTestCaseName){
		Log.info("Started Test case");
	}


	public static void endTestCase(String sTestCaseName){
		Log.info("Ended Test Case");
	}

	public static void info(String message)
	{
		PropertyConfigurator.configure("log4j.xml");
		//BasicConfigurator.configure();
		Log.info(message);
	}
}