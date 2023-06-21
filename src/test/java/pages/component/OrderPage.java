package pages.component;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage {
    private SelenideElement premiumModalBoxModalBody = $(".premium-modal-box-modal-body"),
            name = $("[name=your-name]"),
            surname = $("[name=your-surname]"),
            email = $("[name=your-email]"),
            tel = $("[name=your-tel]"),
            organization = $("[name=your-organization]"),
            message = $("[name=your-message]");

    public void writeName(String value) {
        premiumModalBoxModalBody.shouldHave(text("Имя"));
        name.click();
        name.setValue(value);
    }

    public void writeSurname(String value) {
        premiumModalBoxModalBody.shouldHave(text("Фамилия"));
        surname.click();
        surname.setValue(value);
    }

    public void writeEmail(String value) {
        premiumModalBoxModalBody.shouldHave(text("Email"));
        email.click();
        email.setValue(value);
    }

    public void writeTelephone(String value) {
        premiumModalBoxModalBody.shouldHave(text("Телефон"));
        tel.click();
        tel.setValue(value);
    }

    public void writeCompany(String value) {
        premiumModalBoxModalBody.shouldHave(text("Компания"));
        organization.click();
        organization.setValue(value);
    }

    public void writeMessage(String value) {
        premiumModalBoxModalBody.shouldHave(text("Сообщение"));
        message.click();
        message.setValue(value);
    }

    public void hoverToSend() {
        $("[value=Отправить]").hover();
    }

    public void closeContainer() {
        $(".premium-modal-box-close-button-container").click();
    }
}