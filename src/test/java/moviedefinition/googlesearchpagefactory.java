package moviedefinition;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilityjava.readxlsx;

public class googlesearchpagefactory {
    WebDriver driver;

    @FindBy(className="gLFyf")  
    WebElement searchBox;

    @FindBy(xpath = "//h3[contains(text(),'Sign In')]") 
    WebElement firstsearch;

    @FindBy(xpath = "//button[contains(text(), 'LOG IN')]") 
    WebElement login;

    public googlesearchpagefactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   @Test(dataProviderClass=readxlsx.class,dataProvider="test")
    public void enterSearchTerm(String term,String row) throws IOException, InterruptedException {
        searchBox.sendKeys(term);
        searchBox.submit();
        ArrayList<String> searchValues = readxlsx.provider(term,row); 
        for (String product : searchValues) {
            System.out.println("Searching for: " + product);
            Thread.sleep(1500);
            searchBox.sendKeys(term);
            searchBox.submit();

            Thread.sleep(1500);
        }

    }

    public void clickFirstSearchResult() {
    	 WebDriverWait wait = new WebDriverWait(driver, 40);  // Wait for 20 seconds
         wait.until(ExpectedConditions.elementToBeClickable(firstsearch));
    	
        firstsearch.click();
    }

    public void clickLoginButton() {
        login.click();
    }
}

