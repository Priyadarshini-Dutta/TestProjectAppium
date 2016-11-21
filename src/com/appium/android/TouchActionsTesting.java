package com.appium.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class TouchActionsTesting {

	public static void main( String[] args) throws MalformedURLException 
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
	
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("app","/Users/AviPriya/Downloads/Drag-Sort Demos_0.5.0.apk");
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
	  AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	 WebElement basicusageplayground = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/activity_title").get(0); 
	 basicusageplayground.click();
     //*******DRAG AN ELEMENT BY LONGPRESS AND RELEASE IT TO OTHER PLACE
     WebElement ele1 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(0); 
     WebElement ele2 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(4);
     TouchAction action = new TouchAction(driver);
     System.out.println("It Is dragging element.");   
     action.longPress(ele1).moveTo(ele2).release().perform();  
     System.out.println("Element has been droped at destination successfully.");
   
	}
}
