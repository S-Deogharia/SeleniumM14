package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Roy");
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		WebElement home_page = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		if(home_page.isDisplayed()) {
			System.out.println("its facebook page");
		}
	}

}
