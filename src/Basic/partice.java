package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partice {

	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("https://demowebshop.tricentis.com/");
			String Current_titledemo=driver.getTitle();
			driver.get("https://www.redbus.in/");
			driver.navigate().back();
			driver.navigate().refresh();
			String given_titledemo="Demo Web Shop";
			if(Current_titledemo.equals(given_titledemo)) {
				System.out.println("you are in demowebshop WebPage");
			}
			else
				System.out.println("you are in redbus Webpage");	
			driver.close();

	}

}
