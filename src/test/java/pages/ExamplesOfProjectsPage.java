package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ExamplesOfProjectsPage {

    public void sectionExamplesOfProjects() {
        $("#projects-examples").hover();
        $("#projects-examples").shouldHave(text("ПРИМЕРЫ ПРОЕКТОВ"));
    }

    public void viewAllClients() {
        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
    }

    public void clickPrevSlide() {
        $("#projects-examples").$(".carousel-control-prev").click();
    }

    public void clickOnViewAllClients() {
        $("#projects-examples").$("#projects-carousel").find(byText("Посмотреть всех клиентов")).click();
    }

    public void clickNextSlide() {
        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $("#projects-examples").$(".carousel-control-next").click();
    }

    public void clickOnLeftIndicator() {
        $(".ee-carousel-indicators").hover();
        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $(byAttribute("data-slide-to", "0")).click();
    }

    public void clickOnRightIndicator() {
        $(".ee-carousel-indicators").hover();
        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $(byAttribute("data-slide-to", "1")).click();
    }

}


