package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IndustriesPage {

    private SelenideElement industrys = $(".industrys");

    public void sectionIndustries() {
        industrys.hover();
        industrys.shouldHave(text("ОТРАСЛИ"));
    }

    public void banksAndFinance() {
        industrys.shouldHave(text("Банковский сектор и Финансы"));
    }

    public void stateStructures() {
        industrys.shouldHave(text("Госструктуры"));
    }

    public void retail() {
        industrys.shouldHave(text("Ритейл"));
    }

    public void telecom() {
        industrys.shouldHave(text("Телеком"));
    }

    public void medicine() {
        industrys.shouldHave(text("Медицина"));
    }

    public void internet() {
        industrys.shouldHave(text("Интернет"));
    }

    public void industry() {
        industrys.shouldHave(text("Промышленность"));
    }

    public void entertainment() {
        industrys.shouldHave(text("Развлечения"));
    }

    public void insurance() {
        industrys.shouldHave(text("Страхование"));
    }

    public void fuelAndEnergyIndustry() {
        industrys.shouldHave(text("Топливно - энергетическая отрасль"));
    }

    public void transportLogistics() {
        industrys.shouldHave(text("Транспорт, логистика"));
    }
}
