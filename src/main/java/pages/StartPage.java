package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.popups.AlertComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartPage extends AbsBasePage<StartPage>{

    private SelenideElement skipButton = $("[text='Skip >']");

    @Step("Нажать на кнопку Next")
    public StartPage clickNextButton(){
        $("[text='Next']").click();
        return this;
    }

    @Step("Проверка открытия стартовой страницы")
    public StartPage startPageShouldBeOpened(){
        $(By.id("android:id/content")).shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка текста на стартовой странице - {expectedText}")
    public StartPage startPageTextSameAs(String expectedText){
        $(String.format("[text='%s']", expectedText)).shouldBe(Condition.visible);

        return this;
    }

    @Step("Проверка отображения кнопки Skip")
    public StartPage skipButtonShouldBeVisible(){
        skipButton.shouldBe(Condition.visible);

        return this;
    }

    @Step("Нажать на кнопку Skip")
    public AlertComponent clickSkipButton(){
        skipButton.click();

        return new AlertComponent();
    }
}
