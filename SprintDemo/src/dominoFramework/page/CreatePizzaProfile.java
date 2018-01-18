package dominoFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import seleniumGeneralFunctions.TestBase;

public class CreatePizzaProfile extends TestBase {

	@FindBy(how=How.ID, using = "First_Name")
	private static WebElement firstNameField;

	@FindBy(how=How.ID, using = "Last_Name")
	private static WebElement lastNameField;

	@FindBy(how=How.ID, using = "Email")
	private static WebElement emailField;

	@FindBy(how=How.ID, using = "Confirm_Email")
	private static WebElement confirmEmailField;

	@FindBy(how=How.ID, using = "Phone")
	private static WebElement phoneField;

	@FindBy(how=How.ID, using = "Create_Password")
	private static WebElement createPasswordField;

	@FindBy(how=How.ID, using = "Confirm_Password")
	private static WebElement confirmPasswordField;

//	driver.findElement(By.xpath("//button[@class='btn profile--create__cta c-customerprofile-createyourprofile']")).click();

	
/*	@FindBy(how=How.XPATH, using = "//a[@class='site-nav__profile__create-account js-createProfile c-header-create-profile']")
	private static WebElement createOneLink;

	@FindBy(how=How.XPATH, using = "//button[@data-quid='btn-599mixmatch']")
	private static WebElement mainCouponBtn;

	@FindBy(how=How.XPATH, using = "//button[@data-quid='btn-Side899Pan']")
	private static WebElement sideTopBtn;
*/	

	public void enterFirstName(String text) throws InterruptedException {
		WaitFor();
		firstNameField.sendKeys(text);
	}

	public String getFirstName() throws InterruptedException {
		WaitFor();
		return firstNameField.getAttribute("value");
	}

	public void enterLastName(String text) throws InterruptedException {
		WaitFor();
		lastNameField.sendKeys(text);
	}

	public void enterEmail(String text) throws InterruptedException {
		WaitFor();
		emailField.sendKeys(text);
	}
	
	public void confirmEmail(String text) throws InterruptedException {
		WaitFor();
		confirmEmailField.sendKeys(text);
	}
	
	public void enterPassword(String text) throws InterruptedException {
		WaitFor();
		createPasswordField.sendKeys(text);
	}

	public void confirmPassword(String text) throws InterruptedException {
		WaitFor();
		confirmPasswordField.sendKeys(text);
	}

	public void enterPhone(String text) throws InterruptedException {
		WaitFor();
		phoneField.sendKeys(text);
	}
	
// Click Carry Out Button
	public void clickCarryoutBtn() throws InterruptedException {
		WaitFor();
//		carryoutBtn.click();
	}
	
}
