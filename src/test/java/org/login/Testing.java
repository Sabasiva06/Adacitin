package org.login;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Parameterized.class)
public class Testing extends BaseClasss {

	private String username;
	private String password;
	private LoginPage login;

	@Rule
	public TestName test = new TestName();

	@Before
	public void beforeClass() {

		browserLaunch("https://www.facebook.com/");
		login = new LoginPage();

	}

	public Testing(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc", "edf" }, { "fgh", "klm" } });
	}

	@Test
	public void tc0() {
		login.loginPage(username, password);
	}

	@After
	public void after() throws IOException {
		Date date = new Date();
		System.out.println(date);
		String methodName = test.getMethodName();

		takingScreenShot(methodName);

	}

	@AfterClass
	public static void afterClass() {
		driver.close();
	}
}
