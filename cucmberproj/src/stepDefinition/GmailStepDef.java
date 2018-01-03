package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailStepDef {
	WebDriver d;
	@Given("^when we launch the browser$")
	public void when_we_launch_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","F://After Grad//Udemy QA Selenium//Browser Drivers//chromedriver.exe");
		 
		d= new ChromeDriver();
		
	}

	@Given("^we navigate to gmail\\.com$")
	public void we_navigate_to_gmail_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.get("https://gmail.com");
	}

	@When("^when i enter user name$")
	public void when_i_enter_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("badguys.30@gmail.com");
		d.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(5000);
		
	}

	@When("^i enter password$")
	public void i_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("dadmomlove");
		
	    
	}

	@When("^i clicked on login button$")
	public void i_clicked_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 d.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	 
	}

	@Then("^check for the page title$")
	public void check_for_the_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


}
