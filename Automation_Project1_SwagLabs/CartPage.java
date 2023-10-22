package Automation_Project1_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	private WebDriver driver;
	private By Checkout=By.id("checkout");
	private By Continue_shopping= By.id("continue-shopping");
	private By cartproduct=By.xpath("//div[@class='cart-item']//span[@class='product-name']");

	public CartPage (WebDriver driver) {
		this.driver=driver;
	}
	public void ClickOnCheckout() {
		driver.findElement(Checkout).click();
	}
	public void ClickOnContinuShopping () {
		driver.findElement(Continue_shopping).click();
	}
	public String getcartproduct() {
		return ((WebElement) cartproduct).getText();
	}
}
