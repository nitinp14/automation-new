package com.actitime.create;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateTask {
	@Test()
	public void taskCreate() {
		Reporter.log("Task create",true);
//		Assert.fail();
	}
	@Test()
	public void modifyTask() {
		Reporter.log("modify task",true);
	}
	@Test
	public void deleteTask() {
		Reporter.log("delete Task ",true);
	}
}
