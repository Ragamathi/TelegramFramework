package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(className="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06")
	private static WebElement Account;
	
	@FindBy(linkText = "My Profile")
	private static WebElement myprofile;
	
	@FindBy(linkText = "Edit Profile ")
	private static WebElement editprofile;
	
	@FindBy(id="First Name")
	private static WebElement firstname;
	
	@FindBy(linkText = "Submit")
	private static WebElement submit;
	
	public WebElement getAccount() {
		return Account;
		
	}
	
	public WebElement getmyprofile() {
		return myprofile;
	}
	
	public WebElement geteditprofile() {
		return editprofile;
		
	}
	
	public WebElement getfirstname() {
		return firstname;
		
		
	}
	public WebElement getsubmit() {
		return submit;
	}

}
