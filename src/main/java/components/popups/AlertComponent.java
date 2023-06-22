package components.popups;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.menu.MenuComponent;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AlertComponent extends AbsPopupBase {

    private SelenideElement alertElement = $(By.id("android:id/parentPanel"));
    private SelenideElement okButton = $(By.id("android:id/button1"));

    @Override
    public AlertComponent popupShouldBeVisible() {
        alertElement.shouldBe(Condition.visible);

        return this;
    }

    @Override
    public AlertComponent popupShouldNotBeVisible() {
        alertElement.shouldNotBe(Condition.visible);

        return this;
    }

    public MenuComponent clickOkButton(){
        okButton.click();

        return new MenuComponent();
    }
}
