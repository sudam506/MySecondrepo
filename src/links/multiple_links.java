package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
	   driver.get("https://www.amazon.com/");
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	int totalLinks=alllinks.size();
	System.out.println("total number of links is :"+totalLinks);
	
	int visiblelinklinkscount=0;
	int hiddenlinkcount=0;
	
	//using for each loop iterate through all the links
	for(WebElement link:alllinks) {
	
	//if the link is displayed,then print the text of the link
		if(link.isDisplayed()) {
	
		visiblelinklinkscount++;
	System.out.println(visiblelinklinkscount+"-->"+link.getText());
	}
	else {
	
		hiddenlinkcount++;
	}
	}
	System.out.println("total number of visible links:"+visiblelinklinkscount);
	System.out.println("total number of visible links:"+hiddenlinkcount);
	}}
