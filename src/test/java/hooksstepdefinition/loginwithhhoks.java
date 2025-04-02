//package hooksstepdefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.*;
//
//public class loginwithhhoks {
//	WebDriver driver;
//	@Before(value="@smoke",order=1)//this wiill executed before ecah sceraio
//	public void browser_setup() {
//		System.out.println("---i am inside the browser---");
//		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/cumcumber/src/test/resources/drivers/chromedriver.exe" );
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//increase the preformance
//		    
//		    driver.manage().window().maximize();
//	}
//	@Before(order=2)
//	public void browser_setup1() {
//		System.out.println("i am setup2");
//	
//	}
//	@After
//	public void teardown() {
//		//System.out.println("i am inside tearndown");
//		//driver.close();
//		driver.quit();
//	}
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	    
//	}
//	@BeforeStep
//	public void beforesteps() {
//		System.out.println("i am in before steps");
//	}
//	@AfterStep
//	public void aftersteps() {
//		System.out.println("i am in before steps");
//	}
//
//
//	@When("user enters valid  {string} and valid {string}")
//	public void user_enters_valid_and_valid(String string, String string2) {
//	    
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//	    
//	}
//
//	@Then("user is navigated to language select page")
//	public void user_is_navigated_to_language_select_page() {
//	   
//	}
//
//
//
//
//}
