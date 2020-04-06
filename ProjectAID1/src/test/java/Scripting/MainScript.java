package Scripting;

//test

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainScript {

WebDriver driver;
//testqqqssaaasa
@Given("^Enter build path$")
public void enter_build_path() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "D:\\Selinium Web Driver\\drivers\\chromedriver.exe");
	  Thread.sleep(3000);
	  driver=new ChromeDriver();
driver.get("http://apps.qaplanet.in/hrm/login.php");

}

@When("^valid userid and passwrd$")
public void valid_userid_and_passwrd() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  WebElement pd=driver.findElement(By.xpath("//input[@name='txtPassword']"));
	 pd.clear();
	 pd.sendKeys("lab1");
	 Thread.sleep(1000);
	 By login=By.xpath("//input[@name='Submit']");
	 WebElement lg=driver.findElement(login);
	 lg.click();
    
}

@Then("^home page disapleyd$")
public void home_page_disapleyd()  {
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");	 

}


}
