package andy;

import components.popups.AlertComponent;
import data.StartPageHeaderData;
import extensions.AppiumExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;
import pages.StartPage;

@ExtendWith(AppiumExtension.class)
public class AndyTest {

    @Test
    public void clickTest(){
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
    public void pageHeadersVisibleTest(){
        //TODO if not open
        new MainPage().open();

        StartPage startPage = new StartPage()
                .open()
                .clickNextButton()
                .clickNextButton();
        startPage
                .clickSkipButton()
                .popupShouldBeVisible()
                .clickOkButton()
                .chatButtonShouldBeVisible()
                .grammarButtonShouldBeVisible()
                .exerciseButtonShouldBeVisible()
                .statsButtonShouldBeVisible();
    }
}
