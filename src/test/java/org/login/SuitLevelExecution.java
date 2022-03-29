package org.login;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Sample1.class, Sample2.class, Sample3.class })

public class SuitLevelExecution {

	public static void main(String[] args) {

		Result runClasses = JUnitCore.runClasses(Sample1.class, Sample2.class, Sample3.class);

		int runCount = runClasses.getRunCount();
		System.out.println(runCount);

		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println(ignoreCount);

		int failureCount = runClasses.getFailureCount();
		System.out.println(failureCount);

		List<Failure> failures = runClasses.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			Failure failure = failures.get(i);
			System.out.println(failure);
		}
	}
}
