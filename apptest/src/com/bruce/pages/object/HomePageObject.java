package com.bruce.pages.object;

import org.openqa.selenium.By;

import com.bruce.common.function.AppiumFunction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObject extends AppiumFunction{

	public HomePageObject(AndroidDriver<AndroidElement> androidDriver) {
		super(androidDriver);
		// TODO Auto-generated constructor stub
	}
	
	
	@AndroidFindBy(id = "iv_dialog_update_del")
	private AndroidElement iv_dialog_update_del;//升级弹窗的关闭按钮
	
	public AndroidElement getIv_dialog_update_del() {
		return iv_dialog_update_del;
	}


	@AndroidFindBy(id ="tv_dialog_update_log" )
	private AndroidElement tv_dialog_update_log;//升级弹窗文案
	
	//“我是冠军”及“金榜题名”活动火热进行中！
	//更新版本获取专属奖励哦～
	@AndroidFindBy(id ="btn_update" )
	private AndroidElement btn_update;//升级按钮
	
	private By btn_update_Locator =By.id("btn_update");
	
	public By getBtn_update_Locator() {
		return btn_update_Locator;
	}


	public void closeUpdateWindow() {
		if(isElementExsit(btn_update_Locator)) {
			clickEle(iv_dialog_update_del,"升级弹窗关闭按钮");
		}
		
	}
	
}
