package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformActionOnMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		String given_TwitterTitle = "nopCommerce (@nopCommerce) / X";
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		WebElement google = driver.findElement(By.xpath("//a[text()='Google+']"));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Google+']")));
		a.moveToElement(google).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).build().perform();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		for(String str : child) {
			driver.switchTo().window(str);
			String Current_title = driver.getTitle();
			if(given_TwitterTitle.contains(Current_title)) {
				driver.findElement(By.xpath("(//span[text()='Not now'])")).click();
				System.out.println("Scipt is successfull");
				driver.quit();
			}
		}

	}

}
