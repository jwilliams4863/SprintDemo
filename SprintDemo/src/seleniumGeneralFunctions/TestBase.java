package seleniumGeneralFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import ThreadLocalDriver.ThreadLocalDriver;

public class TestBase extends OpenLinks {

    protected WebDriverWait wait;
    private ThreadLocalDriver TLDriverFactory = new ThreadLocalDriver();
    protected String baseURL;
 
	public TestBase () {
		super();
		baseURL = "https://www.google.com/"; // default site	
	}
	

    //Do the test setup
	@BeforeSuite
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
    	TLDriverFactory.setTLDriver();
        driver = TLDriverFactory.getTLDriver().get();
        wait = new WebDriverWait(driver, 15);
		jse = (JavascriptExecutor)OpenLinks.driver;		
	}
	
   
    @AfterSuite
    public synchronized void tearDown() throws Exception {
    	//driver.close();
    	driver.quit();
        TLDriverFactory.getTLDriver().remove();
    }
}
 
 
