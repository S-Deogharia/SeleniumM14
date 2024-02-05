package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		String given_title="Demo Web Shop";
		System.out.println(driver.getTitle());
		String Current_title=driver.getTitle();
		if(given_title.equals(Current_title)) {
			System.out.println("the given and current title is same");
		}
		else
			System.out.println("the given and current title is not same");
		driver.close();
		
		

	}

	
}
