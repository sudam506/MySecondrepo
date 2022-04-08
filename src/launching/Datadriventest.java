package launching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datadriventest {

	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
	//	 facebook login
   		driver.get("https://www.facebook.com/");
  	    driver.findElement(By.partialLinkText("Create New Account")).click();
  	   // WebElement element=driver.findElement(By.xpath("//select[@name='birthday_day']"));
  	   // Select se=new Select(element);
       // se.selectByValue("6");
  	  //  System.out.println(se.getOptions());
     driver.manage().timeouts().implicitlyWait(10, SECONDS);
    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	
	
	
	
	
	}

}
