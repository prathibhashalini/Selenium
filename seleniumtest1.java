package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chandu\\AppData\\Local\\Programs\\Python\\Python39\\Scripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.lambdatest.com/";
       // String expectedTitle = "LambdaTest - Perform all your tests on cloud";
       // String actualTitle = "";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

	}

}
