package seleniumGeneralFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OpenLinks {
	static WebDriver driver;
	public static WebElement element = null;
	static JavascriptExecutor jse;

	public OpenLinks(WebDriver driver){
		OpenLinks.driver = driver;
		jse = (JavascriptExecutor)OpenLinks.driver;

	}
	
	//Open Link in New Window
	public static void openNewWindow(WebElement link) throws InterruptedException {
		Actions newwindow = new Actions(driver);
		
		newwindow.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(6000);
	}
		
	//Open Link in New Tab
	public static void openNewTab(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
	}
	
	//Close Tab
	public static void CloseTab(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
	}

	
	//Close Window
	public static void closeWindow(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
	}
	
	// Resize Window
	public static void resizeWindow(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
	}
	
	// Scroll Window
	public static void scrollWindow(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
	}
	
	// Incognito Mode?
	public static void openIncognito(WebElement link) throws InterruptedException {
		Actions newtab = new Actions(driver);
		
		newtab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
	}
	
	public static void goBackPage() throws InterruptedException {
		Thread.sleep(2000);
		jse.executeScript("window.history.go(-1)");
		Thread.sleep(6000);
	}
	
	public static void hoverOver(WebElement element) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
	}
}
