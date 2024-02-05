package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Downloads/demo-1.html");
		WebElement single_dropdown = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		WebElement multi_dropdown = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
		 Select s1=new Select(single_dropdown);
		 Select s2=new Select(multi_dropdown);
		 if(s1.isMultiple()) {
			 System.out.println("You are useing s1 Drop Down Menu");
			 List<WebElement> s1_values = s1.getOptions();
			 for(WebElement web : s1_values) {
				 web.click();
				 Thread.sleep(1000);
			 }
			 s1.deselectAll();
			 
		 }
		 else {
			 System.out.println("you are in s2 Drop Down Menu");
			 List<WebElement> s2_Values = s2.getOptions();
			 for(WebElement web :s2_Values) {
				 web.click();
				 Thread.sleep(1000);
			 }
			 s2.deselectAll();
			 
		 }
		 driver.close();

	}

}
