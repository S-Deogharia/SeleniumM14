package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedTextLocator {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Shopping")).click();
		driver.close();

	}

}
