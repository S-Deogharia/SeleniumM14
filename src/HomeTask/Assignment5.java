package HomeTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		String given_url="https://demowebshop.tricentis.com/";
		String given_Digital_download_Title="Demo Web Shop. Digital downloads";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		if(given_url.equals(driver.getCurrentUrl())) {
			System.out.println(" You are in a Demo Web Shop");
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			if(given_Digital_download_Title.contains(driver.getTitle())) {
				System.out.println(" You are in a Digital Download Page");
				List<WebElement> Digitel_download = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for (WebElement web : Digitel_download ) {
					web.click();
					Thread.sleep(2000);
					
				}
				driver.findElement(By.cssSelector("span[class='cart-label']")).click();
				WebElement shopping_cart = driver.findElement(By.cssSelector("div[class='page-title']"));
				if(shopping_cart.isDisplayed() ) {
				System.out.println("You are in a shopping cart page");
			}
			else
				System.out.println("You are  not in  shopping cart page");
			}
			else
				System.out.println("You are  not in  Digital Download Page");
			
		}

		else
			System.out.println("You are not in  Demo Web Shop ");

	}

}
