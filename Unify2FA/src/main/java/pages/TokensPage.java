package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TokensPage {

	Select sel1;
	Select sel;
public TokensPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
			
}

@FindBy (xpath="//select[@id='tokentype']")
public WebElement selecttotp;

@FindBy (xpath="//input[@name='serial']")
public WebElement enterserialno;

@FindBy (xpath="//input[@id='description']")
public WebElement descriptiontext;

@FindBy (xpath="//select[@name='realm']")
public WebElement selectrealm;

@FindBy (xpath="//input[@name='username']")
public WebElement usernametext;

@FindBy (xpath="//input[@placeholder='Type a password']")
public WebElement pwdtxt;

@FindBy (xpath="//input[@placeholder='Repeat password']")
public WebElement repeatpwdtext;

@FindBy (xpath="//button[text()='Enroll Token']")
public WebElement enrolltokenbutton;

@FindBy (xpath="//button[text()='Enroll a new token']")
public WebElement enrollanewtokenbutton;

@FindBy (xpath="//button[text()='Enroll New Token']")
public WebElement userenrollanewtokenbutton;

@FindBy (xpath="//button[text()='Assign Token']")
public WebElement assigntokenbutton;

@FindBy (xpath="//span[text()='Unassign User']")
public WebElement unassignuserbutton;

@FindBy (xpath="//span[text()='Assign User']")
public WebElement assignuserbutton;

@FindBy (xpath="//translate[text()='Users']")
public WebElement userss;

@FindBy (xpath="//*[@id='tableuserlist']/tbody/tr[5]/td[1]/a")                                                     //a[@href='pratish11']")
public WebElement pratishtoken;


@FindBy (xpath="//*[@id='tabletokenlist']/tbody/tr[3]/td[1]/a")                                                     //a[@href='pratish11']")
public WebElement pratishdisabletest;

@FindBy (xpath="//*[@id='tableuserlist']/tbody/tr[2]/td[1]/a")                                                     //a[@href='pratish11']")
public WebElement tokendisable;

@FindBy (xpath="//button[text()='Disable']")                                                     //a[@href='pratish11']")
public WebElement disablebutton;

@FindBy (xpath="//button[text()='Enable']")                                                     //a[@href='pratish11']")
public WebElement enblebutton;

@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div/div[4]/table/tbody/tr[1]/td[1]/a")                                                     //a[@href='pratish11']\")\n" + 
public WebElement pratishtokenverification;

@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div/div[4]/table/tbody/tr[2]/td[1]/a")                                                     //a[@href='pratish11']\")\n" + 
public WebElement enrollnewtokenverification;

@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div/div[4]/table/tbody/tr[3]/td[1]/a")                                                     //a[@href='pratish11']\")\n" + 
public WebElement assigntokenverification;

@FindBy (xpath="//input[@class='ng-binding ng-scope']")
public WebElement tokenactual;

		@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div/div[4]/table/tbody/tr/td[3]/span[2]")
		public WebElement disablegettext;
		@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div/div[4]/table/tbody/tr/td[3]/span[1]")
		public WebElement enablegettext;
		@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div[1]/select")
		public WebElement selectrealmdropdown;
		@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]/a")
		public WebElement assignedusertext;
public void tokencreationtextfields(String dcrptn,String uname,String pwd,String rptpwd) throws Exception {
	// TODO Auto-generated method stub
	sel=new Select(selecttotp);
	Thread.sleep(4000);
	sel.selectByVisibleText("TOTP: Time based One Time Passwords.");
	Thread.sleep(3000);
	descriptiontext.sendKeys(dcrptn);
	Thread.sleep(2000);
	usernametext.clear();;
	Thread.sleep(3000);
	usernametext.sendKeys(uname);
	Thread.sleep(3000);
	pwdtxt.sendKeys(pwd);
	Thread.sleep(3000);
	repeatpwdtext.sendKeys(rptpwd);
	Thread.sleep(3000);
	                                                          //System.out.println(expectedltokenvalue.getText());
	enrolltokenbutton.click();
	Thread.sleep(15000);
	enrollanewtokenbutton.click();
  
}

public String actualtokenqrserialno() throws Exception{
	// TODO Auto-generated method stub
	userss.click();
	Thread.sleep(3000);
	pratishtoken.click();
	Thread.sleep(3000);
	
	return pratishtokenverification.getText();
}
public String enrollnewtokenmethod() throws Exception{
	// TODO Auto-generated method stub
	userss.click();
	Thread.sleep(3000);
	pratishtoken.click();
	Thread.sleep(3000);
	
	return enrollnewtokenverification.getText();
}
public void enrolltokenfromuserpagebutton() throws Exception{
	// TODO Auto-generated method stub
	
	userss.click();
	Thread.sleep(3000);
	pratishtoken.click();
	Thread.sleep(3000);
	userenrollanewtokenbutton.click();
}//*[@id="tabletokenlist"]/tbody/tr[3]/td[1]/a

public String assigntokentousertest(String serial,String pwd,String rptpwd) throws Exception {
	// TODO Auto-generated method stub
	userss.click();
	Thread.sleep(3000);
	pratishtoken.click();
	Thread.sleep(3000);
	enterserialno.sendKeys(serial);
	Thread.sleep(3000);
	pwdtxt.sendKeys(pwd);
	Thread.sleep(3000);
	repeatpwdtext.sendKeys(rptpwd);
	Thread.sleep(3000);
	assigntokenbutton.click();
	
	return assigntokenverification.getText();
}public String tokendisablemethod()throws Exception{
	
	// TODO Auto-generated method stub
	pratishdisabletest.click();
	Thread.sleep(3000);
	disablebutton.click();
	Thread.sleep(3000);
	 userss.click();
    Thread.sleep(3000);
    tokendisable.click();
    Thread.sleep(3000);
    
    return disablegettext.getText();
}
public String tokenenablemethod() throws Exception{
	// TODO Auto-generated method stub
		pratishdisabletest.click();
		Thread.sleep(3000);
		enblebutton.click();
		Thread.sleep(3000);
		 userss.click();
	    Thread.sleep(3000);
	    tokendisable.click();
	    Thread.sleep(3000);
	    
	    return enablegettext.getText();
}
public String unassignusermethod(String unmae1,String pwd,String rptpwd)  throws Exception {
	pratishdisabletest.click();
	Thread.sleep(3000);
	unassignuserbutton.click();
	
    Thread.sleep(3000);

    Select sel=new Select(selectrealmdropdown);
    
    sel.selectByVisibleText("unify.com");
    
    Thread.sleep(3000);
	usernametext.sendKeys(unmae1);
	Thread.sleep(3000);
	pwdtxt.sendKeys(pwd);
	Thread.sleep(3000);
	repeatpwdtext.sendKeys(rptpwd);
	Thread.sleep(3000);
	assignuserbutton.click();
	
	Thread.sleep(5000);
    
   return  assignedusertext.getText();

} 


}

















/*sel1=new Select(selectrealm);
	Thread.sleep(4000);
	sel.selectByVisibleText("uniferrealm");*/
