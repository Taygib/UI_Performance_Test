package test;

import com.codeborne.selenide.Condition;
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

        // заказать услугу в правом верхнем углу
        $("#masthead").find(byText("Заказать услугу")).click();

        $(".premium-modal-box-modal-title").shouldHave(text("Свяжитесь с нами"));

        $(".premium-modal-box-modal-body").shouldHave(text("Имя"));
        $("[name=your-name]").click();
        $("[name=your-name]").setValue("граф");

        $(".premium-modal-box-modal-body").shouldHave(text("Фамилия"));
        $("[name=your-surname]").click();
        $("[name=your-surname]").setValue("краснов");

        $(".premium-modal-box-modal-body").shouldHave(text("Email"));
        $("[name=your-email]").click();
        $("[name=your-email]").setValue("hghghg@mail.ru");

        $(".premium-modal-box-modal-body").shouldHave(text("Телефон"));
        $("[name=your-tel]").click();
        $("[name=your-tel]").setValue("7777777777");

        $(".premium-modal-box-modal-body").shouldHave(text("Компания"));
        $("[name=your-organization]").click();
        $("[name=your-organization]").setValue("FunctionalLab");

        $(".premium-modal-box-modal-body").shouldHave(text("Сообщение"));
        $("[name=your-message]").click();
        $("[name=your-message]").setValue("FunctionalTest");

        $("[value=Отправить]").hover();

        $(".premium-modal-box-close-button-container").click();

        // заказать услугу под названием Функциональное тестирование

        $(".col-12").shouldHave(text("Функциональное тестирование"));
        $(".col-12").shouldHave(text("Сделайте шаг навстречу качеству"));

        $(".testing_btn").find(byText("Заказать услугу")).click();

        //удаление заполненных полей
        step("удаление заполненных полей", () -> {
            deleteForm.clearSpace();
        });

        $(".premium-modal-box-modal-title").shouldHave(text("Свяжитесь с нами"));

        $(".premium-modal-box-modal-body").shouldHave(text("Имя"));
        $("[name=your-name]").click();
        $("[name=your-name]").setValue("граф");

        $(".premium-modal-box-modal-body").shouldHave(text("Фамилия"));
        $("[name=your-surname]").click();
        $("[name=your-surname]").setValue("краснов");

        $(".premium-modal-box-modal-body").shouldHave(text("Email"));
        $("[name=your-email]").click();
        $("[name=your-email]").setValue("hghghg@mail.ru");

        $(".premium-modal-box-modal-body").shouldHave(text("Телефон"));
        $("[name=your-tel]").click();
        $("[name=your-tel]").setValue("7777777777");

        $(".premium-modal-box-modal-body").shouldHave(text("Компания"));
        $("[name=your-organization]").click();
        $("[name=your-organization]").setValue("FunctionalLab");

        $(".premium-modal-box-modal-body").shouldHave(text("Сообщение"));
        $("[name=your-message]").click();
        $("[name=your-message]").setValue("FunctionalTest");

        $("[value=Отправить]").hover();

        $(".premium-modal-box-close-button-container").click();

        // заказать услугу под названием Перфоманс лаб - это


        $(".inf").shouldHave(text("перфоманс лаб - это"));
        $(".testing_btn").find(byText("Заказать услугу")).click();

        //удаление заполненных полей
        step("удаление заполненных полей", () -> {
            deleteForm.clearSpace();
        });

        $(".premium-modal-box-modal-title").shouldHave(text("Свяжитесь с нами"));

        $(".premium-modal-box-modal-body").shouldHave(text("Имя"));
        $("[name=your-name]").click();
        $("[name=your-name]").setValue("граф");

        $(".premium-modal-box-modal-body").shouldHave(text("Фамилия"));
        $("[name=your-surname]").click();
        $("[name=your-surname]").setValue("краснов");

        $(".premium-modal-box-modal-body").shouldHave(text("Email"));
        $("[name=your-email]").click();
        $("[name=your-email]").setValue("hghghg@mail.ru");

        $(".premium-modal-box-modal-body").shouldHave(text("Телефон"));
        $("[name=your-tel]").click();
        $("[name=your-tel]").setValue("7777777777");

        $(".premium-modal-box-modal-body").shouldHave(text("Компания"));
        $("[name=your-organization]").click();
        $("[name=your-organization]").setValue("FunctionalLab");

        $(".premium-modal-box-modal-body").shouldHave(text("Сообщение"));
        $("[name=your-message]").click();
        $("[name=your-message]").setValue("FunctionalTest");

        $("[value=Отправить]").hover();

        $(".premium-modal-box-close-button-container").click();


        // find(byText("Заказать услугу")).click();


        sleep(4000);
    }

    @Test
    void ourClients() {  //наши клиенты

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

        $(".clients").shouldHave(text("НАШИ КЛИЕНТЫ")).hover();
        $(".clients").find(byText("Посмотреть всех клиентов")).click();

        // как помогает Перфоманс Лаб
        $("#client-page-title").shouldHave(text("Нам доверяют тысячи клиентов во всем мире"));

        $(".module-features").shouldHave(text("Узнайте как Перфоманс Лаб помогает клиентам:"));

        $(".module-features").shouldHave(text("Улучшить качество программных продуктов"));
        $(".module-features").shouldHave(text("Протестировать приложения"));
        $(".module-features").shouldHave(text("Повысить удовлетворенность пользователей"));

        $(".module-features").find(byText("Читать кейсы")).click();

        Selenide.back();

        $(".start-block").shouldHave(text("Получите предложение уже сегодня"));
        //проверка контактной информации
        $(".info-contacts").shouldHave(text("Свяжитесь с нами"));
        $(".info-contacts").shouldHave(text("+7 495 989 6165"));
        $(".info-contacts").shouldHave(text("Пн-Пт с 10 до 19 часов"));
        $(".info-contacts").shouldHave(text("info@pflb.ru"));
        //проверка доп. информацийй и услуг

        $(".info-contacts").shouldHave(text("Узнайте больше"));
        $(".info-contacts").find(byText("услуги")).click();
        Selenide.back();
        $(".info-contacts").shouldHave(text("Получите предложение"));
        $(".info-contacts").find(byText("Заказать услугу")).click();

        // заказать услугу
        $(".premium-modal-box-modal-title").shouldHave(text("Свяжитесь с нами"));

        $(".premium-modal-box-modal-body").shouldHave(text("Имя"));
        $("[name=your-name]").click();
        $("[name=your-name]").setValue("граф");

        $(".premium-modal-box-modal-body").shouldHave(text("Фамилия"));
        $("[name=your-surname]").click();
        $("[name=your-surname]").setValue("краснов");

        $(".premium-modal-box-modal-body").shouldHave(text("Email"));
        $("[name=your-email]").click();
        $("[name=your-email]").setValue("hghghg@mail.ru");

        $(".premium-modal-box-modal-body").shouldHave(text("Телефон"));
        $("[name=your-tel]").click();
        $("[name=your-tel]").setValue("7777777777");

        $(".premium-modal-box-modal-body").shouldHave(text("Компания"));
        $("[name=your-organization]").click();
        $("[name=your-organization]").setValue("FunctionalLab");

        $(".premium-modal-box-modal-body").shouldHave(text("Сообщение"));
        $("[name=your-message]").click();
        $("[name=your-message]").setValue("FunctionalTest");

        $("[value=Отправить]").hover();

        $(".premium-modal-box-close-button-container").click();

        Selenide.back();

        sleep(4000);
    }

    @Test
    void whatWeAreTesting() {  //что мы тестируем
        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

        $(".systems").hover();
        $(".systems").shouldHave(text("ЧТО МЫ ТЕСТИРУЕМ"));

        $(byAttribute("title", "Тестирование сайтов")).click();
        switchTo().window(0);

        $(byAttribute("title", "Тестирование IT-систем")).click();


        $(".systems").find(byText("ИГРЫ")).click();
        $(".premium-modal-box-close-button-container").click();
        //заполнение данных

        $(byAttribute("title", "Тестирование мобильных приложений")).click();
        Selenide.back();


        $(".systems").find(byText("УМНЫЕ УСТРОЙСТВА, VR, AR")).click();
        $(".premium-modal-box-close-button-container").click();
        //заполнение данных

        // кнопка заказать услугу

        sleep(5000);


    }


    @Test
    void threeReasonsToWorkWithUs() { // три причины работать с нами

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");

        $(".three_reason").hover();
        $(".three_reason").shouldHave(text("3 ПРИЧИНЫ РАБОТАТЬ С НАМИ"));

        $(".three_reason").shouldHave(text("МЫ СПЕЦИАЛИЗИРУЕМСЯ НА ТЕСТИРОВАНИИ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ"));

        $(".three_reason").shouldHave(text("ПРЕДМЕТНЫЕ ЗНАНИЯ В РАЗЛИЧНЫХ ОТРАСЛЯХ: БАНКИ, РИТЕЙЛ, ТЕЛЕКОМ"));

        $(".three_reason").shouldHave(text("СОВРЕМЕННЫЕ И КЛАССИЧЕСКИЕ ПОДХОДЫ"));

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
        $(".how-we-work").hover();
        $(".how-we-work").shouldHave(text("КАК МЫ РАБОТАЕМ"));

        $(".how-we-work").shouldHave(text("Анализ программного обеспечения и документации (BRD, FSD, User stories)"));
        $(".how-we-work").find(byText("01.")).click();
        $(".information").shouldHave(text("Анализ программного обеспечения и документации (BRD, FSD, User stories)"));

        $(".how-we-work").shouldHave(text("Разработка тестовой модели"));
        $(".how-we-work").find(byText("02.")).click();
        $(".information").shouldHave(text("Разработка тестовой модели"));

        $(".how-we-work").shouldHave(text("Проведение тестирования"));
        $(".how-we-work").find(byText("03.")).click();
        $(".information").shouldHave(text("Проведение тестирования"));

        $(".how-we-work").shouldHave(text("Подготовка отчета"));
        $(".how-we-work").find(byText("04.")).click();
        $(".information").shouldHave(text("Подготовка отчета"));

        // кнопка заказать услугу

    }

    @Test
    void industries() { // отрасли

        open("https://www.performance-lab.ru/funkcionalnoe-testirovanie");
        $(".industrys").hover();
        $(".industrys").shouldHave(text("ОТРАСЛИ"));

        //название отраслей
        $(".industrys").shouldHave(text("Банковский сектор и Финансы"));
        $(".industrys").shouldHave(text("Госструктуры"));
        $(".industrys").shouldHave(text("Ритейл"));
        $(".industrys").shouldHave(text("Телеком"));
        $(".industrys").shouldHave(text("Медицина"));
        $(".industrys").shouldHave(text("Интернет"));
        $(".industrys").shouldHave(text("Промышленность"));
        $(".industrys").shouldHave(text("Развлечения"));
        $(".industrys").shouldHave(text("Страхование"));
        $(".industrys").shouldHave(text("Топливно - энергетическая отрасль"));
        $(".industrys").shouldHave(text("Транспорт, логистика"));

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
    void clientsAboutUs () {

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
