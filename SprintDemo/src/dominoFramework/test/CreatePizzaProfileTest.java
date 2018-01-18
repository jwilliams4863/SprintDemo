package dominoFramework.test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dominoFramework.page.CreatePizzaProfile;
import seleniumGeneralFunctions.TestBase;

public class CreatePizzaProfileTest extends TestBase{

	private CreatePizzaProfile page;

	public CreatePizzaProfileTest() {
		baseURL = "https://www.dominos.com/en/pages/customer/#/customer/profile/new";
		setWaittime(3000);  // Some of the tests are failing when this is set to 1000 (1 second), 
		//have to find some other way to make sure the page is loaded before the checks fail.
	}

	@BeforeMethod
	public void setupTest () {
		//Set & Get ThreadLocal Driver with Browser
		driver.navigate().to(baseURL);
		page = PageFactory.initElements(driver, CreatePizzaProfile.class);

	}

	@Test
	public void enterFirstName() throws InterruptedException {
		WaitFor();
		page.enterFirstName("Bob\n");
		WaitFor();

		System.out.println("Confirming that 'Bob' was entered in the First Name field which is: " + page.getFirstName());
		assertEquals("Bob", page.getFirstName());
		////*[@id="Last_Name-error"]
		System.out.println("Comparing displayed Last Name error message with expected.  The webpage displays: " + 
				driver.findElement(By.id("Last_Name-error")).getText());
		assertEquals("This field is required.", driver.findElement(By.id("Last_Name-error")).getText());
		WaitFor();
	}

	@Test
	public void enterLastName() throws InterruptedException {
		WaitFor();
		page.enterLastName("TheBoss");

		WaitFor();
	}

	@Test
	public void enterEmail() throws InterruptedException {
		WaitFor();
		page.enterEmail("incorrectemail$wrong.com\n");

		System.out.println("Comparing displayed Email error message with expected.  The webpage displays: " + 
				driver.findElement(By.id("Email-error")).getText());
		assertEquals("That email is totally wrong and so is this.", driver.findElement(By.id("Email-error")).getText());

		WaitFor();
	}

	@Test
	public void confirmEmail() throws InterruptedException {
		WaitFor();
		page.confirmEmail("doesnotmatchatall");

		WaitFor();
	}

	@Test
	public void enterPassword() throws InterruptedException {
		WaitFor();
		page.enterPassword("SuperSecretSauce");

		WaitFor();
	}

	@Test
	public void confirmPassword() throws InterruptedException {
		WaitFor();
		page.confirmPassword("SauceSecretSuper");

		WaitFor();
	}

	@Test
	public void enterPhone() throws InterruptedException {
		WaitFor();
		page.enterPhone("911");

		WaitFor();
	}

	@Test
	public void enterBothEmailFields() throws InterruptedException {
		WaitFor();
		page.enterEmail("correct@email.com");

		page.confirmEmail("doesnotmatchatall@something.com\n");

		System.out.println("Comparing displayed for non matching emails error message with expected.  The webpage displays: " + 
				driver.findElement(By.id("Confirm_Email-error")).getText());
		assertEquals("Please enter the same value again.", driver.findElement(By.id("Confirm_Email-error")).getText());

		WaitFor();
	}


}
