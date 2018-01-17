package ThreadLocalDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesMgr {

    public DesiredCapabilities getCapabilitiesMgr (String browser, String platform) {
        //Set DesiredCapabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //Set Platform
        capabilities.setCapability("platform", platform);
        //Set BrowserName
        capabilities.setCapability("browserName", browser);
        
    return capabilities;
    }


}

