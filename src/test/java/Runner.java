import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/bittechconsulting/eclipse-workspace/BDDCucumber_BTC171224M/driven.feature"},
					 tags= {"tag1"})

public class Runner {
	public void test1()
	{
		System.out.println("hi");
	}

}