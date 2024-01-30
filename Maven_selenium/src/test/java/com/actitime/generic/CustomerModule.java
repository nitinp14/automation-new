package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass1{
	@Test
	
		public void createCustomer() 
		{
			Reporter.log("create customer",true);
			Assert.fail();
		}
	

}
