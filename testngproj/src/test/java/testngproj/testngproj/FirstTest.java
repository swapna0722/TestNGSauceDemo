package testngproj.testngproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	  @Test
	  public void f() throws InterruptedException {

		        WebDriverManager.chromedriver().setup();
		        WebDriver driver= new ChromeDriver();
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get(" https://www.saucedemo.com/");
		        
		        Thread.sleep(10000);
	  }

}
