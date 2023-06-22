package components.menu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.AbsBaseComponent;
import org.openqa.selenium.By;
import pages.StartPage;

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

    public MenuComponent clickExerciseButton(){
        exerciseButton.click();
        return this;
    }

    public MenuComponent exerciseButtonShouldBeVisible(){
        exerciseButton.shouldBe(Condition.visible);
        return this;
    }

    public MenuComponent clickGrammarButton(){
        grammarButton.click();
        return this;
    }

    public MenuComponent grammarButtonShouldBeVisible(){
        grammarButton.shouldBe(Condition.visible);
        return this;
    }

    public MenuComponent clickStatsButton(){
        statsButton.click();
        return this;
    }

    public MenuComponent statsButtonShouldBeVisible(){
        statsButton.shouldBe(Condition.visible);
        return this;
    }

}
