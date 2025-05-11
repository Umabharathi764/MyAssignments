package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/main/java/features" ,glue={"steps","hooks"} ,monochrome=true ,publish=true,tags="@Lead")
public class RunnerClass extends AbstractTestNGCucumberTests {

}
