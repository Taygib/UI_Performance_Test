package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HowWeAreWorkingPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class HowWeAreWorkingTest extends TastBase {
    HowWeAreWorkingPage HowWorking = new HowWeAreWorkingPage();

    @Test
    @Tag("Research")
    @Tag("HowWorking")
    @Owner("Taygib")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Проверка названия и соответствия шагов")
    void howWeAreWorking() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Проверка название раздела", () -> {
            HowWorking.sectionHowWeAreWorking("КАК МЫ РАБОТАЕМ");
        });

        step("Проверка первого шага =Анализ программного обеспечения и документации=", () -> {
            HowWorking.stepFirst("Анализ программного обеспечения и документации (BRD, FSD, User stories)",
                    "01.");
        });

        step("Проверка второго шага =Разработка тестовой модели=", () -> {
            HowWorking.stepSecond("Разработка тестовой модели",
                    "02.");
        });

        step("Проверка третьего шага =Проведение тестирования=", () -> {
            HowWorking.stepThird("Проведение тестирования",
                    "03.");
        });

        step("Проверка четвертого шага =Подготовка отчета=", () -> {
            HowWorking.stepFourth("Подготовка отчета",
                    "04.");
        });
    }
}