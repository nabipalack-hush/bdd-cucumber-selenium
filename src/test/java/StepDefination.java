import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.browser.BaseTest;
import cucumber.api.DataTable;
import com.bit.browser.LandingPage;
import com.bit.browser.ProfilePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	
	
	

//	@When("^i type my valid userId \"([^\"]*)\"$")
//	public void i_type_my_valid_userId(String s) throws Throwable {
//	    System.out.println(s);
//	    driver.findElement(By.id("")).sendKeys(s);
//	}
//
//	@When("^i type my valid pass \"([^\"]*)\"$")
//	public void i_type_my_valid_pass(String arg1) throws Throwable {
//	   System.out.println(arg1);
//	}
	BaseTest b=new BaseTest();
	LandingPage l;
	ProfilePage p;
	
	@Given("^open anybrowser$")
	public void open_anybrowser(DataTable arg1) throws Throwable 
	{
		List<List<String>> values=arg1.raw();
		String browser=values.get(1).get(0);
		b.openAnyBrowser(browser);
	}
	
	
	
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		b.openBrowser();
	}

	@Given("^nevigate to Facebook\\.com$")
	public void nevigate_to_Facebook_com() throws Throwable {
	    l=b.nevigateURL();
	}

	@When("^i type my valid userId$")
	public void i_type_my_valid_userId() throws Throwable {
	 l.typeUserId();
	}

	@When("^i type my valid pass$")
	public void i_type_my_valid_pass() throws Throwable {
		l.typePass(); 
	}

	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
	   // driver.findElement(By.id("")).click();
		p=l.clickLogInButton();
	}

	@Then("^as a user i should be on login page$")
	public void as_a_user_i_should_be_on_login_page() throws Throwable {
	   p.verifyProfilePage();
	}
	@When("^i type my invalid userId$")
	public void i_type_my_invalid_userId() throws Throwable {
	   
	}

	@When("^i type my invalid pass$")
	public void i_type_my_invalid_pass() throws Throwable {
	    
	}

	@Then("^as a user i should not be on login page$")
	public void as_a_user_i_should_not_be_on_login_page() throws Throwable {
	   
	}

}
