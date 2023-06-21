package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ThreeReasonsPage {
    private SelenideElement threeReason = $(".three_reason");

    public void sectionThreeReasonsToWorkWithUs() {
        threeReason.hover();
        threeReason.shouldHave(text("3 ПРИЧИНЫ РАБОТАТЬ С НАМИ"));
    }

    public void firstReason() {
        threeReason.shouldHave(text("МЫ СПЕЦИАЛИЗИРУЕМСЯ НА ТЕСТИРОВАНИИ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ"));
    }

    public void secondReason() {
        threeReason.shouldHave(text("ПРЕДМЕТНЫЕ ЗНАНИЯ В РАЗЛИЧНЫХ ОТРАСЛЯХ: БАНКИ, РИТЕЙЛ, ТЕЛЕКОМ"));
    }

    public void thirdReason() {
        threeReason.shouldHave(text("СОВРЕМЕННЫЕ И КЛАССИЧЕСКИЕ ПОДХОДЫ"));
    }
}