package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defination {
	
	
	String url="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	
	
	@Given("I should go to the Login Page")
	public void i_should_go_to_the_login_page() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
	    
	}
	@And("Enter the username {string}")
	public void enter_the_username(String string) {
		
		
	    driver.findElement(By.name("userName")).sendKeys(string);
		
		
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		
		driver.findElement(By.name("password")).sendKeys(string);
	   
	}
	@And("Click onthe Login Button")
	public void click_onthe_login_button() {
		
		driver.findElement(By.name("submit")).click();;
	    
	}
	@Then("I should see the title name as {string}")
	public void i_should_see_the_title_name_as(String string) {
		
	String T=	driver.getTitle();
	Assert.assertEquals(string, T);
	
	System.out.println(T);
	
	driver.close();
	    
	}

	
	
}
