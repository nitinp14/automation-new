package com.actitime.create;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
	@Test
	public void CustomerCreate()
	{
		Reporter.log("hi");
		Reporter.log("hello",true);
		Reporter.log("hai",false);
		System.out.println("hola");
		Reporter.log("create customer",true);
	}
	@Test
	public void modifyCustomer()
	{
		Reporter.log("Modify customer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
		
	}
}
