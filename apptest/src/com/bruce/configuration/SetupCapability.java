package com.bruce.configuration;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.remote.MobileCapabilityType;

public class SetupCapability {
	public AndroidDriver<AndroidElement> driver;

	//@BeforeSuite(alwaysRun = true)
	public void setUpCapability() throws Exception {

	File classpathRoot = new File(System.getProperty("user.dir")); // https://blog.csdn.net/wodewutai17quiet/article/details/68946890
	File appDir = new File(classpathRoot, "app");
	File app = new File(appDir, "maizijinfu.apk");
	
	
	//以下最好将appium 升级到最新，然后修改方法，获取这些参数
	//device name 需要自动读取、platformVersion、appPackage、appActivity
	/*
    private String device_name = ;
    private String platformVersion = ;
    private String appPackage = ;
    private String appActivity = ;
    */	
    System.out.println("设置DesiredCapabilities中");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    
    //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "127.0.0.1:52088"); 
    //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");
    //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    //capabilities.setCapability("appPackage", "com.evergrande.eif.android.hengjiaosuo");
    //capabilities.setCapability("unicodeKeyboard", true);	//支持中文
    //capabilities.setCapability("resetKeyboard", true);	//运行完毕之后，变回系统的输入法
    //capabilities.setCapability("noReset", true);
    
    //运行完毕之后，变回系统的输入法
  	capabilities.setCapability("unicodeKeyboard", true);
  	//
    capabilities.setCapability("resetKeyboard", true);
    capabilities.setCapability("resetKeyboard", true);    
  	capabilities.setCapability("deviceName","4d00de7e5ad6b01b");
  	capabilities.setCapability("platformVersion", "4.3");
  	capabilities.setCapability("app", "D:\\Github\\APP_TEST_Bruce\\apptest\\APP\\maizijinfu.apk");
  	capabilities.setCapability("appPackage", "com.nonoapp");
  	capabilities.setCapability("appActivity", "com.nonoapp.module.operation.launch.ui.SplashActivity");
  	/*
  	 * launchable-activity: name='com.nonoapp.module.operation.launch.ui.SplashActivity'
	   package: name='com.nonoapp' 
	*/
  	
	}
}
