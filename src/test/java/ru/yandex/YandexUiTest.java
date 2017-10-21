package ru.yandex;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class YandexUiTest {

    @Test
    public void testSearchResult(){
        Configuration.browser = "chrome";
        open("https://yandex.ru");
        $("#text").setValue("Selenide").pressEnter();
        $(".serp-adv__found").shouldHave(Condition.text("Нашлось 2 млн результатов"));
    }
}
