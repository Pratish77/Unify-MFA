package tests;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseInitialization.BaseClass;
import pages.HomePage;
import pages.Loginpage;
import pages.TokensPage;
import pages.UsersPage;


public class TokensfunctionalityTests extends BaseClass { 

	
	
	
static Loginpage lp;
	
	String usercreationverifytext;
	
	HomePage hp;
	
	TokensPage tp;
	String expectedltokenvalue;
	String actualtokenvalue;
	UsersPage up;
	String expectedtoken;
	String actual;
	
	String expected;
@BeforeMethod
public void registrationT() throws Exception {  

BrowserLaunch();

lp= new Loginpage(driver);

hp=lp.loginpageMethod(prop.getProperty("username"), prop.getProperty("password"));

tp= hp.tokenspagenavigation();


}

@Test(priority=0)
public void newtokencreationTest() throws Exception{
	
	tp.tokencreationtextfields(prop.getProperty("tokendescription"),prop.getProperty("tokenusername1"),
			prop.getProperty("tokenpwd"),prop.getProperty("tokenrptpwd"));
expectedltokenvalue= tp.actualtokenqrserialno();
actualtokenvalue="TOTP0008DACD";

System.out.println(expectedltokenvalue);

assertEquals(actualtokenvalue, expectedltokenvalue);

}
@Test(priority=1)

public void enrollnewTokenTest() throws Exception{
	// TODO Auto-generated method stub
	tp.enrolltokenfromuserpagebutton();
	
	tp.tokencreationtextfields(prop.getProperty("tokendescription"),prop.getProperty("tokenusername2"),
			prop.getProperty("tokenpwd"),prop.getProperty("tokenrptpwd"));
	expectedltokenvalue= tp.enrollnewtokenmethod();
	actualtokenvalue="TOTP00167BD1";

	System.out.println(expectedltokenvalue);

	assertEquals(actualtokenvalue, expectedltokenvalue);
	
}
@Test(priority=2)
public void assignnewtokentestfromuserpage() throws Exception{
	// TODO Auto-generated method stub
	expectedtoken=tp.assigntokentousertest(prop.getProperty("assigntoken"),
			prop.getProperty("tokenpwd"),prop.getProperty("tokenrptpwd"));
	actual=prop.getProperty("assigntoken");
	assertEquals(actual, expectedtoken);
}
@Test(priority=3)
public void usertokendisabletest() throws Exception{
	// TODO Auto-generated method stub
	hp.tokendisablemethodh();
	
	actual=prop.getProperty("disabledtokentext");
	expected=tp.tokendisablemethod();
	
	assertEquals(actual, expected);
}
@Test(priority=4)
public void usertokendenabletest() throws Exception{
	// TODO Auto-generated method stub
	hp.tokendisablemethodh();
	
	actual=prop.getProperty("enabletext");
	expected=tp.tokenenablemethod();
	
	assertEquals(actual, expected);
	
}
@Test(priority=5)
public void unassignusertest() throws Exception{
	// TODO Auto-generated method stub
	hp.tokendisablemethodh();
	
	actual=prop.getProperty("enabletext");
	expected=tp.tokenenablemethod();
	
	assertEquals(actual, expected);
	
}
@Test(priority=6)
public void userunassignfromtokentest() throws Exception{
	// TODO Auto-generated method stub
	hp.tokendisablemethodh();
	
	actual=prop.getProperty("unmae1");
	expected=tp.unassignusermethod(prop.getProperty("unmae1"),
			prop.getProperty("tokenpwd"),prop.getProperty("tokenrptpwd"));
	
	assertEquals(actual, expected);
}
}
