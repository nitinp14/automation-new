package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	@Test
	public void demo() {
		Reporter.log("hello world",true);
	}
	@Test
	public void demo2() {
		Reporter.log("hello world 2");
	}
}
