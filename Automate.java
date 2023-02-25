import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://unergia-saas-staging-solarladder.vercel.app/login");
		driver.findElement(By.name("email")).sendKeys("solarladdertest787@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Your Password']")).sendKeys("password");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained accessibility crm-addprojectbutton MuiButton-containedPrimary'][1]")).click();
		driver.findElement(By.name("projectSize")).sendKeys("4");
		driver.findElement(By.name("customerName")).sendKeys("Vincent");
		driver.findElement(By.xpath("//input[@class='form-control w-100'][1]")).sendKeys("9820098201");
		driver.findElement(By.name("location")).sendKeys("Delhi");
		driver.findElement(By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")).click();
		
		//Element which needs to drag.
		//WebElement From = driver.findElement(By.xpath("//span[@draggable='true']"));
		WebElement From = driver.findElement(By.xpath("//div[@class='crm-projectcard-top-title-maintitle'][1]"));
		
		//Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("//span[@class='sc-kDvujY eRcdAy']"));
		
		//Using Action class for drag and drop.		
        Actions act=new Actions(driver);
		
		//Dragged and dropped.		
        act.dragAndDrop(From, To).build().perform();
		
		
		//WebElement staticDropdown = driver.findElement(By.name("customerType"));
		
		//Select dropdown = new Select(staticDropdown);
	}

}
