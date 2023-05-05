package allureTest;

public class TestData {
    private static final String URL = "https://github.com/";


    private static String textToSearch = "selenide";

    private static String expectedTextInSearchPage = "selenide/selenide";


    public static String getURL() {
        return URL;
    }

    public static String getTextToSearch() {
        return textToSearch;
    }

    public static String getExpectedTextInSearchPage() {
        return expectedTextInSearchPage;
    }
}
