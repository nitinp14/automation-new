package com.actitime.create;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateProject {
	@Test
	public void projectCreate() {
		Reporter.log("Create Project",true);
	}
	@Test
	public void modifyProject() {
		Reporter.log("Modify Project",true);
	}
	@Test
	public void deleteProject() {
		Reporter.log("Delete Project",true);
	}
}
