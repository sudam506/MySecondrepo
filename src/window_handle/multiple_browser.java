package window_handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
	   driver.get("https://www.naukri.com/");
	//using getwindowHandle() get a set of window handle IDS
	   Set<String> allwindowhandle = driver.getWindowHandles();
	 int count=allwindowhandle.size();
	System.out.println("number of browser window open onthe system is :"+count);
	for(String windowhandle:allwindowhandle) {
	
	//switch to each browser window
		driver.switchTo().window(windowhandle);
	String title= driver.getTitle();
	//print window handle id of each browser window
	System.out.println("window handle of the page-->"+title+"--> is: "+windowhandle);
	
	
	driver.close();
	}
	}
}
