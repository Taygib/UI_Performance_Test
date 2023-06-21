package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class WhatWeAreTestingPage {
    private SelenideElement systems = $(".systems");

    public void sectionWhatWeAreTesting() {
        systems.hover();
        systems.shouldHave(text("ЧТО МЫ ТЕСТИРУЕМ"));
    }

    public void testingWebsite() {
        $(byAttribute("title", "Тестирование сайтов")).click();
    }

    public void testingITSystems() {
        $(byAttribute("title", "Тестирование IT-систем")).click();
    }

    public void testingGames() {
        systems.find(byText("ИГРЫ")).click();
    }

    public void testingMobileApps() {
        $(byAttribute("title", "Тестирование мобильных приложений")).click();
    }

    public void testingDevices() {
        systems.find(byText("УМНЫЕ УСТРОЙСТВА, VR, AR")).click();
    }

    public void orderServiceForTesting() {
        systems.find(byText("Заказать услугу")).click();
    }
}