package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClientsPage {

    public void sectionOurClients() {
        $(".clients").shouldHave(text("НАШИ КЛИЕНТЫ")).hover();
    }

    public void clickOnClients() {

        $(".clients").find(byText("Посмотреть всех клиентов")).click();
    }

    public void howPerformanceLabHelp() {

        $("#client-page-title").shouldHave(text("Нам доверяют тысячи клиентов во всем мире"));
        $(".module-features").shouldHave(text("Узнайте как Перфоманс Лаб помогает клиентам:"));
        $(".module-features").shouldHave(text("Улучшить качество программных продуктов"),
                text("Протестировать приложения"), text("Повысить удовлетворенность пользователей"));
    }

    public void clickOnReadCases() {
        $(".module-features").find(byText("Читать кейсы")).click();
    }

    public void checkContactInformation() {

        $(".start-block").shouldHave(text("Получите предложение уже сегодня"));
        //проверка контактной информации
        $(".info-contacts").shouldHave(text("Свяжитесь с нами"),text("+7 495 989 6165"),
                text("Пн-Пт с 10 до 19 часов"),text("info@pflb.ru") );

    }
    public void checkAddInformationAndServices() {
        $(".info-contacts").shouldHave(text("Узнайте больше"));
        $(".info-contacts").find(byText("услуги")).click();
    }

    public void orderService() {
        $(".info-contacts").shouldHave(text("Получите предложение"));
        $(".info-contacts").find(byText("Заказать услугу")).click();
    }

}
