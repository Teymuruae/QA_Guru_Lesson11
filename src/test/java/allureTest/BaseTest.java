package allureTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    @BeforeAll
    public static void beforeAll() {
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 40000;


    }
    @BeforeEach
    void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }


}
