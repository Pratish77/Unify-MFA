package baseInitialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    File file;
    public static WebDriver driver;
    
    public static Properties prop;
    
    static   String url ;
   
   protected BaseClass(){
 	//FileInputStream file = New FileInputStream("C:\\Users\\UNIFY\\Desktop\\Wellzio_Mobile\\Config.properties");
 	
 	        file = new File("/home/unify/Documents/config.properties");
 		  
 			FileInputStream fileInput = null;
 			try {
 				fileInput = new FileInputStream(file);
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
 			 prop = new Properties();
 			
 			//load properties file
 			try {
 				prop.load(fileInput);
 			} catch (IOException e) {
 				e.printStackTrace();
 			}
    }
	public static void BrowserLaunch() {
		
		url="https://mfa.unify.digital/#" ;
		 
	   System.setProperty("webdriver.gecko.driver", "/home/unify/geckodriver");
 	  
	  driver= new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
 	   driver.get(url);
	    	 
	    	 
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }
	
	public static void closeBrowser() {
		
		
		driver.close();
	}
		
}
