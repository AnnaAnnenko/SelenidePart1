package qa.annenko;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class SearchInSelenideGitHubRepository {

    public void testPathToSoftAssertions() {
            open("https://github.com/selenide/selenide");
            $("#wiki-tab").click();
            $(".wiki-more-pages-link .Link--muted").click();
            $("[data-filterable-for='wiki-pages-filter']").shouldHave(Condition.text("SoftAssertions"));
            $("a[href$='SoftAssertions']").click();
    }
}