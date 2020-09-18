package userPages;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseInitialization.BaseClass;

public class UserTokenPage extends BaseClass{
	
	String  qrcodeurl;

	public UserTokenPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
			
}
	

	
	@FindBy (xpath="//input[@placeholder='Type a password']")
	public WebElement pwdtxt;

	@FindBy (xpath="//input[@placeholder='Repeat password']")
	public WebElement repeatpwdtext;
	
	@FindBy (xpath="//span[text()='Enroll Token']")
	public WebElement enrollToken;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div/div[2]"
			+ "/div[2]/ng-include/div/div[1]/img")
	public WebElement qrcode;
	
	@FindBy (xpath="//button[text()='Enroll Token']")
	public WebElement enrolltokenbutton;
	
	

	
	public void tokencreationmethod(String pwd,String rptpwd)throws Exception {
		
		enrollToken.click();
		
		Thread.sleep(4000);
		pwdtxt.sendKeys(pwd);
		
		Thread.sleep(4000);
		
		repeatpwdtext.sendKeys(rptpwd);
		
		Thread.sleep(4000);
		
		enrolltokenbutton.click();
		
		Thread.sleep(4000);
		
		//qrcodeurl=qrcode.getAttribute("src");
		
		//URL rl=new URL(qrcodeurl);
	}
	
	
	
}
