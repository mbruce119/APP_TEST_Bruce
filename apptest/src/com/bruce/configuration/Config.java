package com.bruce.configuration;

import java.io.File;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import com.bruce.configuration.SetupCapability;

public class Config {

	public AndroidDriver<AndroidElement> driver;
    private WebDriverWait wait;
    AppiumServer appiumServer;
    
    @BeforeSuite(alwaysRun = true)
    
    public void setUp() throws Exception {
    	
    	AppiumServer appiumServer=new AppiumServer();
    	appiumServer.stopServer();
    	System.out.println("---- Starting appium server ----");
    	
    	try {
			appiumServer.startServer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("---- Appium server started Successfully ! ----");
		
		System.out.println("---- SetUp DesiredCapabilities ----");
		SetupCapability  setCapability = new SetupCapability();
		setCapability.setUpCapability();
}
}