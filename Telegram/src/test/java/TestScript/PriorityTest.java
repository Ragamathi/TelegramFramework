package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTest {

	@Test(invocationCount = 0,threadPoolSize =3,enabled = false)//(priority = 0)
	public void register() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Register");
		Thread.sleep(2000);
		driver.quit();  
		
		
	}
	@Test(dependsOnMethods = "register")//(priority = 1)
	public void login() {
		WebDriver driver = new ChromeDriver();
		System.out.println("login");
		driver.quit();
		
	}		

	@Test(dependsOnMethods = "login")//(priority = 2)
	public void AddToCart() {
		WebDriver driver = new ChromeDriver();
		System.out.println("AddToCart");
		driver.quit();
	}
	
	

}
