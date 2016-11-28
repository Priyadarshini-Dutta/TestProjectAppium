package com.appium.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
public class SwipeElements {
	public static void main( String[] args) throws MalformedURLException 
	{

		DesiredCapabilities capabilities=new DesiredCapabilities();
		//capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("app","/Users/AviPriya/Downloads/Drag-Sort Demos_0.5.0.apk");
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   //*******DRAG AN SWIPE ELEMENT 
		     WebElement wrap = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/activity_title").get(2); 
		     wrap.click();
		     WebElement element1 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(1);    
		     TouchAction action = new TouchAction(driver);
		     action.longPress(element1).moveTo(10,578).release().perform();
		    
	
	}
}
