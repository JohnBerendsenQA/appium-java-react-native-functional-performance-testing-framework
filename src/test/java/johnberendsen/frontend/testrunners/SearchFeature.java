package johnberendsen.frontend.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import johnberendsen.utils.RunnerHooks;

@ComponentScan(basePackages = {"johnberendsen"})
@Configuration
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber.json", features = {
        "src/test/resources/features/news/search.feature"},
        glue = "johnberendsen")
public class SearchFeature extends RunnerHooks {
}
