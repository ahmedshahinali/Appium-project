package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy.ById;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
public class runnactiveapp {
	@Test
	public void openApp() throws MalformedURLException, InterruptedException {
		System.out.println("Application");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"android");
		//  caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\Ahmed Shahin\\eclipse-workspace\\qacartappium\\QAcart-To-Do.apk");
		// caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.gm");
	    //	caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.gm.welcome.WelcomeTourActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		  driver.findElement(MobileBy.AccessibilityId("Play Music")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("com.google.android.music:id/add_account_button")).click();
		  Thread.sleep(7000);
		  driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("email@email.com");
		  driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();  
	}
}




