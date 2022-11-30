package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class LabirintAndroidSearchTests extends TestBase {

    @DisplayName("Отказ в отслеживании локации")
    @Tag("labirint")
    @Test
    void skippedTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        });

        step("Пройти ознакомление", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });

        //        После этого шага сделать проверку на наличие элементов на странице
        step("Пропустить авторизацию", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });
    }

    @DisplayName("Проверка главной страницы")
    @Tag("labirint")
    @Test
    void mainPageTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        });

        step("Пройти ознакомление", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });

        //        После этого шага сделать проверку на наличие элементов на странице
        step("Пропустить авторизацию", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });

        step("Проверить результаты поиска", () -> {
            $$(AppiumBy.id("ru.labirint.android.otherfeatures:id/search_hint_recycler_view"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }

    @DisplayName("Проверка работы работы поля для введения запроса")
    @Tag("labirint")
    @Test
    void searchFieldTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        });

        step("Пройти ознакомление", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });

        step("Пропустить авторизацию", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });

        step("Кликнуть на поле поиска", () -> {
            $(AppiumBy.id("ru.labirint.android:id/toolbar_search_et")).click();
        });
    }

    @DisplayName("Проверка работы поиска по продуктам магазина")
    @Tag("labirint")
    @Test
    void searchResultTest() {
        step("Отклонить запрос на отслеживание локации", () -> {
            $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        });

        step("Пройти ознакомление", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });

        step("Пропустить авторизацию", () -> {
            $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")).click();
        });

        step("Кликнуть на поле поиска", () -> {
            $(AppiumBy.id("ru.labirint.android:id/toolbar_search_et")).click();
        });

        step("Проверить результаты поиска", () -> {
            $$(AppiumBy.id("ru.labirint.android.otherfeatures:id/search_hint_recycler_view"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }





//    ru.labirint.android:id/toolbar_search_et
//    ru.labirint.android.otherfeatures:id/toolbar_search_et
//    $(AppiumBy.accessibilityId("Поиск в Лабиринте")).click();
//    $(AppiumBy.id("ru.labirint.android.otherfeatures:id/toolbar_search_et")).setValue("1984");

}
