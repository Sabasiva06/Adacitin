package org.sampletestng;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {

	@Test
	private void tc01() {
		System.out.println("Method 1");
	}

	@Test
	private void tc02() {
		Assert.assertTrue(false);
		System.out.println("Method 2");
	}

	@Test
	private void tc03() {
		System.out.println("Method 3");
	}

	@Test
	private void tc04() {
		System.out.println("Method 4");
	}

	@Test
	private void tc05() {
		System.out.println("Method 5");
	}

}
