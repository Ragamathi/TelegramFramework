package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {
	public DemoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Books")
	private  WebElement books;
	
public WebElement getbooks() {
	return books;
}
			



}
