package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ExercisePage extends AbsBasePage<ExercisePage> {

    private SelenideElement titleTextView = $("[text='Learn 5 new words today']");
    private SelenideElement startButton = $("[text='Start']");

    public ExercisePage titleTOfPageShouldBeVisible(String expectedText){
        titleTextView.shouldBe(Condition.visible);

        return this;
    }

    public ExercisePage startButtonShouldBeVisible(){
        startButton.shouldBe(Condition.visible);

        return this;
    }
}
