package org.testobject.appium.common.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.testobject.appium.junit.TestObjectTestResultWatcher;

public class TestResult {

	private final boolean passed;

	@JsonCreator
	public TestResult(@JsonProperty("passed") boolean passed) {
		this.passed = passed;
	}

	public boolean isPassed() {
		return passed;
	}

}
