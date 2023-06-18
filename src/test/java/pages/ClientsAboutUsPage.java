package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClientsAboutUsPage {

    public void sectionClientsAboutUs() {
        $(".clients-about").hover();
        $(".clients-about").shouldHave(text("КЛИЕНТЫ О НАС"));
    }

    public void clickOnX5RetailGroup() {
        $(".clients-about").$(byAttribute("title", "X5 Retail Group pdf")).click();
    }

    public void clickOnDitOmsk() {
        $(".clients-about").$(byAttribute("title", "ДИТ Омск pdf")).click();
    }

    public void clickOnRolf() {
        $(".clients-about").$(byAttribute("title", "Рольф pdf")).click();
    }
    public void clickOnRostelekom() {
        $(".clients-about").$(byAttribute("title", "Ростелеком pdf")).click();
    }
    public void clickOnVTB24() {
        $(".clients-about").$(byAttribute("title", "ВТБ24 pdf")).click();
    }
    public void clickOnWitology() {
        $(".clients-about").$(byAttribute("title", "Witology pdf")).click();
    }

    public void close() {
        $(".eicon-close").click();
    }

    public void clickRightFiveTimes() {
        $(".ekko-lightbox-container").find(byText("❯")).hover();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
    }

    public void clickLeftFiveTimes() {
        $(".ekko-lightbox-container").find(byText("❮")).hover();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
    }

    public void closeClient() {
        $(".ekko-lightbox").pressEscape();
    }
}
