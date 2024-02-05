package TestNg1;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	WebDriver driver;
	@BeforeClass
public void precondition () {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
	@BeforeMethod
	    public void logIn() {
		    System.out.println("login is successfull");
	    	
	    }
	public void logOut() {
		System.out.println("logOut successfull");
	}
	@AfterClass
	public void postCondition( ) {
		driver.quit();
		
	}

}
