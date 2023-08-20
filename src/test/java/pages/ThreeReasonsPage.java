package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ThreeReasonsPage {
    private SelenideElement threeReason = $(".three_reason");

    public void sectionThreeReasonsToWorkWithUs(String threeReasons) {
        threeReason.hover();
        threeReason.shouldHave(text(threeReasons));
    }

    public void checkFirstReason(String firstReason) {
        threeReason.shouldHave(text(firstReason));
    }

    public void checkSecondReason(String secondReason) {
        threeReason.shouldHave(text(secondReason));
    }

    public void checkThirdReason(String thirdReason) {
        threeReason.shouldHave(text(thirdReason));
    }
}