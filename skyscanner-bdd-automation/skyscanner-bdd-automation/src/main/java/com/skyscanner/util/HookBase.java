package com.skyscanner.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skyscanner.constants.Constant;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HookBase {

	protected static WebDriver driver;

	public void initialize() throws MalformedURLException, Exception {
		InputStream input = new FileInputStream(System.getProperty(Constant.USER_DIR) + "//config//device-settings.properties");
		Properties prop = new Properties();
		prop.load(input);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty(MobileCapabilityType.PLATFORM_VERSION));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty(MobileCapabilityType.PLATFORM_NAME));
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, prop.getProperty(MobileCapabilityType.APPIUM_VERSION));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty(MobileCapabilityType.DEVICE_NAME));
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(Constant.AUTOGRANTPERMISSIONS, true);
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty(Constant.USER_DIR) + "//App//Skyscanner.apk");
		capabilities.setCapability(Constant.APP_PACKAGE, Constant.APP_PACKAGE_NAME);
		capabilities.setCapability(Constant.APP_ACTIVITY, Constant.APP_ACTIVITY_NAME);

		URL url = new URL("http://" + prop.getProperty(Constant.URL));
		driver = new AndroidDriver<MobileElement>(url, capabilities);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public void tearDown() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public void waitForElement(WebElement value) {
		WebDriverWait wait =  new WebDriverWait(driver, Constant.TIME_OUT); 
		wait.until(ExpectedConditions.visibilityOf(value));
	}
}
