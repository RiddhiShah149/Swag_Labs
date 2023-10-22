package Automation_Project1_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage_StepOne {
	
	private WebDriver driver;
	private By FirstName=By.id("first-name");
	private By Lastname=By.id("last-name");
	private By pincode=By.id("postal-code");
	private By Continue=By.id("continue");
	private By Cancel=By.id("cancel");
	
	public CheckOutPage_StepOne (WebDriver driver) {
		this.driver=driver;
	}
	public void EnterFirstname(String firstname) {
		driver.findElement(FirstName).sendKeys(firstname);
	}
	public void EnterLastName (String lastname) {
		driver.findElement(Lastname).sendKeys(lastname);
	}
	public void EnterPostalCode (String code) {
		driver.findElement(pincode).sendKeys(code);
	}
	public void ClickOnContinuBtn () {
		driver.findElement(Continue).click();
	}
	public void ClickOnCancelBtn () {
		driver.findElement(Cancel).click();
	}
	

}
