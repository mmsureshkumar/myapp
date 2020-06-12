package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Books extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_Books.class.getName());
	
	

	@FindBy(linkText="Books")
	WebElement Books;
	
	@FindBy(xpath="//img[@alt='Picture of Health Book']")
	WebElement Health_Book;
	
	@FindBy(id="products-orderby")
	WebElement Select_Products;
	
	@FindBy(id="products-pagesize")
	WebElement Select_PageSize;
	
	@FindBy(id="addtocart_22_EnteredQuantity")
	WebElement EnteredQuantity;
	
	@FindBy(id="add-to-cart-button-22")
	WebElement Add_To_Cart_button;
	
	
	public DemoWorkShop_Books() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void DemoWorkShop_AddBooks_To_ShoppingCart() {
		
		//Click on the Books link
		Books.click();
		
		//Selection of value from drop down
		Select_Value_From_Dropdown(Select_Products,"Name: A to Z");
		
		//Selection of value from drop down
		Select_Value_From_Dropdown(Select_PageSize,"12");
		
		//Click on Add to Cart button on Health Book
		Health_Book.click();
    	Reporter.log("Click on image of Health Book");
		
		//Enter the Quantity
		EnteredQuantity.clear();
		EnteredQuantity.sendKeys("1");
		
		//Click on Add to Cart Button
		Add_To_Cart_button.click();
		
	}
	

}
