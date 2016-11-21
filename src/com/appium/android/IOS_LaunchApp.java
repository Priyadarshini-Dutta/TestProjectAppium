package com.appium.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class IOS_LaunchApp {
	public static void main( String[] args) throws MalformedURLException, InterruptedException 
	{
		
		// PLEASE DO NOT CHANGE OR MODIFY ANYTHING HERE.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.quit();
     }
}