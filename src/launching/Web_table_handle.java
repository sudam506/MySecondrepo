package launching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table_handle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Australian_Securities_Exchange");
       List<WebElement> allHeader= driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody"));
       System.out.println(allHeader.size());
       List<WebElement> r = driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr"));
       System.out.println(r.size());
       int rowsize= r.size();     //to store 
     
       //to print no of columns
       List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr[1]/th"));  //remove the index of column
       System.out.println(column.size());
       int columnsize= column.size();  //to store column
     
//       for(int i=1; i<=rowsize; i++) {
//       for(int j=1; j<=columnsize; j++) {
//      system.out.print(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[2]/tbody/tr[" + i + "]/td[" + j + "]"))).getText());
//       }
//       System.out.println();
       
      for(WebElement ele:allHeader){
	  String value=ele.getText();
	  System.out.println(value);
}
    driver.close();

}
}