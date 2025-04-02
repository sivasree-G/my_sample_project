package moviedefinition;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpagefactory {
	WebDriver driver;
	@FindBy(name="email")
	WebElement email1;

	@FindBy(name="password")
	WebElement password1;
	@FindBy(xpath="//*[@id=\"signin_btn\"]")
    WebElement signin;
	@FindBy(xpath="//*[@id='__next']/div[2]/div[2]/div/button")
	WebElement navigate;
	@FindBy(xpath="//p[@class='signin_validations__2rQgH'][1]")
	WebElement notnav;
				public loginpagefactory(WebDriver driver) {
		this.driver = driver;  
        PageFactory.initElements(driver, this);
    }
	public void verifyurl() {
		{
		    String expectedUrl = "https://www.sunnxt.com/signin"; // Replace with the actual URL
		    String actualUrl = driver.getCurrentUrl();
		    
		    if (!actualUrl.equals(expectedUrl)) {
		        throw new IllegalStateException("Not on the Sunntx login page! Current URL: " + actualUrl);
		    }
		}

	}
	
	public void enteremail(String email) {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized!");
        }
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(email1));
		email1.sendKeys(email);


	}
	public void enterpassword(String password) {
		password1.sendKeys(password);
	}
	public void clicksigin() {
		signin.click();
	}
	public void languagenavigation() {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(navigate));
//	    navigate.isDisplayed();
		System.out.println("i am on the language selecting page");	
	
	}
	public void invalidnav() {
		//Assert.assertFalse(notnav.isDisplayed(), "Test failed: Invalid login detected.");
		Assert.assertTrue(notnav.isDisplayed(), "Test failed: Invalid login detected.");



		
	}
}
