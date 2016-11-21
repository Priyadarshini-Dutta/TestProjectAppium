package com.appium.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOS_UISteppers {

	public static void main( String[] args) throws MalformedURLException, InterruptedException 
	{
		// PLEASE DO NOT CHANGE OR MODIFY ANYTHING HERE.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
		capabilities.setCapability(MobileCapabilityType.APP,"/Users/AviPriya/Library/Developer/Xcode/DerivedData/PriyaFirstApp-bqfqcvnqrmdcbpgcrxhunxwuegti/Build/Products/Debug-iphonesimulator/PriyaFirstApp.app"); 
		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     }
}
