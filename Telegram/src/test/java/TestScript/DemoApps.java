package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objectrepository.BooksPage;
import Objectrepository.DemoPage;

public class DemoApps {
	@Test(groups = "smoke")

	public void books_001() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    DemoPage demopage = new DemoPage(driver);
	    BooksPage bookspage = new BooksPage(driver);
	    String actualResult=bookspage.getbook().getText(); 
	    demopage.getbooks().click();
	    
	    //verify books page is displayed
	    //HardAssert
	    //Assert.assertEquals(actualResult,"computers");
	    //SoftAssert
	    SoftAssert soft = new SoftAssert();
	    //soft.assertEquals(actualResult,"computers");
	    soft.fail();
	    soft.assertTrue(bookspage.)
	    driver.quit();
	    System.out.println("Testcase completed");
	    soft.assertAll();
	    
		
			
		
	}

}
