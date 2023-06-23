package components.menu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.AbsBaseComponent;
import org.openqa.selenium.By;
import pages.ExercisePage;
import pages.GrammarPage;
import pages.StartPage;
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

    public MenuComponent chatButtonShouldBeVisible(){
        chatButton.shouldBe(Condition.visible);
        return this;
    }

    public ExercisePage clickExerciseButton(){
        exerciseButton.click();
        return new ExercisePage();
    }

    public MenuComponent exerciseButtonShouldBeVisible(){
        exerciseButton.shouldBe(Condition.visible);
        return this;
    }

    public GrammarPage clickGrammarButton(){
        grammarButton.click();
        return new GrammarPage();
    }

    public MenuComponent grammarButtonShouldBeVisible(){
        grammarButton.shouldBe(Condition.visible);
        return this;
    }

    public StatsPage clickStatsButton(){
        statsButton.click();
        return new StatsPage();
    }

    public MenuComponent statsButtonShouldBeVisible(){
        statsButton.shouldBe(Condition.visible);
        return this;
    }

}
