package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.page.MobileSteps;

import static io.qameta.allure.Allure.step;

@Tag("labirint")
public class LabirintAndroidSearchTests extends TestBase {

    MobileSteps mobileSteps = new MobileSteps();

    @DisplayName("Отказ в отслеживании локации")
    @Test
    void skippedTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            mobileSteps.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            mobileSteps.skipIntro();
            mobileSteps.skipIntro();
        });

        //        После этого шага сделать проверку на наличие элементов на странице
        step("Пропустить авторизацию", () -> {
            mobileSteps.skipIntro();
        });
    }

    @DisplayName("Проверка главной страницы")
    @Test
    void mainPageTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            mobileSteps.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            mobileSteps.skipIntro();
            mobileSteps.skipIntro();
        });

        step("Пропустить авторизацию", () -> {
            mobileSteps.skipIntro();
        });

        step("Проверить наличие элементов на странице", () -> {
            mobileSteps.checkResults();
        });
    }

    @DisplayName("Проверка работы работы поля для введения запроса")
    @Test
    void searchFieldTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            mobileSteps.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            mobileSteps.skipIntro();
            mobileSteps.skipIntro();
        });

        step("Пропустить авторизацию", () -> {
            mobileSteps.skipIntro();
        });

        step("Кликнуть на поле поиска", () -> {
            mobileSteps.clickSearchField();
        });
    }

    @DisplayName("Проверка работы поиска по продуктам магазина")
    @Test
    void searchResultTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            mobileSteps.selectDeny();
        });

        step("Пройти ознакомление", () -> {
            mobileSteps.skipIntro();
            mobileSteps.skipIntro();
        });

        step("Пропустить авторизацию", () -> {
            mobileSteps.skipIntro();
        });

        step("Кликнуть на поле поиска", () -> {
            mobileSteps.clickSearchField();
        });

        step("Проверить наличие элементов на странице", () -> {
            mobileSteps.checkResults();
        });
    }
}
