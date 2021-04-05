package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;


public class test1 {
	
	WebDriver driver ;
	
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\chandu\\AppData\\Local\\Programs\\Python\\Python39\\Scripts\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver() ;
	  
  }
}
