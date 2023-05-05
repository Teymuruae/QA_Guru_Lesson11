package allureTest.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class IssuePage {
    private static SelenideElement expectedElementInsideIssue =
            $x("//a[text() = 'Add Selenide browser.']");

    public static SelenideElement getExpectedElementInsideIssue() {
        return expectedElementInsideIssue;
    }
}
