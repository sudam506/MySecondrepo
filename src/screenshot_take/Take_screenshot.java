package screenshot_take;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Take_screenshot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
	driver.get("http:www.flipcard.com");
	driver.manage().window().maximize();
	
	TakesScreenshot ts= ((TakesScreenshot)driver);
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	RandomString rs=new RandomString(4); //to avoid screenshot override ..4 specify the digit no of screenshot
	File destFile = new File("C:\\Users\\Hp\\OneDrive\\Pictures\\Screenshots\\"+rs+"testscrrenshot.png");
	Files.copy(srcFile, destFile);
    driver.close();
	
	}

}
