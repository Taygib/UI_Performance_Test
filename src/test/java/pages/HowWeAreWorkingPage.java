package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HowWeAreWorkingPage {

    public void sectionHowWeAreWorking() {
        $(".how-we-work").hover();
        $(".how-we-work").shouldHave(text("КАК МЫ РАБОТАЕМ"));
    }

    public void stepFirst() {
        $(".how-we-work").shouldHave(text("Анализ программного обеспечения и документации (BRD, FSD, User stories)"));
        $(".how-we-work").find(byText("01.")).click();
        $(".information").shouldHave(text("Анализ программного обеспечения и документации (BRD, FSD, User stories)"));
    }

    public void stepSecond() {
        $(".how-we-work").shouldHave(text("Разработка тестовой модели"));
        $(".how-we-work").find(byText("02.")).click();
        $(".information").shouldHave(text("Разработка тестовой модели"));
    }

    public void stepThird() {
        $(".how-we-work").shouldHave(text("Проведение тестирования"));
        $(".how-we-work").find(byText("03.")).click();
        $(".information").shouldHave(text("Проведение тестирования"));
    }

    public void stepFourth() {
        $(".how-we-work").shouldHave(text("Подготовка отчета"));
        $(".how-we-work").find(byText("04.")).click();
        $(".information").shouldHave(text("Подготовка отчета"));
    }
    public void orderServiceForWorking() {
        $(".how-we-work").find(byText("Заказать услугу")).click();
    }
}
