package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	WebDriver driver;
	@Given("User is on AdactIn page")
	public void user_is_on_AdactIn_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swetha\\eclipse-workspace-Swetha\\Cucumber\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://adactin.com/HotelApp/");
	    driver.manage().window().maximize();
	    }

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Tom");
		WebElement pass = driver.findElement(By.id("password"));
	   pass.sendKeys("Hai");
	    }

	@Then("User click the login button")
	public void user_click_the_login_button() {
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	    }


	

}
