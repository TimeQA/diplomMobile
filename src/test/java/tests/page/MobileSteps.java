package tests.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MobileSteps {

    private final SelenideElement
            deny = $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")),
            nextIntro = $(AppiumBy.id("ru.labirint.android.installed_feature_main:id/fragment_main_auth_skip")),
            searchField = $(AppiumBy.id("ru.labirint.android:id/toolbar_search_et"));

    private final ElementsCollection
            searchResults = $$(AppiumBy.id("ru.labirint.android.otherfeatures:id/search_hint_recycler_view"));



    public final MobileSteps selectDeny() {
        deny.click();

        return this;
    }

    public final MobileSteps skipIntro() {
        nextIntro.click();

        return this;
    }

    public final MobileSteps clickSearchField() {
        searchField.click();

        return this;
    }


    public final MobileSteps checkResults() {
        searchResults.shouldHave(sizeGreaterThan(0));

        return this;
    }
}


