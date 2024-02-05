package HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		String given_url="https://demowebshop.tricentis.com/";
		String given_loginTitle="Demo Web Shop. Login";
		//maximize the browser
		driver.manage().window().maximize();
		//enter the demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		//verify the url
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("verify the url");
			//click the register link
			driver.findElement(By.className("ico-login")).click();
			//verify the register page
			String currentloginTitle = driver.getTitle();
			if(given_loginTitle.contains(currentloginTitle)) {
				System.out.println(" you are in login page");
				
			}
			else
				System.out.println(" you are not in login page");
			//fillup the login form
			driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("memdeogharia100@gmail.com");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Deogharia@339");
			driver.findElement(By.cssSelector("input[type='checkbox']")).click();
			Thread.sleep(2000);
			//close browser
			driver.close();

	}
	}
}
