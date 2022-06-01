package com.flipkart.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flipkart.Base.TestBase;
import com.flipkart.pages.LoginPage;

public class PlaceOrder extends TestBase {
	
	
  @Test
  public void loginTest() {
	  LoginPage loginPage = new LoginPage();
	  String actResult = loginPage.validateLogin("9094018902", "Asdf@1234");
	  
	  Assert.assertEquals(actResult, "Senthil");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void setUp() {
	 
	  launchBrowser();
	  navigateToURL();
	 
  }

  @AfterClass
  public void afterClass() {
  }

}
