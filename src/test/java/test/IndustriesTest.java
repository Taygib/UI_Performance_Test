package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.IndustriesPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class IndustriesTest extends TastBase {
    IndustriesPage industries = new IndustriesPage();

    @Test
    @Tag("Research")
    @Tag("Industries")
    @Owner("Taygib")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Проверка название отраслей")
    void industries() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Проверка названия раздела ОТРАСЛИ", () -> {
            industries.sectionIndustries("ОТРАСЛИ");
        });

        step("Проверка название отраслей", () -> {
            step("Банковский сектор и Финансы", () -> {
                industries.banksAndFinance("Банковский сектор и Финансы");
            });

            step("Госструктуры", () -> {
                industries.stateStructures("Госструктуры");
            });

            step("Ритейл", () -> {
                industries.retail("Ритейл");
            });

            step("Телеком", () -> {
                industries.telecom("Телеком");
            });

            step("Медицина", () -> {
                industries.medicine("Медицина");
            });

            step("Интернет", () -> {
                industries.internet("Интернет");
            });

            step("Промышленность", () -> {
                industries.industry("Промышленность");
            });

            step("Развлечения", () -> {
                industries.entertainment("Развлечения");
            });

            step("Страхование", () -> {
                industries.insurance("Страхование");
            });

            step("Топливно - энергетическая отрасль", () -> {
                industries.fuelAndEnergyIndustry("Топливно - энергетическая отрасль");
            });

            step("Транспорт, логистика", () -> {
                industries.transportLogistics("Транспорт, логистика");
            });
        });
    }
}
