package basicp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownbox {

	public static void main(String[] args) {
   
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	

   		driver.get("https://www.facebook.com/login");
   		String title = driver.getTitle();
        driver.manage().window().maximize();
  	    driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("sudammore@yahoo.com");
  	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("kanhegaonkar");
  	    driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

	
	
	}

}
