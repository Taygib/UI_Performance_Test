package pages;

import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OrderServicePage {

    public void clickOnOrderServiceInTheUpperRightCorner() {
        $("#masthead").find(byText("Заказать услугу")).click();
    }

    public void clickOnOrderServiceButtonCalledFunctionalTesting() {
        $(".testing_btn").find(byText("Заказать услугу")).click();
    }

    public void clickOnOrderServiceButtonCalledPerformanceLabIs() {
        $(".container").$(".testing_btn").find(byText("Заказать услугу")).click();
    }

    public void titleСheck() {
        $(".premium-modal-box-modal-title").shouldHave(text("Свяжитесь с нами"));
    }
}
