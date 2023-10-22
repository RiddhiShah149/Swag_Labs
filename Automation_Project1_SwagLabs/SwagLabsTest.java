package Automation_Project1_SwagLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabsTest {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private LoginPage loginpage;
	private ProductsPage productpage;
	private CartPage cartpage;
	private CheckOutPage_StepOne checkout_step1;
	private CheckOutPage_StepTwo checkout_step2;
	
	
	@BeforeTest
	public void Set_Up () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\OneDrive\\Desktop\\Drivers\\msedgedriver.exe"); 
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window ().maximize();
		//implicit wait
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Test (priority=1)
	public void loginpageTest () {
		loginpage.EnterUsername("standard_user");
		loginpage.EnterPassword("secret_sauce");
		loginpage.ClickOnLogin();
		System.out.println("User Login Successfully)");
	}
	
	public void verifyHomePage () {
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="saucedemo: inventory.html";
		if (ActualTitle.equalsIgnoreCase(ExpectedTitle))
		System.out.println("Title Matched");
		else 
			System.out.println("Title didn't Matched");
	}
	
	public void handlealert () {
		// accept password change alert
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
	}
	@Test (priority=2)
	public void SelectTheProduct () {
		productpage.ClickOnAddTocart_Product1();
		productpage.ClickOnAddToCart_Product2();
		productpage.GoToCart();
		System.out.println("sauce labs Backpack & Bike light are added in the cart"); 
	}
	public void VerifyCartitems () {
		String productInCart=cartpage.getcartproduct();
		String selectedproductname="sauce Labs backpack & sauce labs Bike Light";
		Assert.assertEquals(productInCart, selectedproductname,"product in cart doesn't match with selected products");
		cartpage.ClickOnCheckout();
		System.out.println("user landed on checkout page");
	}
	@Test (priority=3)
	public void checkoutTest () {
		 checkout_step1.EnterFirstname("Riddhi");
		 checkout_step1.EnterLastName("Shah");
		 checkout_step1.EnterPostalCode("401101");
		 checkout_step1.ClickOnContinuBtn();
		 System.out.println("User Successfully completed first checkout verification step");
		 	 
	}
	public void finishstep () {
		
		checkout_step2.ClickOnFinsih();
		 System.out.println("Successfully completed ");
		 System.out.println("Thank You for your order");
	}
	@AfterTest
	public void Teardown() {
		driver.close();
	}
	
	
	
   
		
		
	}


