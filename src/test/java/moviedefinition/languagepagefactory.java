package moviedefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class languagepagefactory {
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[1]/div/div[2]")
	WebElement tamillang;
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[2]/div/button")
	WebElement Donelclick;
	WebDriver driver;
	public languagepagefactory(WebDriver driver) {
		this.driver = driver;  
        PageFactory.initElements(driver, this);
    }
	public void selecttamil(String language) {
		 WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement e1=wait.until(ExpectedConditions.visibilityOf(tamillang));//click the done button
    	e1.click();
	}
	public void clickdone() {
		 WebDriverWait wait = new WebDriverWait(driver, 40);
			WebElement e2=wait.until(ExpectedConditions.visibilityOf(Donelclick));//click the done button
	    	e2.click();
		
	}
	

}
