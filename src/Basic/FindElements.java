package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> community_poll = driver.findElements(By.cssSelector("input[type='radio']"));
		for(WebElement web : community_poll) {
			web.click();
			Thread.sleep(2000);
		}
		driver.close();
         
	}

}
