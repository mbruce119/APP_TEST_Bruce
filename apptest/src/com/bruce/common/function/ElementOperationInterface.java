package com.bruce.common.function;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public interface ElementOperationInterface {

	
	public int WAIT_TIME = 3; // 默认的等待控件时间
	public int SWIPE_DEFAULT_PERCENT = 5; // 默认滑动比例

	// 初始化元素，设置全局的隐式等待时间pagefactory
	// https://www.cnblogs.com/superbaby11/p/6098265.html

	public void waitAuto(int time);

	/**
	 * Click点击控件
	 *
	 * @param ae
	 *            控件
	 * 
	 * @param str
	 *            控件的文字描述，供错误时候输出 
	 * @return  返回是否存在控件
	 */
	public boolean clickEle(AndroidElement ae, String str);

	/**
	 * 往控件输入字符串
	 *
	 * @param ae
	 *            要输入的控件
	 * @param str
	 *            要输入的字符串
	 */
	public void sendKeys(AndroidElement ae, String str);

	/**
	 * 打印字符
	 *
	 * @param str
	 *            要打印的字符
	 */
	public <T> void print(T str);

	/*
	 * 
	 * 
	 * //###############################以下上下左右滑动备用##################################
	 * ##############################
	 * //###########################################################################
	 * ##################################
	 * 
	 * /** 获取屏幕宽度 201806新增
	 *
	 * @return 屏幕宽度
	 */
	public int getScreenWidth();

	/**
	 * 获取屏幕高度
	 *
	 * @return 屏幕高度
	 */
	public int getScreenHeight();

	public void swipeToUp(int during);

	/**
	 * 向上滑动，
	 *
	 * @param during
	 */
	public void swipeToUp(int during, int percent);

	public void swipeToDown(int during);

	/**
	 * 向下滑动，
	 *
	 * @param during
	 *            滑动时间
	 */
	public void swipeToDown(int during, int percent);

	public void swipeToLeft(int during);

	/**
	 * 向左滑动，
	 *
	 * @param during
	 *            滑动时间
	 * @param percent
	 *            位置的百分比，2-10， 例如3就是 从2/3滑到1/3
	 */
	public void swipeToLeft(int during, int percent);

	public void swipeToRight(int during);

	/**
	 * 向右滑动，
	 *
	 * @param during
	 *            滑动时间
	 * @param percent
	 *            位置的百分比，2-10， 例如3就是 从1/3滑到2/3
	 */
	public void swipeToRight(int during, int percent);

	// ###############################以上上下左右滑动备用################################################################
	// #############################################################################################################

	public Point getWebElementRealPoint(AndroidDriver<AndroidElement> driver, WebElement el);

	public void clickWebviewEle(AndroidDriver<AndroidElement> driver, WebElement el);

	public void clickNativeEle(AndroidDriver<AndroidElement> driver, WebElement el, int clickcount);

	public void multiPointClick(By[] clickLocator, AndroidDriver<AndroidElement> driver);

	public void scrollelment(By scrollLocator, String scrollToText, AndroidDriver<AndroidElement> driver);

	public void swipeToUp(AndroidDriver<AndroidElement> driver, int during, int times);

	public void swipeToDown(AndroidDriver<AndroidElement> driver, int during, int times);

	public void swipeToLeft(AndroidDriver<AndroidElement> driver, int during, int times);

	public void swipeToRight(AndroidDriver<AndroidElement> driver, int during, int times);
	
	public void contextNativeApp(AndroidDriver<AndroidElement> driver);

	public void contextWebview(AndroidDriver<AndroidElement> driver);
	
	public String getcurrentDate();

	public void threadsleep(int timeout);

}
