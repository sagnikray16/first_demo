package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.Base.TestBase;

public class LoginPage extends TestBase {

	
	
	By emailLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By passwordLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginButtonLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");

	
	public String validateLogin(String email, String pwd) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(emailLoc).sendKeys(email);
		wait(1000);
		driver.findElement(passwordLoc).sendKeys(pwd);
		wait(1000);
		driver.findElement(loginButtonLoc).click();
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")));
		}catch(TimeoutException te) {
			captureScreeenshot("Login Page Error");
		}
		String actResult = driver.findElement(By.xpath("//*[text()='Senthil']")).getText();
		return actResult;
		
	}
	
}
