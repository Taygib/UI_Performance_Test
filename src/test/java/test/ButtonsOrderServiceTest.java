package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.OrderServicePage;
import test.component.TitleField;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ButtonsOrderServiceTest extends TastBase {
    OrderServicePage orderService = new OrderServicePage();
    TitleField titleFieldInOrderService = new TitleField();

    @Test
    @Tag("Research")
    @Tag("ButtonsOrder")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кнопок =Заказать услугу=")
    void ButtonsOrderTest() {

        String service = "Заказать услугу";

        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });
        step("Проверка кнопки =Заказать услугу= в правом верхнем углу", () -> {
            orderService.clickOnOrderServiceInTheUpperRightCorner(service);
            titleFieldInOrderService.fields();
        });

        step("Проверка кнопки =Заказать услугу= под разделом =Функциональное тестирование=", () -> {
            orderService.clickOnOrderServiceUnderSectionFunctionalTesting(service);
            titleFieldInOrderService.fields();
        });

        step("Проверка кнопки =Заказать услугу= под разделом =Перфоманс лаб - это=", () -> {
            orderService.clickOnOrderServiceUnderSectionPerformanceLabIs(service);
            titleFieldInOrderService.fields();
        });

        step("Проверка кнопки =Заказать услугу= под разделом =ЧТО МЫ ТЕСТИРУЕМ=", () -> {
            orderService.clickOnOrderServiceUnderSectionWhatWeAreTesting(service);
            titleFieldInOrderService.fields();
        });

        step("Проверка кнопки =Заказать услугу= под разделом =КАТАЛОГ УСЛУГ=", () -> {
            orderService.clickOnOrderServiceUnderSectionServiceCatalog(service);
            titleFieldInOrderService.fields();
        });

        step("Проверка кнопки =Заказать услугу= под разделом =КАК МЫ РАБОТАЕМ=", () -> {
            orderService.clickOnOrderServiceUnderSectionHowWeWorking(service);
            titleFieldInOrderService.fields();
        });
    }
}