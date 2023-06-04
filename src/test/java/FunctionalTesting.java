import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
        $("#masthead").find(byText("Заказать услугу")).click();
        $(".premium-modal-box-modal-body").find(byText("Имя")).hover();
        $(".wpcf7-form-control").click();
        $(".wpcf7-form-control").setValue("граф");

        $(".premium-modal-box-modal-body").find(byText("Фамилия")).click();
        // $(".wpcf7-form-control").click();
        // $(".wpcf7-form-control").setValue("краснов");

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
    void examplesOfProjects () { // примеры проектов

    }
}
