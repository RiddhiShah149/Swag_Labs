package Automation_Project1_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By Username=By.id("user-name");
	private By Password=By.id("password");
	private By login=By.id("login-button");
  
	public LoginPage (WebDriver driver) {
		this.driver=driver;
	}
	public void EnterUsername (String username) {
		driver.findElement(Username).sendKeys(username);
	}
	public void EnterPassword (String pass) {
		driver.findElement(Password).sendKeys(pass);
	}
	public void ClickOnLogin () {
		driver.findElement(login).click();
	}
	
}
