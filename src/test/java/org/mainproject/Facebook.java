package org.mainproject;

import org.base.BaseClasss;
import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

public class Facebook extends BaseClasss {

	public static void main(String[] args) {

		browserLaunch("https://www.facebook.com/");

		LoginPage loginPage = new LoginPage();
		loginPage.loginPage("hijavaa", "welcomejava");
		LoginPage page = new LoginPage();
		page.loginPage("welocme", "python");
		LoginPage loginPage2 = new LoginPage();
		loginPage2.loginPage("username", "password");

	}

}
