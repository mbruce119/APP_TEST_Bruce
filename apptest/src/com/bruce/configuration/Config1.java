package com.bruce.configuration;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Config1 {
	
	public AndroidDriver<AndroidElement> driver;
    private WebDriverWait wait;
    AppiumServer appiumServer;
    
    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
    	AppiumServer appiumServer=new AppiumServer();
    	appiumServer.stopServer();
    	System.out.println("---- Starting appium server ----");
    	appiumServer.startServer();
		System.out.println("---- Appium server started Successfully ! ----");
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File classpathRoot = new File(System.getProperty("user.dir")); //https://blog.csdn.net/wodewutai17quiet/article/details/68946890
	    File appDir = new File(classpathRoot, "app");
	    File app = new File(appDir, "1.apk");
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
	  	//capabilities.setCapability("app", "D:\\BaiduNetdiskDownload\\HJS_APPAutoTest\\app\\1.apk");
	  //	capabilities.setCapability("appPackage", "com.evergrande.eif.android.hengjiaosuo");
	  	//capabilities.setCapability("appActivity", "com.evergrande.eif.userInterface.activity.modules.guide.HDLoadingActivity");
	  	capabilities.setCapability("app", "D:\\Github\\APP_TEST_Bruce\\apptest\\APP\\maizijinfu.apk");
	  	capabilities.setCapability("appPackage", "com.nonoapp");
	  	capabilities.setCapability("appActivity", "com.nonoapp.module.operation.launch.ui.SplashActivity");
        
        
      	System.out.println("---- APP即将启动，请稍后 ~~ ----");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,30);
    }
    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        System.out.println("---- Stoping appium server ----");
        //appiumServer.stopServer();
		System.out.println("---- Appium server stopped Successfully ! ----");
    }
   
}

