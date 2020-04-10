package MyMavenGroupID.MyMavenProjectName;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.logging.LogManager;

import org.apache.commons.math3.analysis.function.Log;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;


public class UniqueTest {
	


	//static Logger log = Logger.getLogger(UniqueTest.class);
	//Logger logger = Logger.getLogger(this.getClass());
	//String log4JPropertyFile = "/Users/ajeetpratapsingh/git/ReporHub1/MyMavenProjectName/src/main/resources/log4j.properties";
	
	
	private static Logger logger = Logger.getLogger(UniqueTest.class);
	
	


	

@Test
public void joker() {

	
	
	
	System.out.println("Test print here ...");
	logger.info("Test Logging.... Ajeet");
	//private static Logger log = LogManager.getLogger(UniqueTest.class.getName());
	//log.error("This is error method");
	logger.info("This is Info Method");
	//log.debug("This is debug");
	//log.fatal("This is Fatal");
}

@Test
public void joker1() {
	System.out.println("regression 2 ...");
    
}

@Test
public void joker2() {
	System.out.println("regression3 ...");
}
	
}
