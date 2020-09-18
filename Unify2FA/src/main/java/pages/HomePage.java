package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseInitialization.BaseClass;

public class HomePage extends BaseClass{

	boolean button; 
	
public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
			
}
	
	@FindBy (xpath="//translate[text()='Users']")
	public WebElement userss;
	
	@FindBy (xpath="//a[@href='#!/user/add']")
	public WebElement adduser;
	
	@FindBy (xpath="//translate[text()='Tokens']")
	public WebElement Tokens;
	
	@FindBy (xpath="//span[text()='Enroll Token']")
	public WebElement enrollToken;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div/div[1]/div/ul[2]/li[2]/select")                                                     //a[@href='pratish11']\")\n" + 
	public WebElement selectrealm;
	
	
	
public UsersPage userspagenavigation() throws Exception{
	// TODO Auto-generated method stub
	Thread.sleep(2000);
    userss.click();
    Thread.sleep(2000);
    adduser.click();
	return new UsersPage(driver);
 }
public TokensPage tokenspagenavigation() throws Exception{
	// TODO Auto-generated method stub
    Thread.sleep(2000);
    
    Tokens.click();
    Thread.sleep(2000);

    enrollToken.click();
    return new TokensPage(driver);
}

public void tokendisablemethodh() throws Exception{
	// TODO Auto-generated method stub
    Thread.sleep(2000);
    
    Tokens.click();
    Thread.sleep(2000);
}

}
