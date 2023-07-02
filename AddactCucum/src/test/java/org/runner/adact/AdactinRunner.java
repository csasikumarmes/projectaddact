package org.runner.adact;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\feature"}, glue = {"org.step.adact","hooks"},
dryRun = false, 
tags = "@Reg",
monochrome = false,
plugin= {"html:report/WebReport"}
			
		)


public class AdactinRunner {

}
