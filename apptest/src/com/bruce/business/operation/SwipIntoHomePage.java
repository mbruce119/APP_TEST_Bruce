package com.bruce.business.operation;
import com.bruce.common.function.AppiumFunction;
import com.bruce.pages.object.GuidePageObject;
import com.bruce.pages.object.HomePageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipIntoHomePage extends AppiumFunction {
	
	public SwipIntoHomePage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	HomePageObject homePageObject = new HomePageObject(driver);

	public void SwiptoHome(){
		
		swipeToLeft(driver,500,3);
	}
		
		public void closeUpdateWindow() {
			if(isElementExsit(driver,homePageObject.getBtn_update_Locator())) {
				clickEle(homePageObject.getIv_dialog_update_del(),"升级弹窗关闭按钮");
			}

		}
}
