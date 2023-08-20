package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage {
    private SelenideElement premiumModalBoxModalBody = $(".premium-modal-box-modal-body"),
            yourName = $("[name=your-name]"),
            yourSurname = $("[name=your-surname]"),
            yourEmail = $("[name=your-email]"),
            yourTel = $("[name=your-tel]"),
            yourOrganization = $("[name=your-organization]"),
            yourMessage = $("[name=your-message]"),
            submit = $("[type=submit]"),
            boxClose = $(".premium-modal-box-close-button-container"),
            boxModalTitle = $(".premium-modal-box-modal-title");

    public void titleСheck(String ContactUs) {
        boxModalTitle.shouldHave(text(ContactUs));
    }

    public void checkTitleFieldName(String firstname) {
        premiumModalBoxModalBody.shouldHave(text(firstname));
        yourName.click();
    }

    public void checkTitleFieldSurname(String lastName) {
        premiumModalBoxModalBody.shouldHave(text(lastName));
        yourSurname.click();
    }

    public void checkTitleFieldEmail(String email) {
        premiumModalBoxModalBody.shouldHave(text(email));
        yourEmail.click();
    }

    public void checkTitleFieldTelephone(String Telephone) {
        premiumModalBoxModalBody.shouldHave(text(Telephone));
        yourTel.click();
    }

    public void checkTitleFieldCompany(String company) {
        premiumModalBoxModalBody.shouldHave(text(company));
        yourOrganization.click();
    }

    public void checkTitleFieldMessage(String message) {
        premiumModalBoxModalBody.shouldHave(text(message));
        yourMessage.click();
    }

    public void checkTitleButton(String value, String send) {
        submit.shouldHave(attribute(value, send));
    }

    public void closeContainer() {
        boxClose.click();
    }
}