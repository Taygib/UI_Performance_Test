package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HowWeAreWorkingPage {
    private SelenideElement howWeWork = $(".how-we-work"),
            information = $(".information");

    public void sectionHowWeAreWorking(String howWeAreWorking) {
        howWeWork.hover();
        howWeWork.shouldHave(text(howWeAreWorking));
    }

    public void stepFirst(String nameFirstStep, String firstStep) {
        howWeWork.shouldHave(text(nameFirstStep));
        howWeWork.find(byText(firstStep)).click();
        information.shouldHave(text(nameFirstStep));
    }

    public void stepSecond(String nameSecondStep, String secondStep) {
        howWeWork.shouldHave(text(nameSecondStep));
        howWeWork.find(byText(secondStep)).click();
        information.shouldHave(text(nameSecondStep));
    }

    public void stepThird(String nameThirdStep, String thirdStep) {
        howWeWork.shouldHave(text(nameThirdStep));
        howWeWork.find(byText(thirdStep)).click();
        information.shouldHave(text(nameThirdStep));
    }

    public void stepFourth(String nameFourthStep, String fourthStep) {
        howWeWork.shouldHave(text(nameFourthStep));
        howWeWork.find(byText(fourthStep)).click();
        information.shouldHave(text(nameFourthStep));
    }
}