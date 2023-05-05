package allureTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class Testo {
    @Step("Кукушечка")
    public void step(){
        Selenide.open("https://github.com/");
    }

    @Test
    void test(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        step();
    }
}
