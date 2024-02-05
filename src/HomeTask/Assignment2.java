package HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Sneha");
		driver.findElement(By.name("LastName")).sendKeys("Deogharia");
		driver.findElement(By.id("Email")).sendKeys("memdeogharia100@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sneha@339");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Sneha@339");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
