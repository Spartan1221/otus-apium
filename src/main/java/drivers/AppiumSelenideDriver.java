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
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setDeviceName("otus");
        uiAutomator2Options.setPlatformVersion("11.0");
        uiAutomator2Options.setAppPackage("com.pyankoff.andy");
        uiAutomator2Options.setAppActivity(".MainActivity");

        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), uiAutomator2Options);
        } catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
    }
}
