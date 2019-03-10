package johnberendsen.frontend.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import johnberendsen.utils.RunnerHooks;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"johnberendsen"})
@Configuration
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber.json", features = {
        "src/test/resources/features/news/favourites.feature"},
        glue = "johnberendsen")
public class FavouritesFeature extends RunnerHooks {
}
