package dominoFramework;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DefaultPageHover {
	

	private WebDriver driver;
	private String baseURL;
	JavascriptExecutor jse;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://www.dominos.com/en/";
		jse = (JavascriptExecutor)driver;

		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, -1000)");
		
		WebElement mainElement = driver.findElement(By.xpath("//button[@data-quid='btn-599mixmatch']"));
		//*[@id="sectionMain"]/div[2]/div/a/div[1]/button
		
		//span[@data-id='table1']/table
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);

		mainElement = driver.findElement(By.xpath("//button[@data-quid='btn-Side899Pan']"));
		//*[@id="sectionMain"]/div[2]/div/a/div[1]/button
		
		//span[@data-id='table1']/table
		
		action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);

		mainElement = driver.findElement(By.xpath("//button[@data-quid='btn-WeekLongCarryoutSide']"));
		//*[@id="sectionMain"]/div[2]/div/a/div[1]/button
		
		//span[@data-id='table1']/table
		
		action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);

		
		//WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		//action.moveToElement(subElement).click().perform();
	}

}
