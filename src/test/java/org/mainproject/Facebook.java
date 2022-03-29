package org.mainproject;

import org.base.BaseClasss;
import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

public class Facebook extends BaseClasss {

	public static void main(String[] args) {

		browserLaunch("https://www.facebook.com/");

		LoginPage loginPage = new LoginPage();
		loginPage.loginPage("hijavaa", "welcomejava");
		WebElement txtUserName = loginPage.getTxtUserName();
		enterText(txtUserName, "welocmee");
		WebElement txtPassword = loginPage.getTxtPassword();
		enterText(txtPassword, "welocmeee");
		WebElement btnLogin = loginPage.getBtnLogin();
		buttonClick(btnLogin);

	}

}
