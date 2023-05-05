package allureTest;

import com.codeborne.selenide.WebDriverRunner;

public class Helpers {
    public static void miximizeWindow(){
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
