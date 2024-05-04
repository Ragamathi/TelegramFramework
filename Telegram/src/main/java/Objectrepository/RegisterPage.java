package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Create Account")
	private static WebElement createaccount;
	
	@FindBy(id="First Name")
	private static WebElement firstname;
	
	@FindBy(id="Last Name")
	private static WebElement lastname;
	
	@FindBy (linkText="Female")
	private static WebElement female;
	
	@FindBy (id="Phone Number")
	private static WebElement phoneno;
	
	@FindBy (id="Email Address")
	private static WebElement emailaddress;
	
	@FindBy(id="Password")
	private static WebElement password;
	
	@FindBy(id="Confirm Password")
	private static WebElement confirmpass;
	
	@FindBy(id="Terms and Conditions")
	private static WebElement checkbox;
	
	@FindBy(id="Register")
	private static WebElement register;
	
	
	public WebElement getcreateaccount() {
		return createaccount;
		
	}
	public WebElement getfirstname() {
		return firstname;
		
	}
	public WebElement getlastname() {
		return lastname;
		
	}
	public WebElement getfemale() {
		return female;
	}
		
    public WebElement getphoneno() {
			return phoneno;
    }
			
	public WebElement getemailaddress() {
		return emailaddress;
	}
		public WebElement getpassword() {
			return password;
		}
			
	public WebElement getconfrimpassword() {
		return confrimpassword;
		
			}
	
	public WebElement getcheckbox() {
		return checkbox;
		
	}
		
	public WebElement getregister() {
		return register;
	}
		}
	
	
	
	
	
	
	
	


