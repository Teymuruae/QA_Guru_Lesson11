package allureTest;

import allureTest.pages.IssuePage;
import allureTest.pages.MainPage;
import allureTest.pages.SearchPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureTesting extends BaseTest {


    @Test
    @DisplayName("Тест нахождения элемента в issue")
    @Owner("TimBart")
    @Severity(SeverityLevel.CRITICAL)
    void testWithoutSteps() {
        Selenide.open(TestData.getURL());
        Helpers.miximizeWindow();
        MainPage.getInputField()
                .shouldBe(Condition.visible)
                .setValue(TestData.getTextToSearch())
                .pressEnter();
        SearchPage
                .getSearchedElement()
                .shouldHave(Condition
                        .text(TestData.getExpectedTextInSearchPage()))
                .click();
        SearchPage
                .getIssueLink()
                .shouldBe(Condition.exist)
                .click();
        IssuePage
                .getExpectedElementInsideIssue()
                .shouldBe(Condition.visible);
    }

    @Test
    @DisplayName("Тест нахождения элемента в issue с лямбдой")
    @Owner("TimBart")
    @Severity(SeverityLevel.CRITICAL)
    void testWithLambdaSteps() {
        step("Открываем главную страницу", () -> {
            Selenide.open(TestData.getURL());
            Helpers.miximizeWindow();
        });
        step("Поиск репозитория", () -> {
            MainPage.getInputField()
                    .shouldBe(Condition.visible)
                    .setValue(TestData.getTextToSearch())
                    .pressEnter();
        });
        step("Клик по найденному репозиторию", () -> {
            SearchPage
                    .getSearchedElement()
                    .shouldHave(Condition
                            .text(TestData.getExpectedTextInSearchPage()))
                    .click();
        });
        step("Клик по кнопке Issue", () -> {
            SearchPage
                    .getIssueLink()
                    .shouldBe(Condition.exist)
                    .click();
        });
        step("Проверка, что в Issue отображается нужный элемент", () -> {
            IssuePage
                    .getExpectedElementInsideIssue()
                    .shouldBe(Condition.visible);
        });
    }

    @Test
    @DisplayName("Тест нахождения элемента в issue со степами-аннотациями")
    @Owner("TimBart")
    @Severity(SeverityLevel.CRITICAL)
    void testWithAnnotationSteps() {
        Steps steps = new Steps();
        steps.openMainPage(TestData.getURL());
        steps.repositorySearch(TestData.getTextToSearch());
        steps.clickOnSearchElement(TestData.getExpectedTextInSearchPage());
        steps.clickIssueLink();
        steps.checkElementInsideIssue(IssuePage
                .getExpectedElementInsideIssue());

    }

}
