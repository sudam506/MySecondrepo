package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
	driver.get("https://w3.p2hp.com/html/tryit.asp?filename=tryhtml_basic_link");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
   // Thread.sleep(3000);
	//driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='This is a link']")).click();
	driver.quit();
	
	
	
	}

}
