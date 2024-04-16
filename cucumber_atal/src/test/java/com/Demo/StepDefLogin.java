package com.Demo;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {
	
	static WebDriver driver;

	@Given("user is in login page")
	public void user_is_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username and password") 
	public void user_enters_username_and_password()throws InterruptedException
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-name")).sendKeys(("standard_user"));
	    driver.findElement(By.id("password")).sendKeys(("secret_sauce"));
	    Thread.sleep(2000);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to new page")
	public void user_is_navigated_to_new_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).getSize().getHeight()>0);
	}
	
}
