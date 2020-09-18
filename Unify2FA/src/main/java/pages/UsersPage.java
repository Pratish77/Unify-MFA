package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseInitialization.BaseClass;

public class UsersPage   extends BaseClass{

	boolean button;
	
public UsersPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
			
} 

@FindBy (xpath="//input[@id='useruid']")
public WebElement userid;

@FindBy (xpath="//input[@id='username']")
public WebElement username;

@FindBy (xpath="//input[@id='email']")
public WebElement email;

@FindBy (xpath="//input[@id='password']")
public WebElement password;

@FindBy (xpath="//input[@id='mobile']")
public WebElement mobile;

@FindBy (xpath="//input[@id='phone']")
public WebElement phone;

@FindBy (xpath="//span[text()='Save user']")
public WebElement saveuserbutton;

@FindBy (xpath="//span[text()='User created.']")
public WebElement usercreatedverification;

@FindBy (xpath="//translate[text()='Users']")
public WebElement userss;

@FindBy (xpath="//div[text()='User deleted successfully.']")
public WebElement userdeleteverification;

@FindBy (xpath="//span[text()='Delete user']")
public WebElement userdelete;

@FindBy (xpath="//span[text()='Delete User']")
public WebElement userdeletebutton;

@FindBy (xpath="//*[@id='tableuserlist']/tbody/tr[6]/td[1]/a")              
public WebElement pratishtoken;

@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div/div[4]/table/tbody/tr[1]/td[1]/a")                                                     //a[@href='pratish11']\")\n" + 
public WebElement pratishtokenverification;

@FindBy (xpath="/html/body/div[1]/div/div/div/div[1]/div/ul[2]/li[2]/select")                                                     //a[@href='pratish11']\")\n" + 
public WebElement selectrealm;


public void userCreation(String uname,String uemail,String upassword,
		String uphoneno,String umobileno ) throws Exception{
	
	// TODO Auto-generated method stub
    Thread.sleep(2000);
    username.sendKeys(uname);
    Thread.sleep(2000);
    email.sendKeys(uemail);
    Thread.sleep(2000);
    password.sendKeys(upassword);
    Thread.sleep(2000);
    phone.sendKeys(uphoneno);
    Thread.sleep(2000);
    mobile.sendKeys(umobileno);
    Thread.sleep(2000);
    saveuserbutton.click();
    Thread.sleep(3000);
    
    // Thread.sleep(4000);
    //userid.sendKeys(useruid);

    
}
public void invalidusercreation(String uname,String emailid,String pwd )throws Exception {
    Thread.sleep(2000);
   /* userss.click();
    Thread.sleep(2000);
    adduser.click();
    Thread.sleep(1000);*/
    
	Thread.sleep(1000);
	username.sendKeys(uname);
    Thread.sleep(1000);
    email.sendKeys(emailid);
    Thread.sleep(1000);
    password.sendKeys(pwd);
    Thread.sleep(1000);
//	return button = saveuserbutton.isEnabled();
}

public String usercreationVerification() throws Exception{
	// TODO Auto-generated method stub
	return usercreatedverification.getText();
}
public void userdeletedVerification() throws Exception{
	    Thread.sleep(4000);
	    userss.click();
		Thread.sleep(2000);
        pratishtoken.click();
		Thread.sleep(2000);
		userdelete.click();
		Thread.sleep(2000);
		userdeletebutton.click();
		Thread.sleep(2000);

	// TODO Auto-generated method stub
	//return userdeleteverification.getText();
}
public String actualtokenqrserialno() throws Exception{
	// TODO Auto-generated method stub
	userss.click();
	Thread.sleep(3000);
	pratishtoken.click();
	Thread.sleep(3000);
	
	return pratishtokenverification.getText();
}

public void realmselect() {
	
	Select sel= new Select(selectrealm);
	sel.selectByVisibleText("tech.com");
}

}


