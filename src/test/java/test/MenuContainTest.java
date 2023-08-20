package test;

import data.ContainMenu;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MenuContainPage;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("Taygib")
public class MenuContainTest extends TastBase {
    MenuContainPage menuContainPage = new MenuContainPage();
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
    @Tag("Research")
    @Tag("MenuContain")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка поиска")
    void menuContain(ContainMenu menuSection, List<String> expectedButtons) {

        step("Открыть страницу", () -> {
            open("/funkcionalnoe-testirovanie");
        });
        step("Название загаловков в подменю", () -> {
            menuContainPage.parameterMenu(menuSection.toString(), expectedButtons);
        });
    }
}