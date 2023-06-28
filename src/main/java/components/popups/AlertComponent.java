package components.popups;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.menu.MenuComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AlertComponent extends AbsPopupBase {

    private SelenideElement alertElement = $(By.id("android:id/parentPanel"));
    private SelenideElement okButton = $(By.id("android:id/button1"));

    @Step("Проверка отображения popup")
    @Override
    public AlertComponent popupShouldBeVisible() {
        alertElement.shouldBe(Condition.visible);

        return this;
    }

    @Step("Проверка не отображения popup")
    @Override
    public AlertComponent popupShouldNotBeVisible() {
        alertElement.shouldNotBe(Condition.visible);

        return this;
    }

    @Step("Нажать на кнопку Ок")
    public MenuComponent clickOkButton(){
        okButton.click();

        return new MenuComponent();
    }
}
