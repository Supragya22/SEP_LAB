import static org.testng.Assert.assertEquals;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration
{

@Given("I am on the Registration page")
public void i_am_on_the_registration_page() {
	// Set up Chrome WebDriver
    String chromeDriverPath = Paths.get("src", "test", "resources", "Drivers").toString();
    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://workshop-8e267.web.app/%22);");
}

@When("I enter Name collegename email instituteId Mobile Department")
public void i_enter_name_collegename_email_institute_id_mobile_department() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://workshop-8e267.web.app/Register%20Form/form.html");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.id("name")).sendKeys("Uttam");
	driver.findElement(By.id("collegename")).sendKeys("BIT");
	driver.findElement(By.id("email")).sendKeys("uttamk7561@gmail.com");
	driver.findElement(By.id("instituteid")).sendKeys("MCA\10016\23");
	driver.findElement(By.id("mobile")).sendKeys("98018819982");
	driver.findElement(By.id("Dept")).sendKeys("MCA");
	Thread.sleep(5000);
//	WebElement button = driver.findElement(By.id("Register-btn"));
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", button);
//	assertEquals(driver.getTitle(),"Register form");
//	System.out.println(driver.getTitle());
//	System.out.println("Register Successful");
//	driver.close();
//	driver.quit();
}

@When("I click on the registration button")
public void i_click_on_the_registration_button() {
	ChromeDriver driver=new ChromeDriver();
	WebElement button = driver.findElement(By.id("Register-btn"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", button);
//	assertEquals(driver.getTitle(),"Register form");
//	System.out.println(driver.getTitle());
//	System.out.println("Register Successful");
}

@Then("I should be directed to the Payment Method")
public void i_should_be_directed_to_the_payment_method() {
	ChromeDriver driver=new ChromeDriver();
	assertEquals(driver.getTitle(),"Register form");
	System.out.println(driver.getTitle());
	System.out.println("Register Successful");
	driver.close();
	driver.quit();
}
}