package auto_suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.flipkart.com");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
	    Thread.sleep(8000);
	    List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']//li[@class='Y5N33s']"));
	
	for(WebElement w:searchResult) {
	
	String exp="iphone 11";
	String act=w.getText();
	if(act.equals(exp)) 
	{	Thread.sleep(5000);
		w.click();
		break;
	}
	}
	driver.close();
	}
	}


