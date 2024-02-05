package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/hp/Downloads/demo-1.html");
		WebElement multiDropDown = driver.findElement(By.id("multiple_cars"));
		Select s_ref=new Select(multiDropDown);
		s_ref.selectByIndex(2);
		Thread.sleep(2000);
		s_ref.deselectByIndex(2);

	}

}
