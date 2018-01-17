package seleniumGeneralFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import ThreadLocalDriver.ThreadLocalDriver;
import dominoFramework.DefaultPage;

public class TestBasis {

	protected static WebDriver driver;
    protected WebDriverWait wait;
    private ThreadLocalDriver TLDriverFactory = new ThreadLocalDriver();
    protected String baseURL;
	private DefaultPage homePage;
	private OpenLinks openLinks;

 
	public TestBasis () {
		baseURL = "https://www.google.com/"; // default site	
	}
    //Do the test setup
    @BeforeMethod
    //@Parameters(value={"browser"})
    public void setupTest () {
        //Set & Get ThreadLocal Driver with Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
    	TLDriverFactory.setTLDriver();
        driver = TLDriverFactory.getTLDriver().get();
        wait = new WebDriverWait(driver, 15);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		baseURL = "https://www.dominos.com/en/";
		homePage = new DefaultPage(driver);
		openLinks = new OpenLinks(driver);
		driver.navigate().to(baseURL);

    }
    
    @AfterMethod
    public synchronized void tearDown() throws Exception {
    	//driver.close();
    	driver.quit();
        TLDriverFactory.getTLDriver().remove();
    }
}
 
 
