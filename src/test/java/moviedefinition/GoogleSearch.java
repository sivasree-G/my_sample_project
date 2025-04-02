////package moviedefinition;
////
////import org.junit.AfterClass;
////import org.junit.Test;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import io.cucumber.java.After;
////import io.cucumber.java.Before;
////import io.cucumber.java.en.*;
////
////public class GoogleSearch {
////   static  WebDriver driver;
////    googlesearchpagefactory searchPage;
////    loginpagefactory login1;
////    languagepagefactory page;
////    watchlistpagefactory watch;
////    favourite fav;
////    
////
////
////
////    @Given("browser is open")
////    public void browser_is_open() {
////        System.out.println("---Opening Browser---");
////        
////        
////      System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/cumcumber/src/test/resources/drivers/chromedriver.exe" );
////		
////      driver = new ChromeDriver(); // Initializes WebDriver instance
//////      
////      driver.manage().window().maximize();
////      searchPage = new googlesearchpagefactory(driver); // Initialize PageFactory
////    }
////
////    @AfterClass
//////    public void closebrowser() {
//////        driver.quit();
//////    }
////    
////    @And("user is on the google page")
////    public void user_is_on_the_google_page() {
////        driver.get("https://www.google.co.in/");
////    }
////
////    @When("user enters a correct {string} in google search box")
////    public void user_enters_a_correct_in_google_search_box(String name) {
////        searchPage.enterSearchTerm(name);
////    }
////
////    @When("user clicks first searching terms")
////    public void user_clicks_first_searching_terms() {
////        
////        searchPage.clickFirstSearchResult();
////    }
////
////    @Then("user is navigated to next login page")
////    public void user_is_navigated_to_next_login_page() {
////       
////    	loginpagefactory login =new loginpagefactory(driver);
////      
////        
////    }
//     @Given("browser is open")
////    public void browser_is_open() {
////        System.out.println("---Opening Browser---");
////        
////        
////      System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/cumcumber/src/test/resources/drivers/chromedriver.exe" );
////		
////      driver = new ChromeDriver(); // Initializes WebDriver instance
//////      
////      driver.manage().window().maximize();
////      searchPage = new googlesearchpagefactory(driver); // Initialize PageFactory
////    }
//     @And("user is on the google page")
////   public void user_is_on_the_google_page() {
////       driver.get("https://www.google.co.in/");
////   }
////
////   @When("user enters a correct {string} in google search box")
////   public void user_enters_a_correct_in_google_search_box(String name) {
////       searchPage.enterSearchTerm(name);
////   }
////
////   @When("user clicks first searching terms")
////   public void user_clicks_first_searching_terms() {
////       
////       searchPage.clickFirstSearchResult();
////   }
////
////   @Then("user is not navigated to next login page")
////   public void user_is_navigated_to_next_login_page() {
//     System.out.println("no navigation");
////      
////   	loginpagefactory login =new loginpagefactory(driver);
////     
////       
////   }
////    @Given("user is on sunntx login page")
////	public void user_is_on_sunntx_login_page() {
////    	System.out.println("I am in login page");
////        if (driver == null) {
////            throw new IllegalStateException("WebDriver is not initialized!");
////        }
////        login1 = new loginpagefactory(driver); 
////	    
////	}
////
////	@When("user enters valid  {string} and valid {string}")
////	public void user_enters_valid_and_valid(String email, String password) {
////		
////		    if (login1 == null) {
////		        throw new IllegalStateException("LoginPageFactory is not initialized!");
////		    }
////		    login1.enteremail(email);
////		    login1.enterpassword(password);
////		}
////
////	    
////	
////	@When("clicks on login button")
////	public void clicks_on_login_button() {
////		login1.clicksigin();
////		
////	   
////	}
////
////	@Then("user is navigated to language select page")
////	public void user_is_navigated_to_language_select_page() {
////		login1.languagenavigation();
////	   
////	}
////	@Given("user is on the language selecting page")
////	public void user_is_on_the_language_selecting_page() {
////	    System.out.println("user is on language selecting page");
////	    page=new languagepagefactory(driver);
////	}
////
////	@When("user selects the favourite {string} language")
////	public void user_selects_the_favourite_language(String string) {
////	    page.selecttamil(string);
////	}
////
////	@Then("user click on Done button")
////	public void user_click_on_done_button() {
////	   page.clickdone();
////	}
////
////	@Then("user navigate to the home page")
////	public void user_navigate_to_the_home_page() {
////	    System.out.println("enter into the home page");
////	}
////	@Given("the user is on the home page")
////	public void the_user_is_on_the_home_page() {
////	    System.out.println("user is on the home page");
////	    watch=new watchlistpagefactory(driver);
////	}
////
////	@When("the user hovers over the profile picture")
////	public void the_user_hovers_over_the_profile_picture() {
////		watch.mousehovering();
////		
////	    
////	}
////
////	@And("the user clicks on the watchlist")
////	public void the_user_clicks_on_the_watchlist() {
////		watch.watchlistclick();
////	   
////	}
////
////	@Then("the user navigates to the watchlist page")
////	public void the_user_navigates_to_the_watchlist_page() {
////		System.out.println("navigate to the watchlist");
////	    
////	}
////	@Given("user is on the watchlist page")
////	public void user_is_on_the_watchlist_page() {
////	    System.out.println("user is on the watchlist page");
////	    fav=new favourite(driver);
////	}
////
////	@When("favourite  movie is present or not")
////	public void favourite_movie_is_present_or_not() {
////		fav.checkfavourite();
////		
////	   
////	}
////
////	@Then("user watch the movie")
////	public void user_watch_the_movie() {
////	    System.out.println("now watch your movie");
////	}
////
////
////
////
////
////
////
////
////
////
////
////}
////
////
//
