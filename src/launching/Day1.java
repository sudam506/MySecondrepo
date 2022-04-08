package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.myntra.com/");
	String title = driver.getTitle();
//	System.out.println(title);
//	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("9028605409");
//	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("9028605409");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	String Name_title = "Mr.";
//	driver.findElement(By.xpath("//select[@name='ddlTitle']")).click();
//	driver.findElement(By.xpath("//select[@name='ddlTitle']//option[text()='" + Name_title + "']")).click();
//	driver.findElement(By.xpath("//input[@name='txt_Name']")).sendKeys("Kiran");
//	driver.findElement(By.xpath("//select[@name='ddlTitle']")).click();
//	driver.findElement(By.xpath("//input[@id='rd_female']")).click();
////	driver.findElement(By.xpath("//span[@id='PopCalendar1_Control']")).click();
//	driver.findElement(By.xpath("txt_DOB")).sendKeys("31/08/1995");
////	driver.findElement(By.xpath("//td[@class='OptionOutStyle'][contains(text(),'1995')]")).click();
////	driver.findElement(By.xpath("//td[contains(text(),'August')]")).click();
////	driver.findElement(By.xpath("(//*[contains(text(),'31')])[1]")).click();
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands')]")).sendKeys("books");
	driver.findElement(By.xpath("//span[contains(@class,'desktop-iconSearch')]")).click();
	
	}

}
