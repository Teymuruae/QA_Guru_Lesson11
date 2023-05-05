package allureTest;

import allureTest.pages.MainPage;
import allureTest.pages.SearchPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


public class Steps {

    @Step("Открываем главную страницу")
    public void openMainPage(String url) {
        Selenide.open(url);
        Helpers.miximizeWindow();
    }

    @Step("Поиск репозитория")
    public void repositorySearch(String repositoryName) {
        MainPage.getInputField()
                .shouldBe(Condition.visible)
                .setValue(repositoryName)
                .pressEnter();
    }

    @Step("Клик по найденному репозиторию")
    public void clickOnSearchElement(String expectedText) {
        SearchPage
                .getSearchedElement()
                .shouldHave(Condition
                        .text(expectedText))
                .click();
    }

    @Step("Клик по кнопке Issue")
    public void clickIssueLink() {
        SearchPage
                .getIssueLink()
                .shouldBe(Condition.exist)
                .click();
    }

    @Step("Проверка, что в Issue отображается нужный элемент")
    public void checkElementInsideIssue(SelenideElement element) {
        element
                .shouldBe(Condition.visible);
    }
}
