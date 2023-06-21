package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClientsAboutUsPage {

    private SelenideElement clientsAbout = $(".clients-about"),
            ekkoLightboxContainer = $(".ekko-lightbox-container");

    public void sectionClientsAboutUs() {
        clientsAbout.hover();
        clientsAbout.shouldHave(text("КЛИЕНТЫ О НАС"));
    }

    public void clickOnX5RetailGroup() {
        clientsAbout.$(byAttribute("title", "X5 Retail Group pdf")).click();
    }

    public void clickOnDitOmsk() {
        clientsAbout.$(byAttribute("title", "ДИТ Омск pdf")).click();
    }

    public void clickOnRolf() {
        clientsAbout.$(byAttribute("title", "Рольф pdf")).click();
    }

    public void clickOnRostelekom() {
        clientsAbout.$(byAttribute("title", "Ростелеком pdf")).click();
    }

    public void clickOnVTB24() {
        clientsAbout.$(byAttribute("title", "ВТБ24 pdf")).click();
    }

    public void clickOnWitology() {
        clientsAbout.$(byAttribute("title", "Witology pdf")).click();
    }

    public void close() {
        $(".eicon-close").click();
    }

    public void clickRightFiveTimes() {
        ekkoLightboxContainer.find(byText("❯")).hover();
        ekkoLightboxContainer.find(byText("❯")).click();
        ekkoLightboxContainer.find(byText("❯")).click();
        ekkoLightboxContainer.find(byText("❯")).click();
        ekkoLightboxContainer.find(byText("❯")).click();
        ekkoLightboxContainer.find(byText("❯")).click();
    }

    public void clickLeftFiveTimes() {
        ekkoLightboxContainer.find(byText("❮")).hover();
        ekkoLightboxContainer.find(byText("❮")).click();
        ekkoLightboxContainer.find(byText("❮")).click();
        ekkoLightboxContainer.find(byText("❮")).click();
        ekkoLightboxContainer.find(byText("❮")).click();
        ekkoLightboxContainer.find(byText("❮")).click();
    }

    public void closeClient() {
        $(".ekko-lightbox").pressEscape();
    }
}
