package HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		String given_url="https://www.shoppersstack.com/";
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		//verify the page
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("You are in a Shopperstack page");
		}
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
	/*	else {
			System.out.println("You are in  not a Shopperstack page");
			
			
			}*/
			
		
		
			
		
       

	}

}
