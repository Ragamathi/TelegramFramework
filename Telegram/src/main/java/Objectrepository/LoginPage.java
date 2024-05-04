package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Login") 
	private static WebElement LoginButton;
	
	@FindBy(id="Email")
	private static WebElement Email;
	  
	@FindBy(id="Password")
	private static WebElement Password;
	
	@FindBy(linkText="Login")
	private static WebElement login;
	
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	public WebElement getEmail() {
		return Email;
		
	}
	
	public WebElement getPassword() {
		return Password;
		
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	
	 
	
	

}
