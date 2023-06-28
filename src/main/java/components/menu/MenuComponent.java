package components.menu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.AbsBaseComponent;
import io.qameta.allure.Step;
import pages.ExercisePage;
import pages.GrammarPage;
import pages.StatsPage;

import static com.codeborne.selenide.Selenide.$;

public class MenuComponent extends AbsBaseComponent {

    private SelenideElement chatButton = $("[text='Chat']");
    private SelenideElement exerciseButton = $("[text='Exercise']");
    private SelenideElement grammarButton = $("[text='Grammar']");
    private SelenideElement statsButton = $("[text='Stats']");


    public MenuComponent clickChatButton(){
        chatButton.click();
        return this;
    }

    @Step("Проверка отображения кнопки - Chat")
    public MenuComponent chatButtonShouldBeVisible(){
        chatButton.shouldBe(Condition.visible);
        return this;
    }

    @Step("Нажать на кнопку - Exercise")
    public ExercisePage clickExerciseButton(){
        exerciseButton.click();
        return new ExercisePage();
    }

    @Step("Проверка отображения кнопки - Exercise")
    public MenuComponent exerciseButtonShouldBeVisible(){
        exerciseButton.shouldBe(Condition.visible);
        return this;
    }

    public GrammarPage clickGrammarButton(){
        grammarButton.click();
        return new GrammarPage();
    }

    @Step("Проверка отображения кнопки - Grammar")
    public MenuComponent grammarButtonShouldBeVisible(){
        grammarButton.shouldBe(Condition.visible);
        return this;
    }

    @Step("Нажать на кнопку - Stats")
    public StatsPage clickStatsButton(){
        statsButton.click();
        return new StatsPage();
    }

    @Step("Проверка отображения кнопки - Stats")
    public MenuComponent statsButtonShouldBeVisible(){
        statsButton.shouldBe(Condition.visible);
        return this;
    }

}
