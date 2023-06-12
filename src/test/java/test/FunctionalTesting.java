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

        $(".catalog").hover();
        $(".catalog").shouldHave(text("КАТАЛОГ УСЛУГ"));

        ////////-----------------////////----------------------////////-----------------////////-----------////////----
        //закрыть
        $(".catalog").find(byText("СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ")).click();

        //открыть
        $(".catalog").find(byText("СКВОЗНОЕ ТЕСТИРОВАНИЕ БИЗНЕС-ПРОЦЕССОВ")).click();

        //проверка
        $(".catalog").shouldHave(text("Тестирование, позволяющее проверить целостный бизнес-процесс," +
                " включающий прохождение информационных потоков через ряд интегрированных между собой систем."));

        //нажать на кнопку Заказать услугу
        $(byAttribute("title", "Заказать услугу")).click();

        //заполниьт бланк
        $(".premium-modal-box-close-button-container").click();

        ////////-----------------////////----------------------////////-----------------////////-----------////////----
        //открыть СИСТЕМНОЕ ТЕСТИРОВАНИЕ
        $(".catalog").find(byText("СИСТЕМНОЕ ТЕСТИРОВАНИЕ")).click();
        //проверка
        $(".catalog").shouldHave(text("Процесс тестирования системы в целом с целью проверки того," +
                " что она соответствует установленным требованиям."));

        //нажать на кнопку Заказать услугу
        $(byAttribute("title", "Заказать услугу")).click();

        //заполниьт бланк
        $(".premium-modal-box-close-button-container").click();

        //закрыть СИСТЕМНОЕ ТЕСТИРОВАНИЕ
        $(".catalog").find(byText("СИСТЕМНОЕ ТЕСТИРОВАНИЕ")).click();

        ////////-----------------////////----------------------////////-----------------////////-----------////////----
        //открыть ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ
        $(".catalog").find(byText("ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ")).click();
        //проверка
        $(".catalog").shouldHave(text("Тестирование, выполняемое для обнаружения дефектов в интерфейсах " +
                "и во взаимодействии между интегрированными компонентами или системами."));

        //нажать на кнопку Заказать услугу
        $(byAttribute("title", "Заказать услугу")).click();

        //заполниьт бланк
        $(".premium-modal-box-close-button-container").click();

        //закрыть ИНТЕГРАЦИОННОЕ ТЕСТИРОВАНИЕ
        $(".catalog").find(byText("СИСТЕМНОЕ ТЕСТИРОВАНИЕ")).click();
        ////////-----------------////////----------------------////////-----------------////////-----------////////----

        //открыть ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)
        $(".catalog").find(byText("ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)")).click();
        //проверка
        $(".catalog").shouldHave(text("Приемочное пользовательское тестирование " +
                "(UAT — User Acceptance Testing) – тестирование, которое проводится конечными пользователями системы " +
                "с целью принятия решения о внедрении."));

        //нажать на кнопку Заказать услугу
        $(byAttribute("title", "Заказать услугу")).click();

        //заполниьт бланк и закрыть
        $(".premium-modal-box-close-button-container").click();

        //закрыть ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)
        $(".catalog").find(byText("ПОЛЬЗОВАТЕЛЬСКОЕ ТЕСТИРОВАНИЕ (UAT)")).click();
        ////////-----------------////////----------------------////////-----------------////////-----------////////----

        //открыть АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ
        $(".catalog").find(byText("АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ")).click();
        //проверка
        $(".catalog").shouldHave(text("Проведение независимой оценки тестовой модели на предмет" +
                " соответствия стандартам, а также предоставление рекомендаций для повышения качества данной модели."));

        //нажать на кнопку Заказать услугу
        $(byAttribute("title", "Заказать услугу")).click();

        //заполниьт бланк и закрыть
        $(".premium-modal-box-close-button-container").click();

        //закрыть АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ
        $(".catalog").find(byText("АУДИТ И ОПТИМИЗАЦИЯ ТЕСТОВОЙ МОДЕЛИ")).click();
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

        sleep(3000);

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
        $("#projects-examples").hover();
        $("#projects-examples").shouldHave(text("ПРИМЕРЫ ПРОЕКТОВ"));


        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $("#projects-examples").$(".carousel-control-prev").click();

        $("#projects-examples").$("#projects-carousel").find(byText("Посмотреть всех клиентов")).click();
        Selenide.back();


        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $("#projects-examples").$(".carousel-control-next").click();

        $("#projects-examples").$("#projects-carousel").find(byText("Посмотреть всех клиентов")).click();
        Selenide.back();


        $(".ee-carousel-indicators").hover();
        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $(byAttribute("data-slide-to", "0")).click();

        $("#projects-examples").$("#projects-carousel").find(byText("Посмотреть всех клиентов")).click();
        Selenide.back();

        $("#projects-examples").$("#projects-carousel").shouldHave(text("Посмотреть всех клиентов"));
        $(byAttribute("data-slide-to", "1")).click();


        $("#projects-examples").$("#projects-carousel").find(byText("Посмотреть всех клиентов")).click();
        Selenide.back();

        sleep(500);

    }

    @Test
    void clientsAboutUs() {

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");
        $(".clients-about").hover();
        $(".clients-about").shouldHave(text("КЛИЕНТЫ О НАС"));


        $(".clients-about").$(byAttribute("title", "X5 Retail Group pdf")).click();
        //закрыть
        $(".eicon-close").click();

        //sleep(1000);

        $(".ekko-lightbox-container").find(byText("❯")).hover();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();

        $(".ekko-lightbox-container").find(byText("❮")).hover();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();

        $(".ekko-lightbox").pressEscape();


        $(".clients-about").$(byAttribute("title", "ДИТ Омск pdf")).click();
        //закрыть
        $(".eicon-close").click();

        $(".ekko-lightbox-container").find(byText("❯")).hover();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();

        $(".ekko-lightbox-container").find(byText("❮")).hover();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();

        $(".ekko-lightbox").pressEscape();


        $(".clients-about").$(byAttribute("title", "Рольф pdf")).click();
        //закрыть
        $(".eicon-close").click();

        $(".ekko-lightbox-container").find(byText("❯")).hover();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();

        $(".ekko-lightbox-container").find(byText("❮")).hover();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();

        $(".ekko-lightbox").pressEscape();

        $(".clients-about").$(byAttribute("title", "Ростелеком pdf")).click();
        //закрыть
        $(".eicon-close").click();

        $(".ekko-lightbox-container").find(byText("❯")).hover();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();

        $(".ekko-lightbox-container").find(byText("❮")).hover();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();

        $(".ekko-lightbox").pressEscape();


        $(".clients-about").$(byAttribute("title", "ВТБ24 pdf")).click();
        //закрыть
        $(".eicon-close").click();

        $(".ekko-lightbox-container").find(byText("❯")).hover();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();

        $(".ekko-lightbox-container").find(byText("❮")).hover();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();

        $(".ekko-lightbox").pressEscape();

        $(".clients-about").$(byAttribute("title", "Witology pdf")).click();
        //закрыть
        $(".eicon-close").click();

        $(".ekko-lightbox-container").find(byText("❯")).hover();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();
        $(".ekko-lightbox-container").find(byText("❯")).click();

        $(".ekko-lightbox-container").find(byText("❮")).hover();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();
        $(".ekko-lightbox-container").find(byText("❮")).click();

        $(".ekko-lightbox").pressEscape();

        sleep(1000);

    }

}
