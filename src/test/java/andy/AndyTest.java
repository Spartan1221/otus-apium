package andy;

import components.menu.MenuComponent;
import components.popups.AlertComponent;
import data.StartPageHeaderData;
import data.StatsPageFields;
import extensions.AppiumExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;
import pages.StartPage;

@ExtendWith(AppiumExtension.class)
public class AndyTest {

    @BeforeAll
    static void beforeAll() {
        new MainPage().open();

        StartPage startPage = new StartPage()
                .open()
                .startPageShouldBeOpened()
                .startPageTextSameAs(StartPageHeaderData.FIRST_PAGE_HEADER.getHeader())
                .clickNextButton()
                .startPageTextSameAs(StartPageHeaderData.SECOND_PAGE_HEADER.getHeader())
                .clickNextButton()
                .skipButtonShouldBeVisible();
        new AlertComponent()
                .popupShouldNotBeVisible();
        startPage
                .clickSkipButton()
                .popupShouldBeVisible()
                .clickOkButton();
    }


    @Test
    @DisplayName("Проверка отображения кнопок меню")
    public void pageHeadersVisibleTest() {
        new MenuComponent()
                .chatButtonShouldBeVisible()
                .grammarButtonShouldBeVisible()
                .exerciseButtonShouldBeVisible()
                .statsButtonShouldBeVisible();
    }

    @Test
    @DisplayName("Проверка отображения полей страницы статистики")
    public void statsPageFieldsVisibleTest() {
        new MenuComponent()
                .clickStatsButton()
                .statsPageTextSameAs(StatsPageFields.CURRENT_STREAK.getValue())
                .statsPageTextSameAs(StatsPageFields.WORDS_WRITTEN.getValue())
                .statsPageTextSameAs(StatsPageFields.MAXIMUM_STREAK.getValue())
                .statsPageTextSameAs(StatsPageFields.GRAMMAR_LESSONS_TAKEN.getValue())
                .statsPageTextSameAs(StatsPageFields.WORDS_IN_VOCABULARY.getValue());
    }

    @Test
    @DisplayName("Проверка отображения элементов страницы упражнения")
    public void exercisePageElementsVisibleTest() {
        new MenuComponent()
                .clickExerciseButton()
                .startButtonShouldBeVisible()
                .titleTOfPageShouldBeVisible();
    }
}
