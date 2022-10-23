package qa.annenko;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchInSelenideGitHubRepository {

    public void testSearchInGitHub() {
        open("https://github.com/selenide/selenide");
        $(".wiki-tab").click();
        $(".filter-bar").shouldHave(Condition.text("SoftAssertions"));
    }
}
