package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class HiddenText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement gender = driver.findElement(By.name("custom-gender"));
		  js.executeScript("arguments[0].value='Successfull';", gender);

	}

}
