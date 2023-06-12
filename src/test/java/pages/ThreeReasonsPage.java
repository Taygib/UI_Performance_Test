package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ThreeReasonsPage {

    public void sectionThreeReasonsToWorkWithUs() {
        $(".three_reason").hover();
        $(".three_reason").shouldHave(text("3 ПРИЧИНЫ РАБОТАТЬ С НАМИ"));
    }

    public void firstReason() {
        $(".three_reason").shouldHave(text("МЫ СПЕЦИАЛИЗИРУЕМСЯ НА ТЕСТИРОВАНИИ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ"));
    }

    public void secondReason() {
        $(".three_reason").shouldHave(text("ПРЕДМЕТНЫЕ ЗНАНИЯ В РАЗЛИЧНЫХ ОТРАСЛЯХ: БАНКИ, РИТЕЙЛ, ТЕЛЕКОМ"));
    }

    public void thirdReason() {
        $(".three_reason").shouldHave(text("СОВРЕМЕННЫЕ И КЛАССИЧЕСКИЕ ПОДХОДЫ"));
    }
}
