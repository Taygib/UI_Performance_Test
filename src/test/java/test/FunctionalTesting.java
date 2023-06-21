package test;

import com.codeborne.selenide.Selenide;
import data.ContainMenu;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class FunctionalTesting extends TastBase {

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String company = faker.company().name();

    static Stream<Arguments> menuContain() {
        return Stream.of(
                Arguments.of(ContainMenu.SERVICESANDPRODUCTS, List.of(
                        "Тестирование", "Консалтинг", "Продукты")),
                Arguments.of(ContainMenu.VACANCIES, List.of(
                        "Карьера в Перфоманс Лаб", "Почему к нам приходят", "Развитие в компании"))
        );
    }

    @MethodSource
    @ParameterizedTest
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void menuContain(ContainMenu menuSection, List<String> expectedButtons) {

        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });
        step("Название загаловков в подменю", () -> {
        menuContainPage.parameterMenu(menuSection.toString(), expectedButtons);
        });
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void firstThreeButtonsOrderService() {

        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });
        step("Заказать услугу в правом верхнем углу", () -> {
            orderService.clickOnOrderServiceInTheUpperRightCorner();
            orderService.titleСheck();

            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });

        step(" под названием Функциональное тестирование нажать кнопку Заказать услугу", () -> {

            step("Проверка на наличие текста", () -> {
                $(".col-12").shouldHave(text("Функциональное тестирование"));
                $(".col-12").shouldHave(text("Сделайте шаг навстречу качеству"));
            });


            orderService.clickOnOrderServiceButtonCalledFunctionalTesting();
            orderService.titleСheck();

            step("удаление заполненных полей", () -> {
                deleteForm.clearSpace();
            });

            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });

        step("Под названием =Перфоманс лаб - это= заказать услугу", () -> {

            $(".inf").shouldHave(text("перфоманс лаб - это"));

            orderService.clickOnOrderServiceButtonCalledPerformanceLabIs();
            orderService.titleСheck();

            step("удаление заполненных полей", () -> {
                deleteForm.clearSpace();
            });

            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void ourClients() {

        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела НАШИ КЛИЕНТЫ", () -> {
            clients.sectionOurClients();
        });

        step("Переход в раздел Посмотреть всех клиентов ", () -> {
            clients.clickOnClients();
        });

        step("Как помогает Перфоманс Лаб", () -> {
            clients.howPerformanceLabHelp();
        });

        step("Переход в раздел кейсы", () -> {
            clients.clickOnReadCases();
        });

        Selenide.back();

        step("Проверка контактной информации", () -> {
            clients.checkContactInformation();
        });

        step("Проверка доп. информацийй и услуг", () -> {
            clients.checkAddInformationAndServices();
        });

        Selenide.back();

        step("Получить предложение", () -> {
            clients.orderService();

            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });

        Selenide.back();
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void whatWeAreTesting() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела ЧТО МЫ ТЕСТИРУЕМ", () -> {
            whatWeTesting.sectionWhatWeAreTesting();
        });

        step("Переход на раздел Тестирование сайтов", () -> {
            whatWeTesting.testingWebsite();
        });

        switchTo().window(0);

        step("Переход на раздел Тестирование IT-систем", () -> {
            whatWeTesting.testingITSystems();
        });

        step("Переход на раздел ИГРЫ", () -> {
            whatWeTesting.testingGames();

            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });

        step("Переход на раздел Тестирование мобильных приложений", () -> {
            whatWeTesting.testingMobileApps();
        });

        Selenide.back();

        step("Переход на раздел УМНЫЕ УСТРОЙСТВА, VR, AR", () -> {
            whatWeTesting.testingDevices();

            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });

        step("Заказать услугу", () -> {
            whatWeTesting.orderServiceForTesting();
            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.TRIVIAL)
    void threeReasonsToWorkWithUs() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела 3 ПРИЧИНЫ РАБОТАТЬ С НАМИ", () -> {
            threeReasons.sectionThreeReasonsToWorkWithUs();
        });

        step("Первая причина", () -> {
            threeReasons.firstReason();
        });

        step("Вторая причина", () -> {
            threeReasons.secondReason();
        });

        step("Третья причина", () -> {
            threeReasons.thirdReason();
        });
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void serviceCatalog() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела КАТАЛОГ УСЛУГ", () -> {
            catalog.sectionServiceCatalog();
        });

        step("СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
            step("Свернуть раздел СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
                catalog.closeTestingOfBusinessProcess();
            });

            step("Открыть раздел СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
                catalog.openTestingOfBusinessProcess();
            });

            step("Проверить текст в разделе СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
                catalog.checkTextTestingOfBusinessProcess();
            });

            step("Заказать услугу в разделе СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
                step("Заказать услугу", () -> {
                    catalog.clickOnOrderService();
                });

                step("Имя", () -> {
                    order.writeName(firstName);
                });

                step("Фамилия", () -> {
                    order.writeSurname(lastName);
                });

                step("Email", () -> {
                    order.writeEmail(email);
                });

                step("Телефон", () -> {
                    order.writeTelephone("7777777777");
                });

                step("Название компании", () -> {
                    order.writeCompany(company);
                });

                step("Сообщение", () -> {
                    order.writeMessage("FunctionalTest");
                });

                step("Навести курсор на кнопку отправить", () -> {
                    order.hoverToSend();
                });

                step("Закрыть окно заказа услуг", () -> {
                    order.closeContainer();
                });
            });
        });

        step("СИСТЕМНОЕ ТЕСТИРОВАНИЕ", () -> {
            step("Открыть раздел СИСТЕМНОЕ ТЕСТИРОВАНИЕ", () -> {
                catalog.openSystemTesting();
            });

            step("Проверить текст в разделе СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
                catalog.checkTextSystemTesting();
            });

            step("Заказать услугу в разделе СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ", () -> {
                step("Заказать услугу", () -> {
                    catalog.clickOnOrderService();
                });

                step("Имя", () -> {
                    order.writeName(firstName);
                });

                step("Фамилия", () -> {
                    order.writeSurname(lastName);
                });

                step("Email", () -> {
                    order.writeEmail(email);
                });

                step("Телефон", () -> {
                    order.writeTelephone("7777777777");
                });

                step("Название компании", () -> {
                    order.writeCompany(company);
                });

                step("Сообщение", () -> {
                    order.writeMessage("FunctionalTest");
                });

                step("Навести курсор на кнопку отправить", () -> {
                    order.hoverToSend();
                });

                step("Закрыть окно заказа услуг", () -> {
                    order.closeContainer();
                });
            });

            step("Свернуть раздел СИСТЕМНОЕ ТЕСТИРОВАНИЕ", () -> {
                catalog.closeSystemTesting();
            });
        });

        step("ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ", () -> {
            step("Открыть раздел ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ", () -> {
                catalog.openIntegrationTesting();
            });

            step("Проверить текст в разделе ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ", () -> {
                catalog.checkTextIntegrationTesting();
            });

            step("Заказать услугу в разделе ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ", () -> {
                step("Заказать услугу", () -> {
                    catalog.clickOnOrderService();
                });
                step("Имя", () -> {
                    order.writeName(firstName);
                });

                step("Фамилия", () -> {
                    order.writeSurname(lastName);
                });

                step("Email", () -> {
                    order.writeEmail(email);
                });

                step("Телефон", () -> {
                    order.writeTelephone("7777777777");
                });

                step("Название компании", () -> {
                    order.writeCompany(company);
                });

                step("Сообщение", () -> {
                    order.writeMessage("FunctionalTest");
                });

                step("Навести курсор на кнопку отправить", () -> {
                    order.hoverToSend();
                });

                step("Закрыть окно заказа услуг", () -> {
                    order.closeContainer();
                });
            });

            step("Свернуть раздел ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ", () -> {
                catalog.closeIntegrationTesting();
            });
        });

        step("ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
            step("Открыть раздел ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                catalog.openUserTesting();
            });

            step("Проверить текст в разделе ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                catalog.checkTextUserTesting();
            });

            step("Заказать услугу в разделе ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                step("Заказать услугу", () -> {
                    catalog.clickOnOrderService();
                });

                step("Имя", () -> {
                    order.writeName(firstName);
                });

                step("Фамилия", () -> {
                    order.writeSurname(lastName);
                });

                step("Email", () -> {
                    order.writeEmail(email);
                });

                step("Телефон", () -> {
                    order.writeTelephone("7777777777");
                });

                step("Название компании", () -> {
                    order.writeCompany(company);
                });

                step("Сообщение", () -> {
                    order.writeMessage("FunctionalTest");
                });

                step("Навести курсор на кнопку отправить", () -> {
                    order.hoverToSend();
                });

                step("Закрыть окно заказа услуг", () -> {
                    order.closeContainer();
                });
            });

            step("Свернуть раздел ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                catalog.closeUserTesting();
            });
        });

        step("АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ", () -> {
            step("Открыть раздел АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ", () -> {
                catalog.openAuditAndOptimizationOfTestModel();
            });

            step("Проверить текст в разделе АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ", () -> {
                catalog.checkTextAuditAndOptimizationOfTestModel();
            });

            step("Заказать услугу в разделе ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                step("Заказать услугу", () -> {
                    catalog.clickOnOrderService();
                });
                step("Имя", () -> {
                    order.writeName(firstName);
                });

                step("Фамилия", () -> {
                    order.writeSurname(lastName);
                });

                step("Email", () -> {
                    order.writeEmail(email);
                });

                step("Телефон", () -> {
                    order.writeTelephone("7777777777");
                });

                step("Название компании", () -> {
                    order.writeCompany(company);
                });

                step("Сообщение", () -> {
                    order.writeMessage("FunctionalTest");
                });

                step("Навести курсор на кнопку отправить", () -> {
                    order.hoverToSend();
                });

                step("Закрыть окно заказа услуг", () -> {
                    order.closeContainer();
                });
            });

            step("Свернуть раздел ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                catalog.closeAuditAndOptimizationOfTestModel();
            });
        });

        step("ТРЕНИНГИ И ОБУЧЕНИЕ", () -> {
            step("Закрыть окно заказа услуг", () -> {
                catalog.openTrainingAndEducation();
            });

            step("Проверить текст в разделе ТРЕНИНГИ И ОБУЧЕНИЕ", () -> {
                catalog.checkTextTrainingAndEducation();
            });

            step("Заказать услугу в разделе ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                step("Заказать услугу", () -> {
                    catalog.clickOnOrderService();
                });

                step("Имя", () -> {
                    order.writeName(firstName);
                });

                step("Фамилия", () -> {
                    order.writeSurname(lastName);
                });

                step("Email", () -> {
                    order.writeEmail(email);
                });

                step("Телефон", () -> {
                    order.writeTelephone("7777777777");
                });

                step("Название компании", () -> {
                    order.writeCompany(company);
                });

                step("Сообщение", () -> {
                    order.writeMessage("FunctionalTest");
                });

                step("Навести курсор на кнопку отправить", () -> {
                    order.hoverToSend();
                });

                step("Закрыть окно заказа услуг", () -> {
                    order.closeContainer();
                });
            });

            step("Свернуть раздел ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                catalog.closeTrainingAndEducation();
            });
        });
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void howWeAreWorking() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела КАК МЫ РАБОТАЕМ", () -> {
            HowWorking.sectionHowWeAreWorking();
        });

        step("Шаг первый Анализ программного обеспечения и документации", () -> {
            HowWorking.stepFirst();
        });

        step("Шаг второй Разработка тестовой модели", () -> {
            HowWorking.stepSecond();
        });

        step("Шаг третий Проведение тестирования", () -> {
            HowWorking.stepThird();
        });

        step("Шаг четвертый Подготовка отчета", () -> {
            HowWorking.stepFourth();
        });

        step("Заказать услугу", () -> {
            step("Нажать на кнопку Заказать услугу", () -> {
                HowWorking.orderServiceForWorking();
            });

            step("Имя", () -> {
                order.writeName(firstName);
            });

            step("Фамилия", () -> {
                order.writeSurname(lastName);
            });

            step("Email", () -> {
                order.writeEmail(email);
            });

            step("Телефон", () -> {
                order.writeTelephone("7777777777");
            });

            step("Название компании", () -> {
                order.writeCompany(company);
            });

            step("Сообщение", () -> {
                order.writeMessage("FunctionalTest");
            });

            step("Навести курсор на кнопку отправить", () -> {
                order.hoverToSend();
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.TRIVIAL)
    void industries() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела ОТРАСЛИ", () -> {
            industries.sectionIndustries();
        });

        step("Название отраслей", () -> {
            step("Банковский сектор и Финансы", () -> {
                industries.banksAndFinance();
            });

            step("Госструктуры", () -> {
                industries.stateStructures();
            });

            step("Ритейл", () -> {
                industries.retail();
            });

            step("Телеком", () -> {
                industries.telecom();
            });

            step("Медицина", () -> {
                industries.medicine();
            });

            step("Интернет", () -> {
                industries.internet();
            });

            step("Интернет", () -> {
                industries.industry();
            });

            step("Развлечения", () -> {
                industries.entertainment();
            });

            step("Страхование", () -> {
                industries.insurance();
            });

            step("Топливно - энергетическая отрасль", () -> {
                industries.fuelAndEnergyIndustry();
            });

            step("Транспорт, логистика", () -> {
                industries.transportLogistics();
            });
        });
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void examplesOfProjects() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела ПРИМЕРЫ ПРОЕКТОВ", () -> {
            examples.sectionExamplesOfProjects();
        });

        step("Проверка наличие надписи Посмотреть всех клиентов", () -> {
            examples.viewAllClients();
        });

        step("Кликнуть на предыдущий слайд", () -> {
            examples.clickPrevSlide();
        });

        step("Переход ко всем клиентам", () -> {
            examples.clickOnViewAllClients();
        });

        Selenide.back();

        step("Кликнуть на следующий слайд", () -> {
            examples.clickNextSlide();
        });

        step("Переход ко всем клиентам", () -> {
            examples.clickOnViewAllClients();
        });

        Selenide.back();

        step("Клик по левому индикатору", () -> {
            examples.clickOnLeftIndicator();
        });

        step("Переход ко всем клиентам", () -> {
            examples.clickOnViewAllClients();
        });

        Selenide.back();

        step("Клик по правому индикатору", () -> {
            examples.clickOnRightIndicator();
        });

        step("Переход ко всем клиентам", () -> {
            examples.clickOnViewAllClients();
        });

        Selenide.back();
    }

    @Test
    @Tag("Search")
    @Owner("Taygib")
    @Severity(SeverityLevel.BLOCKER)
    void clientsAboutUs() {
        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });

        step("Название раздела КЛИЕНТЫ О НАС", () -> {
            clientsAboutUs.sectionClientsAboutUs();
        });

        step("Открыть X5 Retail Group", () -> {
            clientsAboutUs.clickOnX5RetailGroup();

            step("Закрыть клиента", () -> {
                clientsAboutUs.close();
            });

            step("Пролистать в право пять раз", () -> {
                clientsAboutUs.clickRightFiveTimes();
            });

            step("Пролистать в лево пять раз", () -> {
                clientsAboutUs.clickLeftFiveTimes();
            });
        });

        step("Закрыть ", () -> {
            clientsAboutUs.closeClient();
        });

        step("Открыть ДИТ Омск", () -> {
            clientsAboutUs.clickOnDitOmsk();

            step("Закрыть клиента", () -> {
                clientsAboutUs.close();
            });

            step("Пролистать в право пять раз", () -> {
                clientsAboutUs.clickRightFiveTimes();
            });

            step("Пролистать в лево пять раз", () -> {
                clientsAboutUs.clickLeftFiveTimes();
            });
        });

        step("Закрыть", () -> {
            clientsAboutUs.closeClient();
        });

        step("Открыть Рольф", () -> {
            clientsAboutUs.clickOnRolf();

            step("Закрыть клиента", () -> {
                clientsAboutUs.close();
            });

            step("Пролистать в право пять раз", () -> {
                clientsAboutUs.clickRightFiveTimes();
            });

            step("Пролистать в лево пять раз", () -> {
                clientsAboutUs.clickLeftFiveTimes();
            });
        });

        step("Закрыть", () -> {
            clientsAboutUs.closeClient();
        });

        step("Открыть Ростелеком", () -> {
            clientsAboutUs.clickOnRostelekom();

            step("Закрыть клиента", () -> {
                clientsAboutUs.close();
            });

            step("Пролистать в право пять раз", () -> {
                clientsAboutUs.clickRightFiveTimes();
            });

            step("Пролистать в лево пять раз", () -> {
                clientsAboutUs.clickLeftFiveTimes();
            });
        });

        step("Закрыть", () -> {
            clientsAboutUs.closeClient();
        });

        step("Открыть ВТБ24", () -> {
            clientsAboutUs.clickOnVTB24();

            step("Закрыть клиента", () -> {
                clientsAboutUs.close();
            });

            step("Пролистать в право пять раз", () -> {
                clientsAboutUs.clickRightFiveTimes();
            });

            step("Пролистать в лево пять раз", () -> {
                clientsAboutUs.clickLeftFiveTimes();
            });
        });

        step("Закрыть", () -> {
            clientsAboutUs.closeClient();
        });

        step("Открыть Witology", () -> {
            clientsAboutUs.clickOnWitology();

            step("Закрыть клиента", () -> {
                clientsAboutUs.close();
            });

            step("Пролистать в право пять раз", () -> {
                clientsAboutUs.clickRightFiveTimes();
            });

            step("Пролистать в лево пять раз", () -> {
                clientsAboutUs.clickLeftFiveTimes();
            });
        });

        step("Закрыть", () -> {
            clientsAboutUs.closeClient();
        });
    }
}