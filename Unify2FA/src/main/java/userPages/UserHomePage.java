package userPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseInitialization.BaseClass;

public class UserHomePage  extends BaseClass{


		public UserHomePage(WebDriver driver) 
		{
			
			PageFactory.initElements(driver,this);
				
     	}
		
		@FindBy (xpath="//translate[text()='Tokens']")
		public WebElement Tokens;
		



public UserTokenPage usertokenpagemethod() {
	
	Tokens.click();
	
	return new UserTokenPage(driver);
}

}


