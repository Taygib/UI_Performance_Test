package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HowWeAreWorkingPage {
    private SelenideElement howWeWork = $(".how-we-work"),
            information = $(".information");

    public void sectionHowWeAreWorking() {
        howWeWork.hover();
        howWeWork.shouldHave(text("КАК МЫ РАБОТАЕМ"));
    }

    public void stepFirst() {
        howWeWork.shouldHave(text("Анализ программного обеспечения и документации (BRD, FSD, User stories)"));
        howWeWork.find(byText("01.")).click();
        information.shouldHave(text("Анализ программного обеспечения и документации (BRD, FSD, User stories)"));
    }

    public void stepSecond() {
        howWeWork.shouldHave(text("Разработка тестовой модели"));
        howWeWork.find(byText("02.")).click();
        information.shouldHave(text("Разработка тестовой модели"));
    }

    public void stepThird() {
        howWeWork.shouldHave(text("Проведение тестирования"));
        howWeWork.find(byText("03.")).click();
        information.shouldHave(text("Проведение тестирования"));
    }

    public void stepFourth() {
        howWeWork.shouldHave(text("Подготовка отчета"));
        howWeWork.find(byText("04.")).click();
        information.shouldHave(text("Подготовка отчета"));
    }

    public void orderServiceForWorking() {
        howWeWork.find(byText("Заказать услугу")).click();
    }
}