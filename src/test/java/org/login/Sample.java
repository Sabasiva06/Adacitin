package org.login;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClasss {

	@BeforeClass
	public static void beforeClass() {
		browserLaunch("https://adactinhotelapp.com/");

	}

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);

	}

	@Test
	public void tc01() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Validating Title of Home Page", title, "Adactin.com - Hotel Reservation System");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("babu123456");

		Assert.assertEquals("verify username", txtUserName.getAttribute("value"), "babu123456");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Babu1234");

		Assert.assertEquals("verify password", txtPassword.getAttribute("value"), "Babu1234");
	}

}
