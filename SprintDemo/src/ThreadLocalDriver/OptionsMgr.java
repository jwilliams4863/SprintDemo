package ThreadLocalDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsMgr {

    //Get Chrome Options
    public static ChromeOptions getChromeOptions() {

    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-impl-side-painting");
        options.addArguments("--no-sandbox");
        
        //options.addArguments("--incognito");
        return options;
        /*ChromeDriverService service = new ChromeDriverService.Builder()
                .usingAnyFreePort()
                .build();
        ChromeDriver driver = new ChromeDriver(service, options);*/
    }
 }