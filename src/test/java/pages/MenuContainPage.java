package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MenuContainPage {
    private SelenideElement menuPrimary = $("#mega-menu-primary");
    private ElementsCollection menuLink = $$(".mega-menu-link");

    public void parameterMenu(String containMenu, List<String> expectedButtons) {
        menuPrimary.find(withText(containMenu)).hover();
        menuLink.shouldHave(CollectionCondition.containExactTextsCaseSensitive(expectedButtons));
    }
}