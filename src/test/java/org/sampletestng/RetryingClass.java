package org.sampletestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryingClass implements IRetryAnalyzer {

	int min = 0, max = 5;

	public boolean retry(ITestResult arg0) {
		if (min < max) {

			min++;

			return true;
		}
		return false;
	}

}
