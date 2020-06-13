package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Computers extends TestBase{
	
public static final Logger log = Logger.getLogger(DemoWorkShop_Computers.class.getName());
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	WebElement Computers;
	
	@FindBy(xpath="//h1[contains(text(),'Computers')]")
	WebElement Computers_Text;
	
	@FindBy(xpath="//img[@alt='Picture for category Desktops']")
	WebElement Select_Desktops;
	
	@FindBy(id="products-orderby")
	WebElement DeskTop_products_orderby;
	
	@FindBy(id="products-pagesize")
	WebElement DeskTop_Display_Dropdown;
	
	@FindBy(xpath="//div[6]//div[1]//div[1]//a[1]//img[1]")
	WebElement Select_Simple_Computer;
	
	@FindBy(id="addtocart_75_EnteredQuantity")
	WebElement Sample_Computer_Add_Quantity;
	
	@FindBy(id="add-to-cart-button-75")
	WebElement Sample_Computer_Add_To_Cart_First;
	
	@FindBy(xpath="//span[@class='close']")
	WebElement Sample_Computer_Close_Error;
	
	@FindBy(id="product_attribute_75_5_31_96")
	WebElement Select_Processor_Slow;
	
	@FindBy(id="add-to-cart-button-75")
	WebElement Sample_Computer_Add_To_Cart_Second;
	
	public DemoWorkShop_Computers() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Computers(String strDemoworkshop) throws InterruptedException {
		
		//Selecting the computers
		Computers.click();
		
		log("Verifying the computers page is displayed");
		String strDemoWorkShopAct = Computers_Text.getText();
		System.out.println(strDemoWorkShopAct);
		if(strDemoworkshop.equalsIgnoreCase(strDemoWorkShopAct)){
			log("Home page is displayed with expected :" + strDemoworkshop + " is matched with Actual value : " + strDemoWorkShopAct);
		}else {
			log("Home page is not displayed with expected :" + strDemoworkshop + " is not matched with Actual value : " + strDemoWorkShopAct);
		}	
		
	    log("Clicking Desktop from Demo WebShop");
		Select_Desktops.click();
		log("Select the Dropdown orderBy");
		Select_Value_From_Dropdown_By_Index(DeskTop_products_orderby,1);

		log("Select the Dropdown Display");
		Select_Value_From_Dropdown_By_Index(DeskTop_Display_Dropdown,2);

		log("Select Simple Computer");
		Select_Simple_Computer.click();
	
		log("Entered The Quantityr");
		Sample_Computer_Add_Quantity.clear();
		Sample_Computer_Add_Quantity.sendKeys("5");	
	
		log("Add to Cart first");
		Sample_Computer_Add_To_Cart_First.click();
	
		log("Close the Error");
		Sample_Computer_Close_Error.click();
		
		Thread.sleep(2000);
	
		log("Select the Processor");
	    Select_Processor_Slow.click();
	    Thread.sleep(2000);
	    log("Add to cart second");
		Sample_Computer_Add_To_Cart_Second.click();
		
	
	
	}
}