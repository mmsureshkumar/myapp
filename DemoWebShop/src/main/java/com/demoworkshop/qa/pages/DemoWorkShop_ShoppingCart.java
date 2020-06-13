package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_ShoppingCart extends TestBase{

public static final Logger log = Logger.getLogger(DemoWorkShop_ShoppingCart.class.getName());
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement Shopping_Cart;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement Terms_Of_Services;
	
	@FindBy(css="button.button-1.checkout-button")
	WebElement Check_Out;
	
	@FindBy(xpath="//select[@id='billing-address-select']")
	WebElement Billing_Address;
	
	@FindBy(xpath="//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']")
	WebElement Billing_Address_Continue;
	
	@FindBy(xpath="//select[@id='shipping-address-select']")
	WebElement Shipping_Address;
	
	@FindBy(xpath="//div[@id='shipping-buttons-container']//input[@class='button-1 new-address-next-step-button']")
	WebElement Shipping_Address_Continue;
	
	@FindBy(id="shippingoption_2")
	WebElement Shipping_Method_2nd_Day_Air;
	
	
	@FindBy(css="input.button-1.shipping-method-next-step-button")
	WebElement Shipping_Method_Continue;
	
	@FindBy(xpath="//input[@id='paymentmethod_1']")
	WebElement Payment_Method_Check_Money;
	
	@FindBy(css="input.button-1.payment-method-next-step-button")
	WebElement Payment_Method_Continue;
	
	@FindBy(css="input.button-1.payment-info-next-step-button")
	WebElement Payment_Information_Continue;
	
	@FindBy(css="input.button-1.confirm-order-next-step-button")
	WebElement Confirm_Order;

	public DemoWorkShop_ShoppingCart() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Clicking_Shopping_Cart() throws InterruptedException {
		
		log("Clicking Shipping cart");
		Shopping_Cart.click();
		log("Clicking agree checkbox");
		Thread.sleep(2000);
		Terms_Of_Services.click();
		log("Clicking Check Out");
		Thread.sleep(2000);
		Check_Out.click();
		
		
		log("Select Billing Address");
		Select_Value_From_Dropdown_By_Index(Billing_Address,1);
		
		log("Clicking Billing Continue");
		Billing_Address_Continue.click();
		
		log("Select Shipping Adress");
		Select_Value_From_Dropdown_By_Index(Shipping_Address,2);
		
		log("Clicking Shipping Continue");
		Shipping_Address_Continue.click();
		
		log("Select Shipping Method");
		Thread.sleep(2000);
		Shipping_Method_2nd_Day_Air.click();
		
		log("Clicking Continue Shipping");
		Thread.sleep(2000);
		Shipping_Method_Continue.click();
		
		log("Select Payment Method");
		Thread.sleep(2000);
		Payment_Method_Check_Money.click();
		
		log("clicking payment method continue");
		Thread.sleep(2000);
		Payment_Method_Continue.click();
		
		log("Clicking Payment information continue");
		Thread.sleep(2000);
		Payment_Information_Continue.click();
		
		log("Clicking Confrim Order");
		Thread.sleep(1000);
		Confirm_Order.click();
		
	}


}