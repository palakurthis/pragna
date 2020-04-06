package Scripting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC2 {
	WebDriver driver;
	@Given("^Enter build path$")
	public void enter_build_path() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium Web Driver\\drivers\\chromedriver.exe");
		  Thread.sleep(3000);
		  driver=new ChromeDriver();
	driver.get("http://apps.qaplanet.in/hrm/login.php");

	}

	@When("^user enters invalid userid and passwrd$")
	public void user_enters_invalid_userid_and_passwrd() throws Throwable {
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet10");
		  WebElement pd=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		 pd.clear();
		 pd.sendKeys("lab1");
		 Thread.sleep(1000);
		 By login=By.xpath("//input[@name='Submit']");
		 WebElement lg=driver.findElement(login);
		 lg.click();
	    
	}

	@Then("^user should get an error message like \"([^\"]*)\"$")
	public void user_should_get_an_error_message_like(String arg1) throws Throwable {
		String errmsg=driver.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		Assert.assertEquals(errmsg, "Invalid Login");
	}


}
