package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		String given_text = "Hello Sneha How are you today";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));				
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("Sneha");
		a.accept();
		String current_text=driver.findElement(By.id("demo1")).getText();
		if(given_text.contains(current_text)) {
			System.out.println("you have successfully entered the data inside the pop_up");
			System.out.println(current_text);
			driver.close();
		}
		else {
			System.out.println("Data is unsuccessfull");
			driver.close();
		}
	  

	}

}
