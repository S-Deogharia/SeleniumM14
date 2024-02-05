package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("sdeogharia339@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Deogharia@339");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}

}
