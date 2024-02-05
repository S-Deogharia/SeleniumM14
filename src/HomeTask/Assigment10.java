package HomeTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment10 {

	public static void main(String[] args) throws InterruptedException {
		String given_url="";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement context_click = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions a=new Actions(driver);
		a.contextClick(context_click).build().perform();
		Thread.sleep(2000);
		try {
			context_click.isEnabled();
			System.out.println("my script is unsuccessfull");
			
		} catch (Exception e) {
			System.out.println("my Script is successfull");
		}
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(5000);
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("Popup page is display");
		}
		else {
			System.out.println("popup is not display");
			
		}
		
	
		/*if(popup_page.isDisplayed()) {
			System.out.println(" popup page is display");
		}
		else {
			System.out.println("popup page is not display");
		}*/

	}

}
