package browser_navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
	driver.get("http:www.amazon.com");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.navigate().to("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.close();
	
	}

}
