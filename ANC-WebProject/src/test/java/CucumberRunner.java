package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.salam.selenium.tests"},
        plugin = { "pretty", "html:target/cucumber-reports" }
)
public class CucumberRunner {
}