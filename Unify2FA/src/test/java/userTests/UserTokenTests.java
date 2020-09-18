package userTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseInitialization.BaseClass;

import userPages.UserHomePage;
import userPages.UserLoginPage;
import userPages.UserTokenPage;

public class UserTokenTests extends BaseClass {

	UserLoginPage ulp;
	UserHomePage uhp;
	UserTokenPage utp;
	@BeforeMethod
	public void registrationT() throws Exception {  

	BrowserLaunch();

	ulp= new UserLoginPage(driver);

	uhp=ulp.loginpageMethod(prop.getProperty("username"), prop.getProperty("userpassword"));

	utp= new 	UserTokenPage(driver);


	}

	@Test(priority=0)
	public void newtokencreationTest() throws Exception{
		
		utp.tokencreationmethod(prop.getProperty("userpassword"),prop.getProperty("userpassword"));
	//expectedltokenvalue= tp.actualtokenqrserialno();
	//actualtokenvalue="TOTP0008DACD";

	//System.out.println(expectedltokenvalue);

	//assertEquals(actualtokenvalue, expectedltokenvalue);

	}
}
