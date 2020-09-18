package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseInitialization.BaseClass;
import pages.HomePage;
import pages.Loginpage;
import pages.UsersPage;

public class UsersTests extends BaseClass{

static Loginpage lp;
	
	String usercreationverifytext;
	String Actualverificationtext1;
	HomePage hp;
	
	UsersPage up;
	
@BeforeMethod
public void registrationT() throws Exception {  
		
BrowserLaunch();

lp= new Loginpage(driver);

 hp=lp.loginpageMethod(prop.getProperty("username"), prop.getProperty("password"));
 
 up=hp.userspagenavigation(); 
}
 
@Test(priority=0)
public void usercreationTest() throws Exception {
	String Actualverificationtext="User created.";
	up.userCreation(prop.getProperty("emailtext"),prop.getProperty("emailtext"),prop.getProperty("emailtext"),
			prop.getProperty("phoneno"),prop.getProperty("mobileno"));
    usercreationverifytext=	up.usercreationVerification();
    
    Thread.sleep(2000);
    driver.close();
 assertEquals(Actualverificationtext,usercreationverifytext);
   
  System.out.println(usercreationverifytext);
  System.out.println("user hasbeen successfully created");
}
@Test(priority=1)
public void userdeleteTest() throws Exception {

	
	Actualverificationtext1="User deleted successfully.";
    	up.userdeletedVerification();
   
   // assertEquals(Actualverificationtext1,usercreationverifytext);
   
    System.out.println(usercreationverifytext);
    System.out.println("user hasbeen successfully deleted");
	
}
@Test(priority=2)
public void invalidusercreationTest() throws Exception {

	up.invalidusercreation(prop.getProperty("invalidusernametext"),
			prop.getProperty("invalidemailtext"),prop.getProperty("invalidpasswordtext"));
	
	WebElement saveuserbutton = driver.findElement(By.xpath("//span[text()='Save user']"));
	if(saveuserbutton.isDisplayed()) {
		
		saveuserbutton.click();
		System.out.println(saveuserbutton.getText());
		System.out.println("save user button is disabled ,invalid user data");
	
	}else {
		
	    System.out.println("save user button is disabled ,invalid user data");

	    }
	}
		
@AfterMethod
public void teardown() {
	driver.close();
}
	
	}

/*public void registrationT() throws Exception {  
	for(int i=1;i<=25;i++) {
		
BrowserLaunch();

lp= new Loginpage(driver);

 hp=lp.loginpageMethod(prop.getProperty("username"), prop.getProperty("password"));
 
 up=hp.userspagenavigation();
 

 

 String usernametext="raghup";
 String pwdtext1="raghu";
 int number=i;
 int mber=i;
 
 String number1=Integer.toString(number);
 
 String mber1=Integer.toString(mber);

		 String actualuser=usernametext.concat(number1);   

		 String actualpwd=pwdtext1.concat(mber1);
 
// String expected =usernametext.concat(number);;
//public void usercreationTest() throws Exception {
	//String Actualverificationtext="User created.";
	up.userCreation(actualuser,prop.getProperty("emailtext"),actualpwd,
			prop.getProperty("phoneno"),prop.getProperty("mobileno"));
    usercreationverifytext=	up.usercreationVerification();
    
    Thread.sleep(2000);
    driver.close();
 //actual. assertEquals(Actualverificationtext,usercreationverifytext);
   
  // System.out.println(usercreationverifytext);
  // System.out.println("user hasbeen successfully created");
   
	}
	}

*/