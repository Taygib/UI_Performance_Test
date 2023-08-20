package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IndustriesPage {

    private SelenideElement industrys = $(".industrys");

    public void sectionIndustries(String industries) {
        industrys.hover();
        industrys.shouldHave(text(industries));
    }

    public void banksAndFinance(String banksFinance) {
        industrys.shouldHave(text(banksFinance));
    }

    public void stateStructures(String structures) {
        industrys.shouldHave(text(structures));
    }

    public void retail(String retail) {
        industrys.shouldHave(text(retail));
    }

    public void telecom(String telecom) {
        industrys.shouldHave(text(telecom));
    }

    public void medicine(String medicine) {
        industrys.shouldHave(text(medicine));
    }

    public void internet(String internet) {
        industrys.shouldHave(text(internet));
    }

    public void industry(String industry) {
        industrys.shouldHave(text(industry));
    }

    public void entertainment(String entertainment) {
        industrys.shouldHave(text(entertainment));
    }

    public void insurance(String insurance) {
        industrys.shouldHave(text(insurance));
    }

    public void fuelAndEnergyIndustry(String fuel) {
        industrys.shouldHave(text(fuel));
    }

    public void transportLogistics(String transport) {
        industrys.shouldHave(text(transport));
    }
}