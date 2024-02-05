package PopUp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AertAssigment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		
	    // Actions a=new Actions(driver);
		/*a.contextClick(context_click).build().perform();
		driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-edit\"]")).click();
		Thread.sleep(2000);
		Alert b=driver.switchTo().alert();
		b.accept();
		driver.findElement(By.xpath(" ")).click();*/
		 List<WebElement> content_insideBox = driver.findElements(By.xpath("context-menu-list context-menu-root"));
		 for(WebElement web : content_insideBox) {
			 Actions a=new Actions(driver);
			 a.moveToElement(right_click).contextClick(right_click).build().perform();
			 Thread.sleep(1000);
			 Alert al= driver.switchTo().alert();
			 Thread.sleep(1000);
			 System.out.println(al.getText());
			 al.dismiss();
			 Thread.sleep(1000);
			 
		 }

	}

}
