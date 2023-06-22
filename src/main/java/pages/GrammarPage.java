package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GrammarPage extends AbsBasePage<GrammarPage> {

    private SelenideElement basicCategoryTextView = $("[text='BASIC']");

    public GrammarPage titleTOfPageShouldBeVisible(String expectedText) {
        basicCategoryTextView.shouldBe(Condition.visible);

        return this;
    }
}
