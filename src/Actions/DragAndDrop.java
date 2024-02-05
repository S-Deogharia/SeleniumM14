package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
		Actions a =new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		WebElement second = driver.findElement(By.id("box7"));
		WebElement match = driver.findElement(By.xpath("//div[text()='Spain']"));
		Actions b=new Actions(driver);
		b.dragAndDrop(second, match).build().perform();
		WebElement third = driver.findElement(By.id("box1"));
		WebElement matching = driver.findElement(By.xpath("//div[text()='Norway']"));
		Actions c=new Actions(driver);
		c.dragAndDrop(third, matching).build().perform();
		WebElement four = driver.findElement(By.id("box4"));
		WebElement matched = driver.findElement(By.xpath("//div[text()='Denmark']"));
		Actions d=new Actions(driver);
		d.dragAndDrop(four, matched).build().perform();
		WebElement five = driver.findElement(By.id("box5"));
		WebElement right = driver.findElement(By.xpath("//div[text()='South Korea']"));
		Actions e=new Actions(driver);
		e.dragAndDrop(five, right).build().perform();
		WebElement six = driver.findElement(By.id("box2"));
		WebElement same = driver.findElement(By.xpath("//div[text()='Sweden']"));
		Actions f=new Actions(driver);
		f.dragAndDrop(six, same).build().perform();
		WebElement saven = driver.findElement(By.id("box3"));
		WebElement capital = driver.findElement(By.xpath("//div[text()='United States']"));
		Actions g=new Actions(driver);
		g.dragAndDrop(saven, capital).build().perform();
		
		
		
		
		

	}

}
