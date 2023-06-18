package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ServiceCatalogPage {

    public void sectionServiceCatalog() {
        $(".catalog").hover();
        $(".catalog").shouldHave(text("КАТАЛОГ УСЛУГ"));
    }

    public void closeTestingOfBusinessProcess() {
        $(".catalog").find(byText("СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ")).click();
    }

    public void openTestingOfBusinessProcess() {
        $(".catalog").find(byText("СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ")).click();
    }

    public void checkTextTestingOfBusinessProcess() {
        $(".catalog").shouldHave(text("Тестирование, позволяющее проверить целостный бизнес-процесс," +
                " включающий прохождение информационных потоков через ряд интегрированных между собой систем."));
    }

    public void clickOnOrderService() {
        $(byAttribute("title", "Заказать услугу")).click();
    }

    public void openSystemTesting() {
        $(".catalog").find(byText("СИСТЕМНОЕ ТЕСТИРОВАНИЕ")).click();
    }

    public void checkTextSystemTesting() {
        $(".catalog").shouldHave(text("Процесс тестирования системы в целом с целью проверки того," +
                " что она соответствует установленным требованиям."));
    }

    public void closeSystemTesting() {
        $(".catalog").find(byText("СИСТЕМНОЕ ТЕСТИРОВАНИЕ")).click();
    }

    public void openIntegrationTesting() {
        $(".catalog").find(byText("ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ")).click();
    }

    public void checkTextIntegrationTesting() {
        $(".catalog").shouldHave(text("Тестирование, выполняемое для обнаружения дефектов в интерфейсах " +
                "и во взаимодействии между интегрированными компонентами или системами."));
    }

    public void closeIntegrationTesting() {
        $(".catalog").find(byText("СИСТЕМНОЕ ТЕСТИРОВАНИЕ")).click();
    }

    public void openUserTesting() {
        $(".catalog").find(byText("ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)")).click();
    }

    public void checkTextUserTesting() {
        $(".catalog").shouldHave(text("Приемочное пользовательское тестирование " +
                "(UAT — User Acceptance Testing) – тестирование, которое проводится конечными пользователями системы " +
                "с целью принятия решения о внедрении."));
    }

    public void closeUserTesting() {
        $(".catalog").find(byText("ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)")).click();
    }

    public void openAuditAndOptimizationOfTestModel() {
        $(".catalog").find(byText("АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ")).click();
    }

    public void checkTextAuditAndOptimizationOfTestModel() {
        $(".catalog").shouldHave(text("Проведение независимой оценки тестовой модели на предмет" +
                " соответствия стандартам, а также предоставление рекомендаций для повышения качества данной модели."));
    }

    public void closeAuditAndOptimizationOfTestModel() {
        $(".catalog").find(byText("АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ")).click();
    }

}
