package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClientsPage {
    private SelenideElement clients = $(".clients"),
            infoContacts = $(".info-contacts"),
            moduleFeatures = $(".module-features");

    public void sectionOurClients() {
        clients.shouldHave(text("НАШИ КЛИЕНТЫ")).hover();
    }

    public void clickOnClients() {
        clients.find(byText("Посмотреть всех клиентов")).click();
    }

    public void howPerformanceLabHelp() {
        $("#client-page-title").shouldHave(text("Нам доверяют тысячи клиентов во всем мире"));
        moduleFeatures.shouldHave(text("Узнайте как Перфоманс Лаб помогает клиентам:"));
        moduleFeatures.shouldHave(text("Улучшить качество программных продуктов"),
                text("Протестировать приложения"), text("Повысить удовлетворенность пользователей"));
    }

    public void clickOnReadCases() {
        moduleFeatures.find(byText("Читать кейсы")).click();
    }

    public void checkContactInformation() {
        $(".start-block").shouldHave(text("Получите предложение уже сегодня"));
        //проверка контактной информации
        infoContacts.shouldHave(text("Свяжитесь с нами"), text("+7 495 989 6165"),
                text("Пн-Пт с 10 до 19 часов"), text("info@pflb.ru"));
    }

    public void checkAddInformationAndServices() {
        infoContacts.shouldHave(text("Узнайте больше"));
        infoContacts.find(byText("услуги")).click();
    }

    public void orderService() {
        infoContacts.shouldHave(text("Получите предложение"));
        infoContacts.find(byText("Заказать услугу")).click();
    }
}