package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
	
	WebElement element = driver.findElement(By.xpath("//a[@class='selenium-button selenium-white-cyan text-uppercase font-weight-bold']"));
	
	int x=element.getLocation().getX();
	int y=element.getLocation().getY();
	System.out.println("x co ordinate is :"+x+" and y coordinate is :"+y);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(3000);
	element.click();
	driver.close();
	}

}
