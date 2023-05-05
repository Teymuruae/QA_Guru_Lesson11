package allureTest.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private static SelenideElement inputField = $x("//input[@type = 'text']");

    public static SelenideElement getInputField() {
        return inputField;
    }
}
