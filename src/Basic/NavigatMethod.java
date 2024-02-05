package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ktmindia.com/");
		String Current_titleKtm=driver.getTitle();
		driver.get("https://www.royalenfield.com/");
		driver.navigate().back();
		String given_titleKtm="KTM | READY TO RACE | Explore the range in India – Models, Features, Price, Colors";
		if(Current_titleKtm.equals(given_titleKtm)) {
			System.out.println("you are in KTM WebPage");
		}
		else
			System.out.println("you are in RoyalEnfield Webpage");		
		
		
		//driver.navigate().forward();
	}

}
