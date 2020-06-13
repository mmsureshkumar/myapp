package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Jewelry extends TestBase {

public static final Logger log = Logger.getLogger(DemoWorkShop_Jewelry.class.getName());
	
	@FindBy(xpath="//li[@class='inactive']//a[contains(text(),'Jewelry')]")
	WebElement Jewelry;
	
	@FindBy(xpath="//h1[contains(text(),'Jewelry')]")
	WebElement Jewelry_Text;
	
	@FindBy(id="products-orderby")
	WebElement sort_By_Dropdown;
	
	@FindBy(id="products-viewmode")
	WebElement View_As;
	
	@FindBy(css="input.button-2.product-box-add-to-cart-button")
	WebElement Jewelry_Add_To_Cart_First;
	
	@FindBy(id="product_attribute_71_10_16")
	WebElement Length_In_Cm;
	
	@FindBy(css="input.button-1.add-to-cart-button")
	WebElement Jewelry_Add_To_Cart_Second;
	
	public DemoWorkShop_Jewelry() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Jewelry(String strDemoworkshop) throws InterruptedException {
		
		log("Selecting Jewelry from demo webshop");
		Jewelry.click();
		log("Verifying the Jewelry page is displayed");
		String strDemoWorkShopAct = Jewelry_Text.getText();
		System.out.println(strDemoWorkShopAct);
		if(strDemoworkshop.equalsIgnoreCase(strDemoWorkShopAct)){
			log("Home page is displayed with expected :" + strDemoworkshop + " is matched with Actual value : " + strDemoWorkShopAct);
		}else {
			log("Home page is not displayed with expected :" + strDemoworkshop + " is not matched with Actual value : " + strDemoWorkShopAct);
		}		
	
	    log("Selecting Dropdown orderBy");
	    Select_Value_From_Dropdown_By_Index(sort_By_Dropdown,5);
		log("Selecting Dropdown List");
		Select_Value_From_Dropdown_By_Index(View_As,1);
		
		Thread.sleep(2000);
		
        log("Add to the Cart first");
		Jewelry_Add_To_Cart_First.click();
		
		log("Entered cm for Jewelry");
		Length_In_Cm.sendKeys("12");
		
		log("Add to the Cart second");
		Jewelry_Add_To_Cart_Second.click();
		
	}
	
}