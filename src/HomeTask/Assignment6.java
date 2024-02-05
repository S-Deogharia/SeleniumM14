  package HomeTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		////maximize the browser
		driver.manage().window().maximize();
		////enter the demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		// verify the webelement
		WebElement demo_webshop = driver.findElement(By.cssSelector("div[class='title']"));
		if(demo_webshop.isDisplayed()) {
			System.out.println(" You are in a Demo Web Shop page");
			//click digital downloads page
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			//verify Webelement
			WebElement digital_page = driver.findElement(By.cssSelector("div[class='page-title']"));
			if( digital_page.isDisplayed()) {
				System.out.println(" You are in a Digitel Downloads page");
				// add to cart
				List<WebElement> add_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for(WebElement web : add_cart) {
					web.click();
					Thread.sleep(2000);
				}
				//click shopping cart
				driver.findElement(By.cssSelector("span[class='cart-label']")).click();
				//verify shopping cart page
				WebElement shopping_cart = driver.findElement(By.cssSelector("div[class='page-title'"));
				if(shopping_cart.isDisplayed()) {
					System.out.println(" You are in a shopping cart page");
					//remove cart
					List<WebElement> check_box = driver.findElements(By.cssSelector("input[name='removefromcart']"));
					for(WebElement web : check_box) {
						web.click();
						Thread.sleep(2000);
					}
					//click update shopping cart
					driver.findElement(By.cssSelector("input[value='Update shopping cart']")).click();
					driver.close();
					}
				else
					System.out.println(" You are  not in  shopping cart page");
					
			}
			else
				System.out.println(" You are  not in a Digitel Downloads page");
		}
		else
			System.out.println("You are not in Demo Web Shop page");

	}

}
