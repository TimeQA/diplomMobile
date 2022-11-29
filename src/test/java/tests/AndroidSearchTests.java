package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;


public class AndroidSearchTests {

    @Test
    void searchTest() {

        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
        $$(AppiumBy.className("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));

    }
}