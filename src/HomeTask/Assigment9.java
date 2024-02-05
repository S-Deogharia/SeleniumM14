  package HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		String given_url="https://www.facebook.com/";
		driver.manage().window().maximize();
		//open facebook
		driver.get("https://www.facebook.com/");
		//verify the facebook page by Url
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("verify  the facebook page url");
			Thread.sleep(2000);
			//click creat acount
			driver.findElement(By.partialLinkText("Create new account")).click();
			//verify the webelement
			WebElement singup_page = driver.findElement(By.cssSelector("div[class='_52lr fsm fwn fcg']"));
			if(singup_page.isDisplayed()) {
			System.out.println("Its Singup page");
			}
			//fill the form
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Roy");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Abc@123");
			//Dropdown Day
            WebElement select_single = driver.findElement(By.cssSelector("select[id='day']"));
            Thread.sleep(2000);
            Select s_ref=new Select(select_single);
            s_ref.selectByVisibleText("24");
            Thread.sleep(2000);
            //month
            WebElement month_single = driver.findElement(By.cssSelector("select[id='month']"));
            Thread.sleep(2000);
            Select m_ref=new Select(month_single);
            m_ref.selectByIndex(0);
            Thread.sleep(2000);
            //year
            WebElement year_single = driver.findElement(By.cssSelector("select[id='year']"));
            Thread.sleep(2000);
            Select y_ref=new Select(year_single);
            y_ref.selectByValue("1999");
            driver.findElement(By.xpath("//input[@value='1']")).click();
            Thread.sleep(2000);
            //click register
            driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
            Thread.sleep(2000);
            //close
            driver.close();
            
            
            
            
			
		}
		else {
			System.out.println("verify  failed  facebook page url");
		}

	}

}
