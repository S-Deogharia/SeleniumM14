package HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the demowebshop
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//enter into abhibus webpage
		Thread.sleep(2000);
		driver.get("https://www.abhibus.com/");
		//again back into demowebshop webpage
		Thread.sleep(2000);
		driver.navigate().back();
		//verify the title  of webpage by using if else condition
		String Current_titledemo=driver.getTitle();
		String given_titledemo="Demo Web Shop";
		if(Current_titledemo.equals(given_titledemo)) {
			System.out.println("you are in demowebshop WebPage");
		}
		else
			System.out.println("you are in abhibus Webpage");	
		//Enter some data into the text field
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		Thread.sleep(2000);
		//refresh the webpage
		driver.navigate().refresh();
	    Thread.sleep(2000);
	   //go to forward abhibus webpage
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    //close the browser
	    driver.close();

	}

}
