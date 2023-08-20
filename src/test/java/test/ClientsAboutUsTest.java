package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ClientsAboutUsPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ClientsAboutUsTest extends TastBase {
    ClientsAboutUsPage clientsAboutUs = new ClientsAboutUsPage();

    @Test
    @Tag("Research")
    @Tag("Clients")
    @Owner("Taygib")
    @Severity(SeverityLevel.TRIVIAL)
    @DisplayName("Проверка клиентов")
    void clientsAboutUs() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step(" Проверка названия раздела", () -> {
            clientsAboutUs.sectionClientsAboutUs("КЛИЕНТЫ О НАС");
        });

        step("Проверка названия X5 Retail Group", () -> {
            clientsAboutUs.clickOnX5RetailGroup("X5 RETAIL GROUP");
        });

        step("Проверка названия ДИТ Омск", () -> {
            clientsAboutUs.clickOnDitOmsk("ДИТ ГОРОД ОМСК");
        });

        step("Проверка названия Рольф", () -> {
            clientsAboutUs.clickOnRolf("РОЛЬФ");
        });

        step("Проверка названия Ростелеком", () -> {
            clientsAboutUs.clickOnRostelekom("РОСТЕЛЕКОМ");
        });

        step("Проверка названия ВТБ24", () -> {
            clientsAboutUs.clickOnVTB24("ВТБ24");
        });

        step("Проверка названия Witology", () -> {
            clientsAboutUs.clickOnWitology("WITOLOGY");
        });
    }
}