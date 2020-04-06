package ProjectGID1.ProjectAID1;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="Feature")
public class RunTestNG {
  
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("Extentreporting/ER.xml"));
    
    }
}
/*,glue={"Scripting"},,plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true)*/
