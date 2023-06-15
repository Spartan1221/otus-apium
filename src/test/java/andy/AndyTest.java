package andy;

import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(AppiumExtension.class)
public class AndyTest {

    @Test
    public void clickTest(){
        new MainPage().open();
    }
}
