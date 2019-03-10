package johnberendsen.performance;

import johnberendsen.utils.performancetestutils.DumpsysGFX;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class PerformanceSteps {

    public void startGFX(String appPackage) {
        DumpsysGFX.resetDumpsys(appPackage);
    }
}
