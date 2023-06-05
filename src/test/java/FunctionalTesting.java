import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FunctionalTesting {

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
        $("[name=your-name]").clear();
        $("[name=your-surname]").clear();
        $("[name=your-email]").clear();
        $("[name=your-tel]").clear();
        $("[name=your-organization]").clear();
        $("[name=your-message]").clear();







        sleep(4000);
    }

    @Test
    void ourClients() {  //наши клиенты

    }

    @Test
    void whatWeAreTesting() {  //что мы тестируем

    }


    @Test
    void threeReasonsToWorkWithUs() { // три причины работать с нами

    }

    @Test
    void serviceCatalog() { // каталог услуг

    }

    @Test
    void howWeAreWorking() { // как мы работаем

    }

    @Test
    void industries() { // отрасли

    }

    @Test
    void examplesOfProjects() { // примеры проектов

    }
}
