package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WhatWeAreTestingPage {
    private SelenideElement systems = $(".systems"),
            elementorElement = $(".elementor-element-4ee195f6"),
            projectsExamples = $("#projects-examples"),
            container = $(".container");

    public void checkSectionWhatWeAreTesting(String whatWeAreTesting) {
        systems.hover();
        systems.shouldHave(text(whatWeAreTesting));
    }

    public void checkClickOnTestingWebsite(String clickOn, String testWebsites) {
        systems.find(byText(clickOn)).click();
        switchTo().window(1);
        elementorElement.shouldHave(text(testWebsites));
        switchTo().window(0);
    }

    public void checkClickOnTestingITSystems(String clickOn, String examples) {
        systems.find(byText(clickOn)).click();
        projectsExamples.shouldHave(text(examples));
    }

    public void checkClickOnTestingGames(String clickOn) {
        systems.find(byText(clickOn)).click();
    }

    public void checkClickOnTestingMobileApps(String clickOn, String testingMobile) {
        systems.find(byText(clickOn)).click();
        container.shouldHave(text(testingMobile));
    }

    public void checkClickOnTestingDevices(String testingDevices) {
        systems.find(byText(testingDevices)).click();
    }
}