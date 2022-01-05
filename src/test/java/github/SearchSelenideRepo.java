package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {
    @Test
    void shouldFindSelenideRepositoryInGithub() {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("h1").shouldHave(text("selenide / selenide"));

        //Структура автоматизированных тестов
            // ARRANGE (optional) - Подготовка
            // ACT                - Действие
            // ASSERT             - Проверка

        //Структура end-to-end тестов
        // ARRANGE (optional) - Подготовка
        // ACT                - Действие
        // ASSERT             - Проверка
        // ACT                - Действие
        // ASSERT             - Проверка
        // ACT                - Действие
        // ASSERT             - Проверка


    }

}
