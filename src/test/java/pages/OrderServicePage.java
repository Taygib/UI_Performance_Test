package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OrderServicePage {
    private SelenideElement masthead = $("#masthead"),
            firstPart = $(".first_part"),
            inf = $(".inf"),
            systems = $(".systems"),
            catalogMenu = $(".catalog-menu"),
            howWeWork = $(".how-we-work");

    public void clickOnOrderServiceInTheUpperRightCorner(String orderService) {
        masthead.find(byText(orderService)).hover();
        masthead.find(byText(orderService)).click();
    }

    public void clickOnOrderServiceUnderSectionFunctionalTesting(String orderService) {
        firstPart.find(byText(orderService)).hover();
        firstPart.find(byText(orderService)).click();
    }

    public void clickOnOrderServiceUnderSectionPerformanceLabIs(String orderService) {
        inf.find(byText(orderService)).hover();
        inf.find(byText(orderService)).click();
    }

    public void clickOnOrderServiceUnderSectionWhatWeAreTesting(String orderService) {
        systems.find(byText(orderService)).hover();
        systems.find(byText(orderService)).click();
    }

    public void clickOnOrderServiceUnderSectionServiceCatalog(String orderService) {
        catalogMenu.find(byText(orderService)).hover();
        catalogMenu.find(byText(orderService)).click();
    }

    public void clickOnOrderServiceUnderSectionHowWeWorking(String orderService) {
        howWeWork.find(byText(orderService)).hover();
        howWeWork.find(byText(orderService)).click();
    }
}