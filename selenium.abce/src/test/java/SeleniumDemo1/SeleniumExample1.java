package SeleniumDemo1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExample1{
@Test
public void LoginTest() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	assertEquals(driver.getTitle(),"Google");
	System.out.println(driver.getTitle());
	
	driver.close();
	
}
@Test
public void OrangeTest() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	assertEquals(driver.getTitle(),"OrangeHRM");
	System.out.println(driver.getTitle());
	System.out.println("Login Successful");
			
	driver.close();
	driver.quit();
	
}

}