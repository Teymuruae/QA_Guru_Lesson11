package allureTest.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private static SelenideElement searchedElement = $x("(//a[@class = 'v-align-middle'])[1]");
    private static SelenideElement issueLink = $("a#issues-tab");

    public static SelenideElement getSearchedElement() {
        return searchedElement;
    }

    public static SelenideElement getIssueLink() {
        return issueLink;
    }
}
