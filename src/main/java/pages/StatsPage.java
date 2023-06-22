package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class StatsPage extends AbsBasePage<GrammarPage> {

    private SelenideElement basicCategoryTextView = $("[text='Settings']");

    public StatsPage statsPageTextSameAs(String expectedText){
        $(String.format("[text='%s']", expectedText)).shouldBe(Condition.visible);

        return this;
    }
}
