package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSHomePage {
@Test	
public void reciver() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWSHOMEPAGE execute = new DWSHOMEPAGE(driver);
	execute.searchField("sneha");
	execute.searchButton();
	
		
	}

}
