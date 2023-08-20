package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ThreeReasonsPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("Taygib")
public class ThreeReasonsToWorkWithUsTest extends TastBase{
    ThreeReasonsPage threeReasons = new ThreeReasonsPage();

    @Test
    @Tag("Research")
    @Tag("ThreeReasons")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Проверка наличии трех причин")
    void threeReasonsToWorkWithUs() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Проверка названии раздела 3 ПРИЧИНЫ РАБОТАТЬ С НАМИ", () -> {
            threeReasons.sectionThreeReasonsToWorkWithUs("3 ПРИЧИНЫ РАБОТАТЬ С НАМИ");
        });

        step("Проверка первой причины", () -> {
            threeReasons.checkFirstReason("МЫ СПЕЦИАЛИЗИРУЕМСЯ НА ТЕСТИРОВАНИИ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ");
        });

        step("Проверка второй причины", () -> {
            threeReasons.checkSecondReason("ПРЕДМЕТНЫЕ ЗНАНИЯ В РАЗЛИЧНЫХ ОТРАСЛЯХ: БАНКИ, РИТЕЙЛ, ТЕЛЕКОМ");
        });

        step("Проверка третьей причины", () -> {
            threeReasons.checkThirdReason("СОВРЕМЕННЫЕ И КЛАССИЧЕСКИЕ ПОДХОДЫ");
        });
    }
}