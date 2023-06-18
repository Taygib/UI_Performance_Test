package test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;

public class TastBase {

    DeleteFormPage deleteForm = new DeleteFormPage();
    OrderServicePage orderService = new OrderServicePage();
    ClientsPage clients = new ClientsPage();
    WhatWeAreTestingPage whatWeTesting = new WhatWeAreTestingPage();
    ThreeReasonsPage threeReasons = new ThreeReasonsPage();
    HowWeAreWorkingPage HowWorking = new HowWeAreWorkingPage();
    IndustriesPage industries = new IndustriesPage();
    ClientsAboutUsPage clientsAboutUs = new ClientsAboutUsPage();
    ExamplesOfProjectsPage examples = new ExamplesOfProjectsPage();
    ServiceCatalogPage catalog = new ServiceCatalogPage();


    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {

        Selenide.closeWebDriver();
    }

}
