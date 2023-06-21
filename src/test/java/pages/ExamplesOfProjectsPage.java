package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ExamplesOfProjectsPage {
    private SelenideElement projectsExamples = $("#projects-examples");

    public void sectionExamplesOfProjects() {
        projectsExamples.hover();
        projectsExamples.shouldHave(text("ПРИМЕРЫ ПРОЕКТОВ"));
    }

    public void viewAllClients() {
        projectsExamples.$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
    }

    public void clickPrevSlide() {
        projectsExamples.$(".carousel-control-prev").click();
    }

    public void clickOnViewAllClients() {
        projectsExamples.$("#projects-carousel").find(byText("Посмотреть всех клиентов")).click();
    }

    public void clickNextSlide() {
        projectsExamples.$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        projectsExamples.$(".carousel-control-next").click();
    }

    public void clickOnLeftIndicator() {
        $(".ee-carousel-indicators").hover();
        projectsExamples.$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $(byAttribute("data-slide-to", "0")).click();
    }

    public void clickOnRightIndicator() {
        $(".ee-carousel-indicators").hover();
        projectsExamples.$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $(byAttribute("data-slide-to", "1")).click();
    }
}


