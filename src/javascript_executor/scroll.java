package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
	
	//typecasting driver object to javascriptExecutor interface
	JavascriptExecutor js= (JavascriptExecutor)driver;
	for(int i=0;i<10; i++) {
	
	//to scroll down on the page
		js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	}
	
	//to scroll up the page
	for(int i=1; i<10; i++) {
	
	js.executeScript("window.scrollBy(0,-500)");
	
	}
}
}