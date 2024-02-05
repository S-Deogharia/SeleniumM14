package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demowebshop.tricentis.com/");
		WebElement laptop14 = driver.findElement(By.xpath("//input[@value='Add to cart'])[2]"));
		js.executeScript("arguments[0].scrollIntoview(true)", laptop14);
	}

}
