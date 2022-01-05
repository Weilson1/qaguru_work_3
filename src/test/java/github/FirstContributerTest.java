package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstContributerTest {
    @Test
    void firstContributerShouldAndreiSolntsev(){
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("")).closest("div")
                .$$("ul li").first().hover();
        $$(".Popover-message").find(visible);
        sleep(5000);

    }
}
