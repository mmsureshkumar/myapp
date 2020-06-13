package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Gift_Cards extends TestBase{
	
public static final Logger log = Logger.getLogger(DemoWorkShop_Gift_Cards.class.getName());
	
	@FindBy(xpath="//li[@class='inactive']//a[contains(text(),'Gift Cards')]")
	WebElement Gift_cards;
	
	@FindBy(xpath="//h1[contains(text(),'Gift Cards')]")
	WebElement Get_Text_Gift_cards;
	
	@FindBy(id="products-orderby")
	WebElement Gift_Card_products_orderby;
	
	@FindBy(id="products-pagesize")
	WebElement Gift_Card_Display_Dropdown;
	
	@FindBy(linkText="$5 Virtual Gift Card")
	WebElement Select_Virtual_Gift_Card;
	
	@FindBy(id="addtocart_1_EnteredQuantity")
	WebElement Virtual_Gift_Card_Add_Quantity;
	
	@FindBy(css="input.button-1.add-to-cart-button")
	WebElement Virtual_Gift_Card_Add_To_Cart_First;
	
	@FindBy(xpath="//span[@class='close']")
	WebElement Virtual_Gift_Close_Error;
	
	@FindBy(id="giftcard_1_RecipientName")
	WebElement Virtual_Gift_Recipient_Name;
	
	@FindBy(id="giftcard_1_RecipientEmail")
	WebElement Virtual_Gift_Recipient_Email;
	
	@FindBy(css="input.button-1.add-to-cart-button")
	WebElement Virtual_Gift_Add_To_Cart_Second;
	
	public DemoWorkShop_Gift_Cards() {
		PageFactory.initElements(driver, this);	
	}
	
	public void clicking_Gift_Card(String strDemoworkshop) throws InterruptedException {
	 
		log("Cliking gift Cards");
		Gift_cards.click();
		
		log("Verifying the Gift card page is displayed");
		String strDemoWorkShopAct = Get_Text_Gift_cards.getText();
		System.out.println(strDemoWorkShopAct);
		if(strDemoworkshop.equalsIgnoreCase(strDemoWorkShopAct)){
			log("Home page is displayed with expected :" + strDemoworkshop + " is matched with Actual value : " + strDemoWorkShopAct);
		}else {
			log("Home page is not displayed with expected :" + strDemoworkshop + " is not matched with Actual value : " + strDemoWorkShopAct);
		}	
		
		log("Select The Dropdown of OrderBy");
		Select_Value_From_Dropdown_By_Index(Gift_Card_products_orderby,1);
		
		log("Select The Dropdown of Display");
		Select_Value_From_Dropdown_By_Index(Gift_Card_Display_Dropdown,0);
		
		log("Clicking Virtual gift card");
	    Select_Virtual_Gift_Card.click();
	
	    log("Adding the Quantity");
		Virtual_Gift_Card_Add_Quantity.clear();
		Virtual_Gift_Card_Add_Quantity.sendKeys("5");	
	
		log("Clicking Add to cart first");
		Virtual_Gift_Card_Add_To_Cart_First.click();
	
		log("Close the error");
		Virtual_Gift_Close_Error.click();
		 Thread.sleep(2000);
	    log("Enter the Recipient Name");
		Virtual_Gift_Recipient_Name.sendKeys("Srinivasa Rao");	
		 Thread.sleep(2000);
		log("Enter the Recipient Email");
    	 Virtual_Gift_Recipient_Email.sendKeys("satishg433@gmail.com");	
    	 Thread.sleep(2000);
	    log("Add to the Cart second");
		Virtual_Gift_Add_To_Cart_Second.click();
	}


}