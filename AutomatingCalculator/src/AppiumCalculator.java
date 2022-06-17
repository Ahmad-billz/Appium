import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumCalculator {

	public static void main(String args[]) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("DEVICE_NAME", "emulator-5554");
		dc.setCapability("appium:platformName", "android");
		dc.setCapability("appium:appPackage", "com.android.calculator2");
		dc.setCapability("appium:appActivity", ".Calculator");
		
		AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		

		MobileElement el5 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_2");
		el5.click();
		MobileElement el6 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_5");
		el6.click();
		MobileElement el7 = (MobileElement) ad.findElementByAccessibilityId("plus");
		el7.click();
		MobileElement el8 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_3");
		el8.click();
		MobileElement el9 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_9");
		el9.click();
		MobileElement el10 = (MobileElement) ad.findElementByAccessibilityId("equals");
		el10.click();

		Assert.assertEquals(ad.findElementById("com.android.calculator2:id/result").getText(),64);
	}

}
