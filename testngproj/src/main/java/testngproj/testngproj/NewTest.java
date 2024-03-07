package testngproj.testngproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@BeforeTest
	public void preTest() {
		driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
	}

	@Test
	public void Test1() throws InterruptedException {
		// Launch Website
		driver.get(" https://www.saucedemo.com/");
		// Maximize window size of browser
		driver.manage().window().maximize();
		String ActualTitle = "Swag Labs";
		WebElement ExpectedTitle = driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertEquals(ExpectedTitle.getText(), ActualTitle);
	}

	@Test
	public void Test2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		String ActualTitle = "Swag Labs";
		WebElement ExpectedTitle = driver.findElement(By.xpath("//div[@class='app_logo']"));
		Assert.assertEquals(ExpectedTitle.getText(), ActualTitle);
	}

	@Test
	public void Test3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='inventory_list']//div[2]//div[2]//button)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_list']//div[2]//div[2]//button)[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Jyothsna");
		driver.findElement(By.id("last-name")).sendKeys("Reddy");
		driver.findElement(By.id("first-name")).sendKeys("Jyothsna");
		driver.findElement(By.id("postal-code")).sendKeys("1686");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		WebElement ele = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		Assert.assertEquals("Thank you for your order!", ele.getText());
	}

	@Test
	public void Test4() throws InterruptedException {
		driver.get(" https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Enter your login password
		driver.findElement(By.id("password")).sendKeys("secret_sauc");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		String ActualTitle = "Epic sadface: Username and password do not match any user in this service";
		WebElement ExpectedTitle = driver.findElement(By.xpath("//h3[@data-test='error']"));
		Assert.assertEquals(ExpectedTitle.getText(), ActualTitle);

	}
	
	@AfterTest
	public void PostTest() {
	   // Close the browser
		driver.close();
	}

}
