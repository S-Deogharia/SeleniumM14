package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Downloads/demo-1.html");
		Thread.sleep(2000);
		WebElement select_single = driver.findElement(By.cssSelector("select[id='standard_cars']"));
		Thread.sleep(2000);
		Select s_ref=new Select(select_single);
		s_ref.selectByVisibleText("Jaguar");
		Thread.sleep(2000);
		s_ref.selectByValue("hda");
		Thread.sleep(2000);
		s_ref.selectByIndex(9);
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
