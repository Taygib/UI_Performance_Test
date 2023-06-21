package pages;

import com.codeborne.selenide.CollectionCondition;

import java.util.List;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MenuContainPage {

    public void parameterMenu(String containMenu, List<String> expectedButtons) {
        $("#mega-menu-primary").find(withText(containMenu)).hover();
        $$(".mega-menu-link").shouldHave(CollectionCondition.containExactTextsCaseSensitive(expectedButtons));
    }
}
