package seleniumGeneralFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import dominoFramework.DefaultPageTest;

public class OpenLinks {
	static WebDriver driver;
	public static WebElement element = null;
	static JavascriptExecutor jse;
/*
	Constructor
*/
	public OpenLinks(WebDriver driver){
		OpenLinks.driver = driver;
		jse = (JavascriptExecutor)OpenLinks.driver;
	}
	
/*
	Wait for the page to finish loading.
	
*/
	public static void waitForLoad() {
		
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>()
		 {
			public Boolean apply(WebDriver driver) {           
				return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	        }

		 };
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(pageLoadCondition);
	}
/*	
	Open Link in New Window
*/	
	public static void openNewWindow(WebElement link) throws InterruptedException {
		Actions newwindow = new Actions(driver);
		
		newwindow.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}
		
/*	
 *  Open Link in New Tab
*/
	public static void openNewTab(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}
	
/*	
	Close Tab
*/	
	public static void CloseTab(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}

/*	
	Close Window

*/	
	public static void closeWindow(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}
/*	
	Resize Window
*/
	public static void resizeWindow(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}
/*	
	Scroll Window
*/	
	public static void scrollWindow(String direction, int amount) throws InterruptedException {

		if (direction.equals("Up")) {
			jse.executeScript("window.scrollBy(0, -" + amount + ")");
		}
		else if (direction.equals("Down")) {
			jse.executeScript("window.scrollBy(0, " + amount + ")");
		}
		else {
			//Received an invalid direction, how do I handle this?  **FIX**
		}

		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}
	
/*	
 * Incognito Mode?  **FIX**
*/	
	public static void openIncognito(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}
/*
	Navigate back one page in history	
*/	
	public static void goBackPage() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		jse.executeScript("window.history.go(-1)");
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}

/*
	Hover Over element	
*/	
	public static void hoverOver(WebElement element) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
	}
	
	public static void fillTextBoxID(String ID, String contents) throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		// Clear any contents that may be in the box
		driver.findElement(By.id(ID)).clear();
		driver.findElement(By.id(ID)).sendKeys(contents);

	}
}
