package moviedefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class favourite {
	@FindBy(xpath="//div[@class='myprofile_watchlist_movies__lQ5F9']/descendant::div[@class='carousels_carousel_data__dVbKV']//descendant::img[@alt='Aramm']")
	WebElement favmovie;
	WebDriver driver;
	public favourite(WebDriver driver) {
		this.driver = driver;  
        PageFactory.initElements(driver, this);
    }
	public void checkfavourite() {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(favmovie));
		if(favmovie.isDisplayed()) {
			System.out.println("favourite movie availabe");
		}
		else {
			System.out.println("favourite movie not vailable");
		}
	}
	

}
