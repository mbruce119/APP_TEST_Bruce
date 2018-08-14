package com.bruce.common.function;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public interface ElementLocatorInterface {

	/**
	 * 页面元素获取定位接口，主要供给Page层使用
	 */

	

	public static int WAIT_TIME = 3; // 默认的等待控件时间

	// public PageAppium(AndroidDriver<AndroidElement> androidDriver);
	public boolean isIdElementExist(String id);

	public boolean isIdElementExist(String id, int timeOut);

	/**
	 * 根据id判断当前界面是否存在并显示这个控件
	 *
	 * @param id
	 *            要查找的id
	 * @param isShow
	 *            是否判断控件显示
	 * @return 返回对应的控件
	 */
	public boolean isIdElementExist(String id, int timeOut, boolean isShow);

	/**
	 * 选择当前界面的有这个文字的控件
	 *
	 * @param name
	 * @return
	 */
	public boolean isNameElementExist(String name);

	public boolean isNameElementExist(String name, int timeOut);

	public boolean isNameElementExist(String name, int timeOut, boolean isShow);

	/**
	 * 判断当前界面有没有这个字符串存在
	 *
	 * @param text
	 *            要判断的字符串
	 * @return 存在返回真
	 */
	public boolean isTextExist(String text);

	/**
	 * 判断当前界面有没有这个Xpath控件存在
	 *
	 * @param text
	 *            要判断的字符串
	 * @return 存在返回真
	 */
	public boolean isXpathExist(String text);

	public boolean isXpathExist(String text, int timeOut);

	public boolean isXpathExist(String text, int timeOut, boolean isShow);

	/**
	 * 判断控件时候存在
	 *
	 * @param by
	 *            By
	 * @param timeout
	 *            等待的事件
	 * @return
	 */
	public boolean isElementExist(By by, int timeout, boolean isShow);

	/**
	 * 获取当前的activity,返回文件名
	 *
	 * @return
	 */
	public String getCurrActivity();

	/**
	 * 根据id获取当前界面的一个控件
	 *
	 * @param id
	 *            要查找的id
	 * @return 返回对应的控件
	 */
	public AndroidElement findById(String id, String desc);

	public AndroidElement findById(String id);

	public AndroidElement findByFullId(String id);

	/**
	 * 选择当前界面的有这个文字的控件
	 *
	 * @param name
	 *            内容
	 * @return 找到的控件
	 */
	public AndroidElement findByName(String name, String desc);

	public AndroidElement findByName(String name);

	/**
	 * 根据id获取当前界面的一个控件
	 *
	 * @param name
	 *            要查找的控件的类名
	 * @return 返回对应的控件
	 */
	public AndroidElement findByClassName(String name, String desc);

	public AndroidElement findByClassName(String name);

	public AndroidElement findByXpath(String str);

	public AndroidElement findByXpath(String str, String desc);

	public AndroidElement findElementBy(By by);

	/**
	 * 获取控件
	 * 
	 * @param by
	 *            by
	 * @param str
	 *            报错提示信息
	 * @return
	 */
	public AndroidElement findElementBy(By by, String str);

	/**
	 * 打印字符
	 *
	 * @param str
	 *            要打印的字符
	 */
	public <T> void print(T str);

	/**
	 * 线程休眠秒数，单位秒
	 *
	 * @param s
	 *            要休眠的秒数
	 */
	public void sleep(long s) throws InterruptedException;

	/**
	 * 显示等待，等待Id对应的控件出现time秒，一出现马上返回，time秒不出现也返回
	 */
	public AndroidElement waitAuto(final By by, int time);

	public AndroidElement waitAutoById(String id);

	public AndroidElement waitAutoById(String id, int time);

	public AndroidElement waitAutoByName(String name);

	public AndroidElement waitAutoByName(String name, int time);

	public AndroidElement waitAutoByXp(String xPath);

	public AndroidElement waitAutoByXp(String xPath, int time);

	public void waitAuto();

	/**
	 * ，隐式等待，如果在指定时间内还是找不到下个元素则会报错停止脚本 全局设定的，find控件找不到就会按照这个事件来等待
	 *
	 * @param time
	 *            要等待的时间
	 */
	public void waitAuto(int time);

	/**
	 * 获取屏幕的宽高
	 *
	 * @return 返回宽高的数组
	 */
	public int[] getScreen();

	/**
	 * 获取屏幕宽度
	 *
	 * @return
	 */
	public int getScreenWidth();

	/**
	 * 获取屏幕高度
	 *
	 * @return
	 */
	public int getScreenHeight();

	/**
	 * 根据ClassName获取多个控件
	 *
	 * @param className
	 *            控件的类名字，例如 android.widget.EditText
	 * @param num
	 *            返回的数量
	 * @return
	 */
	public List<AndroidElement> getManyElementByClassName(String className, int num);

	/**
	 * 根据Id获取多个控件
	 *
	 * @param id
	 *            控件的类名字，例如 android.widget.EditText
	 * @param num
	 *            返回的数量
	 * @return
	 */
	public List<AndroidElement> getManyElementById(String id, int num);

	/**
	 * 获取同id的list的控件
	 * 
	 * @param id
	 *            id
	 * @param num
	 *            取那一个控件
	 * @return
	 */
	public AndroidElement getListOneElementById(String id, int num);

}
