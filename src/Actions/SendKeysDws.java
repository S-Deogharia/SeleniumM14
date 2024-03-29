package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysDws {

	public static void main(String[] args) {
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));				
		driver.get("https://demowebshop.tricentis.com/");
		String current_Url=driver.getCurrentUrl();
		if(given_url.equals(current_Url)) {
			System.out.println("you are in DWS Page");
			WebElement search_field = driver.findElement(By.id("small-searchterms"));
			Actions a=new Actions(driver);
			if(search_field.isEnabled()) {
				System.out.println("search field is enabled");
				a.moveToElement(search_field).click().sendKeys("sneha").build().perform();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				System.out.println("script is successfull");
				driver.close();
			
			
			}
			else {
				System.out.println("Search field is not enabled");
			}
			
		}
		else
		{
			System.out.println("you are not in Dws page");
			System.out.println("script is unsuccessfull");
			driver.close();
			
		}

	}

}
