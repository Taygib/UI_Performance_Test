package test.component;

import pages.OrderPage;

import static io.qameta.allure.Allure.step;

public class TitleField {
    OrderPage order = new OrderPage();

    public void fields() {
        step("Проверка меню для заказа услуг", () -> {
            step("Свяжитесь с нами", () -> {
                order.сheckTitle("Свяжитесь с нами");
            });

            step("Имя", () -> {
                order.checkTitleFieldName("Имя");
            });

            step("Фамилия", () -> {
                order.checkTitleFieldSurname("Фамилия");
            });

            step("Email", () -> {
                order.checkTitleFieldEmail("Email");
            });

            step("Телефон", () -> {
                order.checkTitleFieldTelephone("Телефон");
            });

            step("Проверка названии  Компания", () -> {
                order.checkTitleFieldCompany("Компания");
            });

            step("Сообщение", () -> {
                order.checkTitleFieldMessage("Сообщение");
            });

            step("Кнопка отправить", () -> {
                order.checkTitleButton("value", "Отправить");
            });

            step("Закрыть окно заказа услуг", () -> {
                order.closeContainer();
            });
        });
    }
}