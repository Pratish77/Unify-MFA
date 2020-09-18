package userPages;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import baseInitialization.BaseClass;

	public class UserLoginPage extends BaseClass{
		
		WebDriverWait wait;
		
		String expected;
		
		String actualtitle;
		
		
		
	public UserLoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
				
	}
		@FindBy (xpath="//input[@id='username']")
		public WebElement usernametext;
		
		@FindBy (xpath="//input[@id='password']")
		public WebElement password;
		
		@FindBy (xpath="//button[@class='btn btn-primary btn-block']")
		public WebElement loginbutton;
		
		public UserHomePage loginpageMethod(String uname,String pwd)  throws Exception{
			
			// TODO Auto-generated method stub
	        
			usernametext.sendKeys(uname);
	        
	        Thread.sleep(3000);
			
			password.sendKeys(pwd);
			
			 Thread.sleep(3000);
	        
	        wait = new WebDriverWait(driver,30);
	        
	        //button[text(),'Log In']
	        
	        WebElement loginbutton1;
	        
	        loginbutton1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/form/div/button")));
	        
	        loginbutton1.click();
	        
	        return new UserHomePage(driver);
	                     
		}
		
		
		public String pagetitle() {
			
			 actualtitle="unify-2fa";
			
			return expected=driver.getTitle();
			
			}
		
		public void pageLogo() {
			
			
		}
	}
		
		




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* if (loginbutton.isDisplayed()) {

	loginbutton.click();

	}else {

	usernametext.clear();

	usernametext.sendKeys(uname);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	password.clear();

	password.sendKeys(pwd);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	loginbutton.click();*/

