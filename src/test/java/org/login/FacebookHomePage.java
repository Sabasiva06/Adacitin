package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage extends BaseClasss{
	
	public FacebookHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement username;
	
	@FindBys({@FindBy(id="pass"), @FindBy(xpath="//input[@name='pas']")})
	private WebElement password;
	
	@FindAll({@FindBy(xpath="//button[@name='login']"),@FindBy(xpath="//button[@type='sub']")})
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
}
