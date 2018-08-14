package com.bruce.testCases;

import com.bruce.configuration.Config1;
import com.bruce.pages.object.GuidePageObject;
import com.bruce.pages.object.HomePageObject;
import com.bruce.business.operation.SwipIntoHomePage;

import org.testng.annotations.*;

public class TestGotoHomePage extends Config1 {
	
	
	
	@Test(priority=1,enabled=true)
	public void TestSwipIntoHomePage() {
		
		GuidePageObject GuidePageObject=new GuidePageObject(driver);
		HomePageObject HomePageObject = new HomePageObject(driver);
		GuidePageObject.SwiptoHome();
		HomePageObject.closeUpdateWindow();
	}

}
