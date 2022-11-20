package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class OpenWeb {
	 
WebDriver driver;
DesiredCapabilities cap = new DesiredCapabilities();
 
@SuppressWarnings("deprecation")
@BeforeClass
public void init() throws MalformedURLException{
     
cap.setCapability("deviceName", "device");
cap.setCapability("PLATFORM_NAME", "Android");
cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); 
cap.setCapability(CapabilityType.VERSION, "13");
 
}
 
@Test
public void testApp() throws MalformedURLException {
 
driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    driver.get("https://www.amazon.com");
 
}
 
}
	

/*public class runweb {
	@Test 
	public void runweblocation() throws MalformedURLException {
		System.out.println("browser");
		DesiredCapabilities caps = new DesiredCapabilities();
		
        caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"device");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		
      WebDriverManager.chromedriver().setup(); 
       caps.setCapability("ChromedriverExecutable",WebDriverManager.chromedriver());
        AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);    
        driver.get("https://www.google.com");
  
        
	}
} */
