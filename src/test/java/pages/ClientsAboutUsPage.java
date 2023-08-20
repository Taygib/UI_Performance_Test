package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class ClientsAboutUsPage {

    private SelenideElement clientsAbout = $(".clients-about"),
            clientsAboutX5Retail = $(".clients-about").
                    $(byAttribute("title", "X5 Retail Group pdf")),
            clientsAboutDitOmsk = $(".clients-about").
                    $(byAttribute("title", "ДИТ Омск pdf")),
            clientsAboutRolf = $(".clients-about").
                    $(byAttribute("title", "Рольф pdf")),
            clientsAboutRostelekom = $(".clients-about").
                    $(byAttribute("title", "Ростелеком pdf")),
            clientsAboutVTB24 = $(".clients-about").
                    $(byAttribute("title", "ВТБ24 pdf")),
            clientsAboutWitology = $(".clients-about").
                    $(byAttribute("title", "Witology pdf"));


    public void sectionClientsAboutUs(String aboutUs) {
        clientsAbout.hover();
        clientsAbout.shouldHave(text(aboutUs));
    }

    public void clickOnX5RetailGroup(String x5Retail) {
        clientsAboutX5Retail.hover();
        clientsAbout.shouldHave(text(x5Retail));
    }

    public void clickOnDitOmsk(String ditOmsk) {
        clientsAboutDitOmsk.hover();
        clientsAbout.shouldHave(text(ditOmsk));
    }

    public void clickOnRolf(String rolf) {
        clientsAboutRolf.hover();
        clientsAbout.shouldHave(text(rolf));
    }

    public void clickOnRostelekom(String rostelekom) {
        clientsAboutRostelekom.hover();
        clientsAbout.shouldHave(text(rostelekom));
    }

    public void clickOnVTB24(String vtb24) {
        clientsAboutVTB24.hover();
        clientsAbout.shouldHave(text(vtb24));
    }

    public void clickOnWitology(String witology) {
        clientsAboutWitology.hover();
        clientsAbout.shouldHave(text(witology));
    }
}