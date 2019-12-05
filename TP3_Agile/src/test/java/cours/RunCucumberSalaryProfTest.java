package cours;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;  
import org.junit.runner.RunWith;  

@RunWith(Cucumber.class) 
@CucumberOptions(
		plugin = "pretty",
	    features="/Users/utilisateur/Documents/EclipseWorkPlace/CucumberTest/src/test/resources/cours/SalaryProf.feature",
	    dryRun = false
	)
public class RunCucumberSalaryProfTest { }
