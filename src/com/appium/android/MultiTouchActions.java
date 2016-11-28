package com.appium.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouchActions {
	public static void main( String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
	
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("app","/Users/AviPriya/Downloads/APKS/Multitouch Test_6.2.apk");
		capabilities.setCapability("appPackage", "multitouchpro.tests");
		capabilities.setCapability("appActivity", "multitouchpro.tests.Multitouch");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		TouchAction action1 =new TouchAction(driver);
		action1.longPress(861,765).waitAction(6000).release();
		Thread.sleep(9000);
		TouchAction action2 =new TouchAction(driver);
		action2.longPress(846, 594).waitAction(6000).release();
		Thread.sleep(1000);
		MultiTouchAction multitouch=new MultiTouchAction(driver);
	     multitouch.add(action1).add(action2).perform();
	     Thread.sleep(5000);
	 driver.closeApp();
	}

}
