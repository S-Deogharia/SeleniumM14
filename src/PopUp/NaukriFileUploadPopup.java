package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));				
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("register_Layer")).click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\hp\\Downloads\\SnehaResume (2) (2).pdf");
		

	}

}
