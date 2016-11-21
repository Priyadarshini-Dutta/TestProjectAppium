package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {

	public static void main( String[] args) throws MalformedURLException 
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		//capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("app","/Users/AviPriya/Downloads/selendroid-test-app-0.17.0.apk");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/my_text_field\")").sendKeys("Abcd");
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/buttonTest\")").click();
      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button2\")").click();
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/input_adds_check_box\")").click();
	//Register a new User 
 
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/startUserRegistration\")").click();
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/inputUsername\")").sendKeys("Priyadarshini");
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/inputEmail\")").sendKeys("priyamdm91@gmail.com");
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/inputPassword\")").sendKeys("sk123ks");;
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/inputName\")").sendKeys("Abcd") ;
     driver.hideKeyboard() ;
     //driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/inputName\")").sendKeys(Keys.ARROW_DOWN) ;
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/input_preferedProgrammingLanguage\")").click();
    
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"Java\")").click();
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/input_adds\")").click();
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/btnRegisterUser\")").click();
    
     driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.selendroid.testapp:id/buttonRegisterUser\").text(\"Register User\")").click();
     
     
     
     
	
	}
};