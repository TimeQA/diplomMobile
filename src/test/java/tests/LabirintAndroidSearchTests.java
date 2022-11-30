package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class LabirintAndroidSearchTests extends TestBase{

    @Test
    void searchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Поиск в Лабиринте")).click();
            $(AppiumBy.id("ru.labirint.android:id/toolbar_search_et")).setValue("1984");
        });

        step("Verify content found", () -> {
            $$(AppiumBy.id("ru.labirint.android.otherfeatures:id/search_hint_recycler_view"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }
//    ru.labirint.android.otherfeatures:id/search_hint_recycler_view

}
