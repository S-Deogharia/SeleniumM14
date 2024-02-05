package HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		String given_url="https://demowebshop.tricentis.com/";
		String given_registerTitle="Demo Web Shop. Register";
		//maximize the browser
		driver.manage().window().maximize();
		//enter the demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		//verify the url
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("verify the url");
			//click the register link
			driver.findElement(By.className("ico-register")).click();
			//verify the register page
			String currentregisterTitle = driver.getTitle();
			if(given_registerTitle.contains(currentregisterTitle)) {
				System.out.println(" you are in register page");
				
			}
			else
				System.out.println(" you are not in register page");
			//fillup the form
			driver.findElement(By.cssSelector("input[value='F']")).click();
			driver.findElement(By.cssSelector("input[data-val-required='First name is required.']")).sendKeys("Sneha");
			driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']")).sendKeys("Deogharia");
			driver.findElement(By.cssSelector("input[data-val-email='Wrong email']")).sendKeys("memdeogharia100@gmail.com");
			driver.findElement(By.cssSelector("input[data-val-length='The password should have at least 6 characters.']")).sendKeys("Sneha@339");
			driver.findElement(By.cssSelector("input[data-val-equalto='The password and confirmation password do not match.']")).sendKeys("Sneha@339");
			Thread.sleep(2000);
			//close the browser
			driver.close();
			
			
		}

	}

}
