package tests;
import org.testng.annotations.BeforeMethod;
import baseInitialization.BaseClass;
import pages.HomePage;
import pages.Loginpage;

public class HomePageTests extends BaseClass{

	static Loginpage lp;
	
	String usercreationverifytext;
	HomePage hp;
@BeforeMethod
public void registrationT() throws Exception {  

BrowserLaunch();

lp= new Loginpage(driver);

hp =  lp.loginpageMethod(prop.getProperty("username"), prop.getProperty("password"));


}

	} 
		

	

	
	