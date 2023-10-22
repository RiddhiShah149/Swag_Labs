package Automation_Project1_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
	private WebDriver driver;
	private By AddToCart_Product1= By.id("add-to-cart-sauce-labs-backpack");
	private By AddToCArt_Product2=By.id("add-to-cart-sauce-labs-bike-light");
    private By cart=By.id("shopping_cart_container");

 public ProductsPage (WebDriver driver) {
	this.driver=driver;
 }
 public void ClickOnAddTocart_Product1 () {
	 driver.findElement(AddToCart_Product1).click();
 }
 public void ClickOnAddToCart_Product2() {
	 driver.findElement(AddToCArt_Product2).click();
 }
 public void GoToCart () {
	 driver.findElement(cart).click();
 }
 }