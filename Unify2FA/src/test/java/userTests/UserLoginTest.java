package userTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseInitialization.BaseClass;
import pages.Loginpage;

public class UserLoginTest extends BaseClass{
	 
		static Loginpage lp;
		String actualtitle;
		String expected;
		
		String actualurl;
		
		String expectedurl;

		UserLoginTest() {
			super();
			
		}
	@BeforeMethod

		public void registrationT() {  
		
		BrowserLaunch();
		
	    lp= new Loginpage(driver);
		
	}
	@Test(priority=1)
	public void titleTest() {
		
	     actualtitle="unify-2fa";
		
		expected=lp.pagetitle();
		
		assertEquals(actualtitle, expected);
		
		System.out.println("Title test has been successfully passed");
	}

	@Test(priority=2)
		public void loginTest() throws Exception {
		
		lp.loginpageMethod(prop.getProperty("username"),prop.getProperty("userpassword"));
		
		Thread.sleep(5000);
		
		expectedurl=driver.getCurrentUrl();
		
		System.out.println(expectedurl);
		
		actualurl="https://mfa.unify.digital/#!/token/list";
		
		assertEquals(actualurl, expectedurl);
		
		System.out.println("admin has been successfully logged into the application");
	    }
	@Test(priority=3)
	public void invalidloginTest() throws Exception{
		
		lp.loginpageMethod(prop.getProperty("invalidusername"),prop.getProperty("invaliduserpassword"));
		
	     expectedurl=driver.getCurrentUrl();
		
		actualurl="https://mfa.unify.digital/#";
		
		assertEquals(actualurl, expectedurl);
		
		System.out.println("admin login attempt has been unsuccesful");
		
	}
	@AfterMethod
	public void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.close();
		
	}
}


