package pages;

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

    public void writeName() {
        $(".premium-modal-box-modal-body").shouldHave(text("Имя"));
        $("[name=your-name]").click();
        $("[name=your-name]").setValue("граф");
    }

    public void writeSurname() {
        $(".premium-modal-box-modal-body").shouldHave(text("Фамилия"));
        $("[name=your-surname]").click();
        $("[name=your-surname]").setValue("краснов");
    }

    public void writeEmail() {
        $(".premium-modal-box-modal-body").shouldHave(text("Email"));
        $("[name=your-email]").click();
        $("[name=your-email]").setValue("hghghg@mail.ru");
    }

    public void writeTelephone() {
        $(".premium-modal-box-modal-body").shouldHave(text("Телефон"));
        $("[name=your-tel]").click();
        $("[name=your-tel]").setValue("7777777777");
    }

    public void writeCompany() {
        $(".premium-modal-box-modal-body").shouldHave(text("Компания"));
        $("[name=your-organization]").click();
        $("[name=your-organization]").setValue("FunctionalLab");
    }

    public void writeMessage() {
        $(".premium-modal-box-modal-body").shouldHave(text("Сообщение"));
        $("[name=your-message]").click();
        $("[name=your-message]").setValue("FunctionalTest");
    }

    public void hoverToSend() {
        $("[value=Отправить]").hover();
    }

    public void closeContainer() {
        $(".premium-modal-box-close-button-container").click();
    }

}
