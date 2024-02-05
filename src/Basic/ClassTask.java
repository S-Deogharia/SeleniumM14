package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		String given_url="https://demowebshop.tricentis.com/";
		String given_digitaldownloadTitle="Demo Web Shop. Digital downloads";
		
		//maximize the browser
		driver.manage().window().maximize();
		//enter the demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		//verify the url
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("verify the url");
			driver.findElement(By.xpath("(//a[@href='/digital-downloads']) [1]")).click();
			//verify the register page
			String currentloginTitle = driver.getTitle();
			if(given_digitaldownloadTitle.contains(currentloginTitle)) {
				System.out.println(" you are in digitaldownload page");
				driver.close();
				
			}
			else
				System.out.println(" you are not in digitaldownload page");
		}

	}

}
