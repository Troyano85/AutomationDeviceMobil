package driver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalTime;
import java.util.Properties;

public class MyDriverMobil extends AppiumDriver {
    public MyDriverMobil(URL url, DesiredCapabilities capabilities) {
        super(url, capabilities);
    }



    public static MyDriverMobil initAndroid() throws Exception {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "motorola one fusion");
        capabilities.setCapability("automationName", "UIAutomator2");
        capabilities.setCapability("appPackage", "com.google.android.gm");
        capabilities.setCapability("appActivity", "com.google.android.gm.ui.MailActivityGmail");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        MyDriverMobil driver = new MyDriverMobil(url, capabilities);

        return driver;
    }


}

