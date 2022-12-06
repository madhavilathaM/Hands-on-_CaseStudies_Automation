package runnerguru;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/runnerguru/runnerguru.feature"}, glue="definationguru",tags = "@PositiveTesting",plugin ={"html:testoutput/cucumber.html"})
public class runnerclass  {
}