package addition1;



import javax.print.DocFlavor.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class dayOne {
	AppiumDriver driver;
	@Test
	
	public void TestRunner() throws InterruptedException
	{
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:app", "storage:filename=ApiDemosdebug.apk");  // The filename of the mobile app same 
		//hona chaiye 
		caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
		caps.setCapability("appium:platformVersion", "15.0");
		caps.setCapability("appium:automationName", "UiAutomator2");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "2.11.0");
		sauceOptions.setCapability("username", "oauth-ritiksingh.kushwaha-5a75b");
		sauceOptions.setCapability("accessKey", "26312cc8-ccf2-4f92-8a8d-a2d5e75ad624");
		sauceOptions.setCapability("build", "<your build id>");
		sauceOptions.setCapability("name", "<your test name>");
		sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
		caps.setCapability("sauce:options", sauceOptions);

		// Start the session
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		AndroidDriver driver = new AndroidDriver(caps);

		// replace with commands and assertions
		Thread.sleep(5000);
		String jobStatus = "passed"; // or "failed"

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		driver.quit();
		
	}
}
