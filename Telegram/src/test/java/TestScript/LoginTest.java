  package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.AccountPage;
import Objectrepository.LoginPage;
import Objectrepository.RegisterPage;

public class LoginTest {
	@Test
	public void Register()  {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		LoginPage login = new LoginPage(driver);
		RegisterPage register=new RegisterPage(driver);
		login.getLoginButton().click();
		
		register.getcreateaccount().click();
		
		register.getfirstname().sendKeys("suwathi");
	
		register.getlastname().sendKeys("black");
		
		register.getfemale().click();
		
		register.getphoneno().sendKeys("9698898004");
		
		register.getemailaddress().sendKeys("gsuwathi2006@gmail.com");
		
		register.getpassword().sendKeys("Suwathi@2006");
		
		register.getconfrimpassword().sendKeys("Suwathi@2006");
		
		register.getcheckbox().click();
		
		register.getregister().click();
		
		driver.quit();
	}
	
	
	
	@Test
	
	
	public void login() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		LoginPage login = new LoginPage(driver);
		login.getLoginButton().click();
		
		login.getEmail().sendKeys("ragamathi2002@gmail.com");
		
		login.getPassword().sendKeys("Mathi@532002");
		
		login.getLogin().click();
		
		driver.quit();
		}
	
@Test
   public void login1() {
	WebDriver driver =new ChromeDriver();      
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	LoginPage login = new LoginPage(driver);
	login.getLoginButton().click();
	
	login.getEmail().sendKeys("ragamathi2002@gmail.com");
	
	login.getPassword().sendKeys("af453");
	
	login.getLogin().click();
	
	driver.quit();
	}

@Test
public void accountset() {
	WebDriver driver =new ChromeDriver();      
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	LoginPage login = new LoginPage(driver);
	AccountPage account =new AccountPage(driver);
	account.getAccount().click();
	account.getmyprofile().click();
	account.geteditprofile().click();
	account.getfirstname().sendKeys("suwathi");
	account.getsubmit().click();
	driver.switchTo().alert().accept();
	driver.quit();
	
}
@Test

public void address() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	
	
}





}


