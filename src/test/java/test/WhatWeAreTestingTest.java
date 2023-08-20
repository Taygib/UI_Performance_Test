package test;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.WhatWeAreTestingPage;
import test.component.TitleField;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class WhatWeAreTestingTest extends TastBase {
    WhatWeAreTestingPage whatWeTesting = new WhatWeAreTestingPage();
    TitleField titleFieldInOrderService = new TitleField();

    @Test
    @Tag("Research")
    @Tag("WhatWeAreTesting")
    @Owner("Taygib")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка кликабельности по видам услуг тестирования в разделе ЧТО МЫ ТЕСТИРУЕМ")
    void whatWeAreTesting() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Проверка названия раздела =ЧТО МЫ ТЕСТИРУЕМ=", () -> {
            whatWeTesting.checkSectionWhatWeAreTesting("ЧТО МЫ ТЕСТИРУЕМ");
        });

        step("Проверка кликабельности по =САЙТЫ=", () -> {
            whatWeTesting.checkClickOnTestingWebsite("САЙТЫ",
                    "Комплексное тестирование веб сайтов");
        });

        step("Проверка кликабельности по =IT-СИСТЕМЫ=", () -> {
            whatWeTesting.checkClickOnTestingITSystems("ИТ-СИСТЕМЫ",
                    "ПРИМЕРЫ ПРОЕКТОВ");
        });

        step("Проверка кликабельности по =ИГРЫ=", () -> {
            whatWeTesting.checkClickOnTestingGames("ИГРЫ");
            titleFieldInOrderService.fields();
        });

        step("Проверка кликабельности по =МОБИЛЬНЫЕ ПРИЛОЖЕНИЯ=", () -> {
            whatWeTesting.checkClickOnTestingMobileApps("МОБИЛЬНЫЕ ПРИЛОЖЕНИЯ",
                    "Тестирование мобильных приложений");
        });

        Selenide.back();

        step("Проверка кликабельности по =УМНЫЕ УСТРОЙСТВА, VR, AR=", () -> {
            whatWeTesting.checkClickOnTestingDevices("УМНЫЕ УСТРОЙСТВА, VR, AR");
            titleFieldInOrderService.fields();
        });
    }
}