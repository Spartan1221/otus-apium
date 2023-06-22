package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.popups.AlertComponent;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartPage extends AbsBasePage<StartPage>{

    private SelenideElement skipButton = $("[text='Skip >']");

    public StartPage clickNextButton(){
        $("[text='Next']").click();
        return this;
    }

    public StartPage startPageShouldBeOpened(){
        $(By.id("android:id/content")).shouldBe(Condition.visible);
        return this;
    }

    public StartPage startPageTextSameAs(String expectedText){
        $(String.format("[text='%s']", expectedText)).shouldBe(Condition.visible);

        return this;
    }

    public StartPage skipButtonShouldBeVisible(){
        skipButton.shouldBe(Condition.visible);

        return this;
    }

    public AlertComponent clickSkipButton(){
        skipButton.click();

        return new AlertComponent();
    }
}
