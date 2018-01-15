package dominoFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumGeneralFunctions.OpenLinks;

public class DefaultPage {

	static WebDriver driver;
	public static WebElement element = null;
	
	public DefaultPage(WebDriver driver) {
		DefaultPage.driver = driver;	
	}

	/*Returns the Delivery Button element
	*/
	public static WebElement deliveryBtn() {
		element = driver.findElement(By.xpath("//a[@data-quid='start-your-order-delivery']"));
		return element;
	}
	
	// Click Delivery Button
	public static void clickDeliveryBtn() throws InterruptedException {
		Thread.sleep(500);
		checkOverlayClose();
		Thread.sleep(500);
		deliveryBtn().click();
	}
	
	// This needs to check to make sure the element exists and is visible otherwise it will return a failure in the test.  **FIX**
	public static void checkOverlayClose() {
		// Check to see if the element is present and visible so it can be clicked on without causing a failure.
		if((driver.findElement(By.xpath("//a[@class='card--overlay__close js-close-button']")) != null) &&
		   (driver.findElement(By.xpath("//a[@class='card--overlay__close js-close-button']")).isDisplayed())) {
			element = driver.findElement(By.xpath("//a[@class='card--overlay__close js-close-button']"));
			element.click();
		}
	}
	
	/*Returns the carry-out button element
	*/
	public static WebElement carryoutBtn() {
		element = driver.findElement(By.xpath("//a[@data-quid='start-your-order-carryout']"));
		return element;
	}

	public static void clickCarryoutBtn() throws InterruptedException {
		Thread.sleep(500);
		carryoutBtn().click();
	}
	
	/*Returns the Sign in and Earn Rewards element
	*/
	public static WebElement signInandEarnBtn() {
		element = driver.findElement(By.xpath("//a[@class='site-nav__profile__sign-in js-login c-header-customer-login site-nav__profile__sign-in--loyalty']"));
		return element;
	}

	public static void clickSignInandEarnBtn() throws InterruptedException {
		Thread.sleep(500);
		signInandEarnBtn().click();
	}
	
	/*Returns the Profile Creation element
	*/
	public static WebElement ProfileCreationLink() {
		element = driver.findElement(By.id(""));
		return element;
	}

	/*Returns Order Now button(s)
	 * 
	*/
	public static WebElement orderNowBtn() {
		element = driver.findElement(By.id("btn-599mixmatch"));
		return element;
	}

	public static void hoverMainCoupon() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-599mixmatch']"));

		OpenLinks.hoverOver(element);
	}

	public static void clickMainCoupon() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-599mixmatch']"));
		OpenLinks.hoverOver(element);
		element.click();
		
	}	
	
	public static void hoverSideTop() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-Side899Pan']"));

		OpenLinks.hoverOver(element);
	}

	public static void clickSideTop() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-Side899Pan']"));
		OpenLinks.hoverOver(element);
		element.click();
		
	}
	
	public static void hoverSideBottom() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-WeekLongCarryoutSide']"));

		OpenLinks.hoverOver(element);
	}

	public static void clickSideBottom() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-WeekLongCarryoutSide']"));
		OpenLinks.hoverOver(element);
		element.click();
		
	}
		
}
