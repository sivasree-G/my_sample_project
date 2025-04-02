package moviedefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class watchlistpagefactory {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div[2]/div[3]/div[1]")
	WebElement mousehover;
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div[2]/div[3]/div[2]/div/ul/a[2]/li/img")
	WebElement clickwatch;
	public watchlistpagefactory(WebDriver driver) {
		this.driver = driver;  
        PageFactory.initElements(driver, this);
    }
	public void mousehovering() {
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement e2 = wait2.until(ExpectedConditions.visibilityOf(mousehover));
		Actions builder =new Actions(driver);//for perform the mouse hovering
	    builder.moveToElement(e2).perform();
		
		
	}
	
	
    public void watchlistclick() {
    	clickwatch.click();
    
    }

}
