package launching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_account {


  @SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
     
	 driver.findElement(By.partialLinkText("Create New Account")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sud");
     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");

     driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9420252919");
	 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("5695");
	
	WebElement day= driver.findElement(By.id("day"));
    WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
    WebElement year= driver.findElement(By.id("year"));

    Select select =new Select(day);
    select.selectByVisibleText("5");
    Select select1 =new Select(month);
    select1.selectByVisibleText("Jun");
    Select select2=new Select(year);
	select2.selectByVisibleText("1995");
  
  System.out.println(driver.findElement(By.xpath("//input[@value='-1']")).isSelected());
  driver.findElement(By.xpath("//input[@value='2']")).click();
 
  driver.findElement(By.xpath("//label[text()='Custom']")).click();
  WebElement frd=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
  Select select3= new Select(frd);
  select3.selectByVisibleText("She: \"Wish her a happy birthday!\"");
  
  driver.findElement(By.xpath("//button[text()='Sign Up'][1]")).click();
  System.out.println("done");
		
	

  
	
	//driver.quit();
	}


}