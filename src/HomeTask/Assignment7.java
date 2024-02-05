package HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver driver=null;
	public static void ChromeBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void CloseBrowser() {
		driver.close();
	}
	public static void openDWS() {
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	public static void findelement() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Picture of $25 Virtual Gift Card']")).click();
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Sneha Deogharia");
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("sdeogharia339@gmail.com");
		driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Mem");
		driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("memdeogharia100@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("Hi hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
		driver.findElement(By.xpath("//li[@id='topcartlink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	}
	

	public static void main(String[] args) throws InterruptedException  {
		ChromeBrowser();
		openDWS();
		findelement();
		CloseBrowser();

		
		
	}

}
