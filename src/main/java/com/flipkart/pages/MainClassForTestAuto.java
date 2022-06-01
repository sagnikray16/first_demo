package com.flipkart.pages;

import com.flipkart.Base.TestBase;

public class MainClassForTestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase obj = new TestBase();
		LoginPage obj1 = new LoginPage();
		
		obj.launchBrowser();
		obj.navigateToURL();
		String order = obj1.validateLogin("9094018902", "Asdf@1234");

	}

}
