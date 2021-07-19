package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class definitions {
WebDriver driver;
@Given("Login page")
public void login_page() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Fullstac\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
}



@When("enter valid username {string}")
public void enter_valid_username(String string) {
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    
}
@When("enter Valid password {string}")
public void enter_valid_password(String string) {
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    
}
@When("click on submit")
public void click_on_submit() {
	 driver.findElement(By.id("btnLogin")).click();
    
}
@Then("i should see username {string}")
public void i_should_see_username(String string) {
	 String Actual = driver.findElement(By.id("welcome")).getText();
	    String expected ="Welcome Nishanth05";
	    Assert.assertEquals(expected, Actual);
    
}

}
