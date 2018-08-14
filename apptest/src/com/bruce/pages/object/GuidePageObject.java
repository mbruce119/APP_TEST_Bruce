package com.bruce.pages.object;

import com.bruce.common.function.AppiumFunction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class GuidePageObject extends AppiumFunction{
	
	public GuidePageObject(AndroidDriver<AndroidElement> androidDriver) {
		super(androidDriver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "vp_guide")
	private AndroidElement vp_guide;
	
	
	@AndroidFindBy(id = "iv_splash")
	private AndroidElement iv_splash;

	public void SwiptoHome() {
		// TODO Auto-generated method stub
		swipeToLeft(driver,500,3);
	}

}
