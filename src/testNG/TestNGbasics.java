package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {

 @BeforeClass
  public void launchBrowser() {
  System.out.println("launch chrome browser");
}

 @BeforeMethod
 public void enterURL() {
 System.out.println("enter url");
 
 }
 @BeforeTest
 public void launchbrowser() {
 System.out.println("launch browser"); 
 }
 
 @BeforeSuite
 public void setup() {
 System.out.println("install chrome"); 
 }

 @Test
 public void googleTitleTest() {
 System.out.println("googleTitleTest");
 }

 @AfterMethod
 public void logout() {
 System.out.println("logout");
 }

 @AfterTest
 public void deleteAllCookies() {
 System.out.println("deleteAllCookies"); 
 }

 @AfterClass
 public void closeBrowser() {
 System.out.println("closeBrowser"); 
 }
 @AfterClass 
 public void generateTestReport() {
 System.out.println("generateTestReport");  
 }

}
