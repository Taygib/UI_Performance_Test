package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import pages.component.OrderPage;

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
    OrderPage order = new OrderPage();
    MenuContainPage menuContainPage = new MenuContainPage();
    Faker faker = new Faker();


    @BeforeAll
    static void beforeAll() {
       Configuration.browser = System.getProperty("browser", "chrome");
       Configuration.browserSize = System.getProperty("brSize", "1520x780");
       Configuration.browserVersion = System.getProperty("brVersion", "100.0");
  //     Configuration.remote = System.getProperty("selenoidRemote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

  //      DesiredCapabilities capabilities = new DesiredCapabilities();
  //      capabilities.setCapability("selenoid:options", Map.<String, Object>of(
  //              "enableVNC", true,
  //              "enableVideo", true
  //      ));
  //     Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = System.getProperty("baseUrl", "https://www.performance-lab.ru");
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

  //  @AfterEach
  //  void addAttachments() {
  //      Attach.screenshotAs("Last screenshot");
  //      Attach.pageSource();
  //      Attach.browserConsoleLogs();
  //      Attach.addVideo();
  //      Selenide.closeWebDriver();
  //  }
}
