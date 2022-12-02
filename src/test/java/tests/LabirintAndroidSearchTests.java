package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.page.PageElements;

import static io.qameta.allure.Allure.step;

public class LabirintAndroidSearchTests extends TestBase {

    PageElements pageElements = new PageElements();

    @DisplayName("Отказ в отслеживании локации")
    @Tag("labirint")
    @Test
    void skippedTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            pageElements.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            pageElements.skipIntro();
            pageElements.skipIntro();
        });

        //        После этого шага сделать проверку на наличие элементов на странице
        step("Пропустить авторизацию", () -> {
            pageElements.skipIntro();
        });
    }

    @DisplayName("Проверка главной страницы")
    @Tag("labirint")
    @Test
    void mainPageTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            pageElements.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            pageElements.skipIntro();
            pageElements.skipIntro();
        });

        step("Пропустить авторизацию", () -> {
            pageElements.skipIntro();
        });

        step("Проверить наличие элементов на странице", () -> {
            pageElements.checkResults();
        });
    }

    @DisplayName("Проверка работы работы поля для введения запроса")
    @Tag("labirint")
    @Test
    void searchFieldTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            pageElements.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            pageElements.skipIntro();
            pageElements.skipIntro();
        });

        step("Пропустить авторизацию", () -> {
            pageElements.skipIntro();
        });

        step("Кликнуть на поле поиска", () -> {
            pageElements.clickSearchField();
        });
    }

    @DisplayName("Проверка работы поиска по продуктам магазина")
    @Tag("labirint")
    @Test
    void searchResultTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            pageElements.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            pageElements.skipIntro();
            pageElements.skipIntro();
        });

        step("Пропустить авторизацию", () -> {
            pageElements.skipIntro();
        });

        step("Кликнуть на поле поиска", () -> {
            pageElements.clickSearchField();
        });

        step("Проверить наличие элементов на странице", () -> {
            pageElements.checkResults();
        });
    }





//    ru.labirint.android:id/toolbar_search_et
//    ru.labirint.android.otherfeatures:id/toolbar_search_et
//    $(AppiumBy.accessibilityId("Поиск в Лабиринте")).click();
//    $(AppiumBy.id("ru.labirint.android.otherfeatures:id/toolbar_search_et")).setValue("1984");

}
