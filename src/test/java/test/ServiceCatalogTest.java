package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ServiceCatalogPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ServiceCatalogTest extends TastBase {
    ServiceCatalogPage catalog = new ServiceCatalogPage();

    @Test
    @Tag("Research")
    @Tag("ServiceCatalog")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка на раскрытие каталогов в разделе КАТАЛОГ УСЛУГ")
    void serviceCatalog() {

        String businessProcess = "СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ";
        String textInBusinessProcess = "Тестирование, позволяющее проверить целостный бизнес-процесс, " +
                "включающий прохождение информационных потоков через ряд интегрированных между собой систем.";
        String systemTesting = "СИСТЕМНОЕ ТЕСТИРОВАНИЕ";
        String textInSystemTesting = "Процесс тестирования системы в целом с целью проверки того, " +
                "что она соответствует установленным требованиям.";
        String integrationTesting = "ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ";
        String textInIntegrationTesting = "Тестирование, выполняемое для обнаружения " +
                "дефектов в интерфейсах и во взаимодействии между интегрированными компонентами или системами.";
        String userTesting = "ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)";
        String textUserTesting = "Приемочное пользовательское тестирование " +
                "(UAT — User Acceptance Testing) – тестирование, которое проводится конечными " +
                "пользователями системы с целью принятия решения о внедрении.";
        String auditAndOptimization = "АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ";
        String textAuditAndOptimization = "Проведение независимой оценки тестовой модели на предмет" +
                " соответствия стандартам, а также предоставление рекомендаций " +
                "для повышения качества данной модели.";
        String trainingAndEducation = "ТРЕНИНГИ И ОБУЧЕНИЕ";
        String textTrainingAndEducation = "«Инвестиции в знания всегда приносят наибольший доход» (Б.Франклин).";

        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Проверка название раздела", () -> {
            catalog.sectionServiceCatalog("КАТАЛОГ УСЛУГ");
        });

        step("СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
            step("Свернуть " + businessProcess, () -> {
                catalog.closeTestingOfBusinessProcess(businessProcess);
            });

            step("Открыть " + businessProcess, () -> {
                catalog.openTestingOfBusinessProcess(businessProcess);
            });

            step("Проверка открытого каталога " + businessProcess, () -> {
                catalog.checkOpenTestingOfBusinessProcess(textInBusinessProcess);
            });
        });

        step("СИСТЕМНОЕ ТЕСТИРОВАНИЕ", () -> {
            step("Открыть " + systemTesting, () -> {
                catalog.openSystemTesting(systemTesting);
            });

            step("Проверка открытого каталога " + systemTesting, () -> {
                catalog.checkOpenSystemTesting(textInSystemTesting);
            });

            step("Свернуть " + systemTesting, () -> {
                catalog.closeSystemTesting(systemTesting);
            });
        });

        step("ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ", () -> {
            step("Открыть вкладку " + integrationTesting, () -> {
                catalog.openIntegrationTesting(integrationTesting);
            });

            step("Проверка открытого каталога " + integrationTesting, () -> {
                catalog.checkOpenIntegrationTesting(textInIntegrationTesting);
            });

            step("Свернуть вкладку " + integrationTesting, () -> {
                catalog.closeIntegrationTesting(integrationTesting);
            });
        });

        step("ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
            step("Открыть " + userTesting, () -> {
                catalog.openUserTesting(userTesting);
            });

            step("Проверка открытого каталога " + textUserTesting, () -> {
                catalog.checkOpenUserTesting(textUserTesting);
            });


            step("Свернуть " + userTesting, () -> {
                catalog.closeUserTesting(userTesting);
            });
        });

        step("АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ", () -> {
            step("Открыть " + auditAndOptimization, () -> {
                catalog.openAuditAndOptimizationOfTestModel(auditAndOptimization);
            });

            step("Проверка открытого каталога " + auditAndOptimization, () -> {
                catalog.checkOpenAuditAndOptimizationOfTestModel(textAuditAndOptimization);
            });

            step("Свернуть " + auditAndOptimization, () -> {
                catalog.closeAuditAndOptimizationOfTestModel(auditAndOptimization);
            });
        });

        step("ТРЕНИНГИ И ОБУЧЕНИЕ", () -> {
            step("Открыть " + trainingAndEducation, () -> {
                catalog.openTrainingAndEducation(trainingAndEducation);
            });

            step("Проверка открытого каталога " + trainingAndEducation, () -> {
                catalog.checkOpenTrainingAndEducation(textTrainingAndEducation);
            });

            step("Свернуть " + trainingAndEducation, () -> {
                catalog.closeTrainingAndEducation(trainingAndEducation);
            });
        });
    }
}