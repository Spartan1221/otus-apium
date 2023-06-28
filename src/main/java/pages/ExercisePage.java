package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ExercisePage extends AbsBasePage<ExercisePage> {

    private SelenideElement titleTextView = $("[text='Learn 5 new words today']");
    private SelenideElement startButton = $("[text='Start']");

    @Step("Проверка отображения заголовка страницы")
    public ExercisePage titleTOfPageShouldBeVisible(){
        titleTextView.shouldBe(Condition.visible);

        return this;
    }

    @Step("Проверка отображения кнопки - start")
    public ExercisePage startButtonShouldBeVisible(){
        startButton.shouldBe(Condition.visible);

        return this;
    }
}
