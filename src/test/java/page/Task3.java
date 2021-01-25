package page;

import org.openqa.selenium.WebDriver;

public class Task3 {
    private String URL="https://cloud.google.com/";
    private WebDriver driver;
    private String locatorSearchField="//devsite-search/form/div[1]/div/input";
    private String locatorSearchBtn= "//*[text()=All results for \"google cloud platform pricing calculator\"]";
    private String textSearch="Google Cloud Platform Pricing Calculator";

    private String locatorSearchResult="//b[text()='Google Cloud Platform Pricing Calculator']";
}
