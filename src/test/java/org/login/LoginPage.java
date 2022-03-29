package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClasss {

	public void loginPage(String username, String password) {

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(username);

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(password);

	}
	
	

}
