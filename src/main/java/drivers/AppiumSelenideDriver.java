package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSelenideDriver implements WebDriverProvider {
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.merge(capabilities);
        uiAutomator2Options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        uiAutomator2Options.setPlatformName(System.getProperty("platformName"));
        uiAutomator2Options.setDeviceName(System.getProperty("deviceName"));
        uiAutomator2Options.setPlatformVersion(System.getProperty("platformVersion"));
        uiAutomator2Options.setAppPackage("com.pyankoff.andy");
        uiAutomator2Options.setAppActivity(".MainActivity");

        try {
            return new AndroidDriver(new URL(System.getProperty("appiumServerUrl")), uiAutomator2Options);
        } catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
    }
}
