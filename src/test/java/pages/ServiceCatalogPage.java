package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ServiceCatalogPage {
    private SelenideElement catalog = $(".catalog");

    public void sectionServiceCatalog(String serviceCatalog) {
        catalog.hover();
        catalog.shouldHave(text(serviceCatalog));
    }

    public void closeTestingOfBusinessProcess(String businessProcess) {
        catalog.find(byText(businessProcess)).click();
    }

    public void openTestingOfBusinessProcess(String businessProcess) {
        catalog.find(byText(businessProcess)).click();
    }

    public void checkOpenTestingOfBusinessProcess(String testingOfBusinessProcess) {
        catalog.shouldHave(text(testingOfBusinessProcess));
    }

    public void openSystemTesting(String systemTesting) {
        catalog.find(byText(systemTesting)).click();
    }

    public void checkOpenSystemTesting(String textSystemTesting) {
        catalog.shouldHave(text(textSystemTesting));
    }

    public void closeSystemTesting(String closeSystemTesting) {
        catalog.find(byText(closeSystemTesting)).click();
    }

    public void openIntegrationTesting(String integrationTesting) {
        catalog.find(byText(integrationTesting)).click();
    }

    public void checkOpenIntegrationTesting(String textInIntegrationTesting) {
        catalog.shouldHave(text(textInIntegrationTesting));
    }

    public void closeIntegrationTesting(String integrationTesting) {
        catalog.find(byText(integrationTesting)).click();
    }

    public void openUserTesting(String userTesting) {
        catalog.find(byText(userTesting)).click();
    }

    public void checkOpenUserTesting(String textUserTesting) {
        catalog.shouldHave(text(textUserTesting));
    }

    public void closeUserTesting(String textUserTesting) {
        catalog.find(byText(textUserTesting)).click();
    }

    public void openAuditAndOptimizationOfTestModel(String auditAndOptimization) {
        catalog.find(byText(auditAndOptimization)).click();
    }

    public void checkOpenAuditAndOptimizationOfTestModel(String textAuditAndOptimization) {
        catalog.shouldHave(text(textAuditAndOptimization));
    }

    public void closeAuditAndOptimizationOfTestModel(String auditAndOptimization) {
        catalog.find(byText(auditAndOptimization)).click();
    }

    public void openTrainingAndEducation(String trainingAndEducation) {
        catalog.find(byText(trainingAndEducation)).click();
    }

    public void checkOpenTrainingAndEducation(String textTrainingAndEducation) {
        catalog.shouldHave(text(textTrainingAndEducation));
    }

    public void closeTrainingAndEducation(String trainingAndEducation) {
        catalog.find(byText(trainingAndEducation)).click();
    }
}