package org.locator;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClasss {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	@FindBy(id = "email")
	private WebElement txtUserName;

	@FindAll({ @FindBy(id = "pass"), @FindBy(xpath = "//input[@id='passs']") })
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void loginPage(String username, String password) {

		WebElement txtUserName2 = getTxtUserName();

		enterText(txtUserName2, username);

		WebElement txtPassword2 = getTxtPassword();
		enterText(txtPassword2, password);

		WebElement btnLogin2 = getBtnLogin();
		buttonClick(btnLogin2);
	}

}
