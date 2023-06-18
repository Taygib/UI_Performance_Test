package test;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class FunctionalTesting extends TastBase {

    @Test
    @Tag("Search")
    void menuContain() { // параметризованный тест


    }

    @Test
    void firstThreeButtonsOrderService() { // заказать услугу кнопка

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

        step("Заказать услугу в правом верхнем углу", () -> {
            orderService.clickOnOrderServiceInTheUpperRightCorner();
            orderService.titleСheck();

            step("Имя", () -> {
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });
        });

        step(" под названием Функциональное тестирование нажать кнопку Заказать услугу", () -> {

            $(".col-12").shouldHave(text("Функциональное тестирование"));
            $(".col-12").shouldHave(text("Сделайте шаг навстречу качеству"));

            orderService.clickOnOrderServiceButtonCalledFunctionalTesting();
            orderService.titleСheck();

            step("удаление заполненных полей", () -> {
                deleteForm.clearSpace();
            });

            step("Имя", () -> {
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });
        });

        step("Заказать услугу под названием Перфоманс лаб - это", () -> {

            $(".inf").shouldHave(text("перфоманс лаб - это"));

            orderService.clickOnOrderServiceButtonCalledPerformanceLabIs();
            orderService.titleСheck();

            step("удаление заполненных полей", () -> {
                deleteForm.clearSpace();
            });

            step("Имя", () -> {
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });
        });

        sleep(2000);
    }

    @Test
    void ourClients() {  //наши клиенты

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

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
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });

        });

        Selenide.back();

        sleep(4000);
    }

    @Test
    void whatWeAreTesting() {  //что мы тестируем
        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");


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
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });
        });

        step("Переход на раздел Тестирование мобильных приложений", () -> {
            whatWeTesting.testingMobileApps();
        });
        Selenide.back();


        step("Переход на раздел УМНЫЕ УСТРОЙСТВА, VR, AR", () -> {
            whatWeTesting.testingDevices();

            step("Имя", () -> {
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });
        });

        step("Заказать услугу", () -> {
            whatWeTesting.orderServiceForTesting();

            step("Имя", () -> {
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });
        });

        sleep(2000);

    }

    @Test
    void threeReasonsToWorkWithUs() { // три причины работать с нами

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

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
    void serviceCatalog() { // каталог услуг
        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

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
                    orderService.writeName();
                });
                step("Фамилия", () -> {
                    orderService.writeSurname();
                });
                step("Email", () -> {
                    orderService.writeEmail();
                });
                step("Телефон", () -> {
                    orderService.writeTelephone();
                });
                step("Название компании", () -> {
                    orderService.writeCompany();
                });
                step("Сообщение", () -> {
                    orderService.writeMessage();
                });
                step("Навести курсор на кнопку отправить", () -> {
                    orderService.hoverToSend();
                });
                step("Закрыть окно заказа услуг", () -> {
                    orderService.closeContainer();
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
                    orderService.writeName();
                });
                step("Фамилия", () -> {
                    orderService.writeSurname();
                });
                step("Email", () -> {
                    orderService.writeEmail();
                });
                step("Телефон", () -> {
                    orderService.writeTelephone();
                });
                step("Название компании", () -> {
                    orderService.writeCompany();
                });
                step("Сообщение", () -> {
                    orderService.writeMessage();
                });
                step("Навести курсор на кнопку отправить", () -> {
                    orderService.hoverToSend();
                });
                step("Закрыть окно заказа услуг", () -> {
                    orderService.closeContainer();
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
                    orderService.writeName();
                });
                step("Фамилия", () -> {
                    orderService.writeSurname();
                });
                step("Email", () -> {
                    orderService.writeEmail();
                });
                step("Телефон", () -> {
                    orderService.writeTelephone();
                });
                step("Название компании", () -> {
                    orderService.writeCompany();
                });
                step("Сообщение", () -> {
                    orderService.writeMessage();
                });
                step("Навести курсор на кнопку отправить", () -> {
                    orderService.hoverToSend();
                });
                step("Закрыть окно заказа услуг", () -> {
                    orderService.closeContainer();
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
                    orderService.writeName();
                });
                step("Фамилия", () -> {
                    orderService.writeSurname();
                });
                step("Email", () -> {
                    orderService.writeEmail();
                });
                step("Телефон", () -> {
                    orderService.writeTelephone();
                });
                step("Название компании", () -> {
                    orderService.writeCompany();
                });
                step("Сообщение", () -> {
                    orderService.writeMessage();
                });
                step("Навести курсор на кнопку отправить", () -> {
                    orderService.hoverToSend();
                });
                step("Закрыть окно заказа услуг", () -> {
                    orderService.closeContainer();
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
                    orderService.writeName();
                });
                step("Фамилия", () -> {
                    orderService.writeSurname();
                });
                step("Email", () -> {
                    orderService.writeEmail();
                });
                step("Телефон", () -> {
                    orderService.writeTelephone();
                });
                step("Название компании", () -> {
                    orderService.writeCompany();
                });
                step("Сообщение", () -> {
                    orderService.writeMessage();
                });
                step("Навести курсор на кнопку отправить", () -> {
                    orderService.hoverToSend();
                });
                step("Закрыть окно заказа услуг", () -> {
                    orderService.closeContainer();
                });
            });
            step("Свернуть раздел ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)", () -> {
                catalog.closeAuditAndOptimizationOfTestModel();
            });
        });


    ////////-----------------////////----------------------////////-----------------////////-----------////////----

        //открыть ТРЕНИНГИ И ОБУЧЕНИЕ
        $(".catalog").find(byText("ТРЕНИНГИ И ОБУЧЕНИЕ")).click();
        //проверка
        $(".catalog").shouldHave(text("«Инвестиции в знания всегда приносят наибольший доход» (Б.Франклин)."));

        //нажать на кнопку Заказать услугу
        $(byAttribute("title", "Заказать услугу")).click();

        //заполниьт бланк и закрыть
        $(".premium-modal-box-close-button-container").click();

        //закрыть АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ
        $(".catalog").find(byText("ТРЕНИНГИ И ОБУЧЕНИЕ")).click();
        ////////-----------------////////----------------------////////-----------------////////-----------////////----

        sleep(2000);

    }

    @Test
    void howWeAreWorking() { // как мы работаем

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

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

        step("Нажать на кнопку Заказать услугу", () -> {
            HowWorking.orderServiceForWorking();

            step("Имя", () -> {
                orderService.writeName();
            });
            step("Фамилия", () -> {
                orderService.writeSurname();
            });
            step("Email", () -> {
                orderService.writeEmail();
            });
            step("Телефон", () -> {
                orderService.writeTelephone();
            });
            step("Название компании", () -> {
                orderService.writeCompany();
            });
            step("Сообщение", () -> {
                orderService.writeMessage();
            });
            step("Навести курсор на кнопку отправить", () -> {
                orderService.hoverToSend();
            });
            step("Закрыть окно заказа услуг", () -> {
                orderService.closeContainer();
            });

        });

        sleep(3000);

    }

    @Test
    void industries() { // отрасли

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

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
    void examplesOfProjects() { // примеры проектов

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");


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

        sleep(500);

    }

    @Test
    void clientsAboutUs() {

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");


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

        sleep(1000);

    }
}
