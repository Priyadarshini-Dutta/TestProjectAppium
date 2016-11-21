package com.appium.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
public class DialNumberTest {
	public static void main( String[] args) throws MalformedURLException 
	{

		DesiredCapabilities capabilities=new DesiredCapabilities();
		//capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("appPackage", "com.android.dialer");
		capabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the phone number to dial");

		int phonenumber=input.nextInt();

		//721

		//721%10 -> 1, 721/10=72%10=2, 72/10=7%10=7

		LinkedList<Integer> stack=new LinkedList<Integer>();

		while(phonenumber>0){

		stack.push(phonenumber%10);

		phonenumber=phonenumber/10;

		}

		while(!stack.isEmpty()){

		switch (stack.pop()) {

		case 1:

		driver.findElement(By.id("com.android.contacts:id/one")).click();

		break;

		case 2:

		driver.findElement(By.id("com.android.contacts:id/two")).click();

		break;

		case 3:

		driver.findElement(By.id("com.android.contacts:id/three")).click();

		break;

		case 4:

		driver.findElement(By.id("com.android.contacts:id/four")).click();

		break;

		case 5:

		driver.findElement(By.id("com.android.contacts:id/five")).click();

		break;

		case 6:

		driver.findElement(By.id("com.android.contacts:id/six")).click();

		break;

		case 7:

		driver.findElement(By.id("com.android.contacts:id/seven")).click();

		break;

		case 8:

		driver.findElement(By.id("com.android.contacts:id/eight")).click();

		break;

		case 9:

		driver.findElement(By.id("com.android.contacts:id/nine")).click();

		break;

		case 0:

		driver.findElement(By.id("com.android.contacts:id/zero")).click();

		break;

		default:

		break;

		}

		}

		driver.findElement(By.id("com.android.contacts:id/callbutton")).click();

		driver.quit();
	}
	}