package com.actitime.genericTest;

import java.io.IOException;

public class TestPropertyLoad {
	public static void main(String[] args) throws IOException {
		PropertyFileLoad p=new PropertyFileLoad();
		p.getPropertyMethod("username");
		p.getExcelFile("createcustomer", 5,4);
	}
}
