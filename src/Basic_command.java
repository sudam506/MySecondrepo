import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_command {

	public static void main(String[] args) throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.google.com");
		System.out.print(driver.getCurrentUrl());
		driver.quit();

	Thread.sleep(10000);
	}

}
