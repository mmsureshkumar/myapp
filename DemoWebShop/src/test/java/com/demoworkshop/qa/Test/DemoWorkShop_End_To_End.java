package com.demoworkshop.qa.Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoworkshop.qa.TestBase;
import com.demoworkshop.qa.pages.DemoWorkShop_Books;
import com.demoworkshop.qa.pages.DemoWorkShop_Computers;
import com.demoworkshop.qa.pages.DemoWorkShop_Gift_Cards;
import com.demoworkshop.qa.pages.DemoWorkShop_HomePage;
import com.demoworkshop.qa.pages.DemoWorkShop_Jewelry;
import com.demoworkshop.qa.pages.DemoWorkShop_ShoppingCart;
import com.demoworkshop.qa.pages.DemoWorkShop_SignIn;
import com.demoworkshop.util.DemoWorkShop_Listener;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(DemoWorkShop_Listener.class)
public class DemoWorkShop_End_To_End extends TestBase {
	
	DemoWorkShop_HomePage DemoWorkShop_HomePage;
	DemoWorkShop_SignIn DemoWorkShop_SignIn;
	DemoWorkShop_Books DemoWorkShop_Books;
	DemoWorkShop_Computers Demo_WorkShop_Computers;
	DemoWorkShop_Jewelry DemoWorkShop_Jewelry;
	DemoWorkShop_Gift_Cards Demo_WorkShop_Gift_Cards;
	DemoWorkShop_ShoppingCart Demo_WorkShop_Shipping_Cart;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		 try {
				init(); //Initialization of the Test class DemoWorkshop
				DemoWorkShop_SignIn = new DemoWorkShop_SignIn();
				DemoWorkShop_HomePage = new DemoWorkShop_HomePage();
				DemoWorkShop_Books = new DemoWorkShop_Books();
				Demo_WorkShop_Computers = new DemoWorkShop_Computers();
				DemoWorkShop_Jewelry = new DemoWorkShop_Jewelry();
				Demo_WorkShop_Gift_Cards = new DemoWorkShop_Gift_Cards();
				Demo_WorkShop_Shipping_Cart= new DemoWorkShop_ShoppingCart();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	

 @BeforeTest
  public void beforeTest() {
	 System.out.println("Before Test");	
  }
	
 @BeforeMethod
  public void beforeMethod() {
	 System.out.println("Before Method");
	 
  }
  
  @Test(priority=1, testName="TC001_LoginToDemoWebshop")
  public void TC001_LoginToDemoWebshop() {
	  extentTest = extentRep.startTest("TC001_LoginToDemoWebshop"); 
	  DemoWorkShop_SignIn.DemoWorkShopSignIn();
  }
  
  @Test(priority=2, testName="TC002_Verify_Demowebshop_Homepage_IsDisplayed")
  public void TC002_Verify_Demowebshop_Homepage_IsDisplayed() {
	 extentTest = extentRep.startTest("TC002_Verify_Demowebshop_Homepage_IsDisplayed"); 
	  DemoWorkShop_HomePage.DemoWorkShop_Homepage_IsDisplayed("Tricentis Demo Web Shop");
  }
  
  
  @Test(priority=3, testName="TC003_SelectBooks_From_BooksPage")
  public void TC003_SelectBooks_From_BooksPage() {
	  extentTest = extentRep.startTest("TC003_SelectBooks_From_BooksPage"); 
	  DemoWorkShop_Books.DemoWorkShop_AddBooks_To_ShoppingCart();

  }
  
  @Test(priority=4, testName="TC004_SelectDesktops_From_ComputersPage")
  public void TC004_SelectDesktops_From_ComputersPage() throws InterruptedException {
	  extentTest = extentRep.startTest("TC004_SelectDesktops_From_ComputersPage"); 
	  Demo_WorkShop_Computers.Computers("Computers");	  	  
  }
  
  @Test(priority=5, testName="TC005_SelectJewelry_From_JewelryPage")
  public void TC005_SelectJewelry_From_JewelryPage() throws InterruptedException {
	  extentTest = extentRep.startTest("TC005_SelectJewelry_From_JewelryPage"); 
	  DemoWorkShop_Jewelry.Jewelry("Jewelry");
  }
  
  @Test(priority=6, testName="TC006_SelectGiftCard_From_GiftCardPage")
  public void TC006_SelectGiftCard_From_GiftCardPage() throws InterruptedException {
	  extentTest = extentRep.startTest("TC006_SelectGiftCard_From_GiftCardPage"); 
	  Demo_WorkShop_Gift_Cards.clicking_Gift_Card("Gift Cards");
  }
  
  @Test(priority=7, testName="TC007_SelectShippingCart_From_DemoWebShop")
  public void TC007_SelectShippingCart_From_DemoWebShop() throws InterruptedException {
	  extentTest = extentRep.startTest("TC007_SelectShippingCart_From_DemoWebShop"); 
	  Demo_WorkShop_Shipping_Cart.Clicking_Shopping_Cart();
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test"); 
	  extentRep.flush();
	  extentRep.close();
  }
  
	@AfterClass
	public void AfterClass() {
		 System.out.println("After Class");
		 
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.quit();
	}

}
