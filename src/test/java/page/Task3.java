package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task3 {
    private String pageURL="https://cloud.google.com/";
    private WebDriver driver;
    private String locatorSearchField="//devsite-search/form/div[1]/div/input";
    private String locatorSearchBtn= "//*[text()=All results for \"google cloud platform pricing calculator\"]";
    private String textSearch="Google Cloud Platform Pricing Calculator";
    private String locatorSearchResult="//b[text()='Google Cloud Platform Pricing Calculator']";

    public Task3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Task3 openPage() {
        driver.get(pageURL);
        new WebDriverWait(driver, 100);
        return this;
    }
    public Task3 search() {
        WebElement searchField = driver.findElement(By.xpath(locatorSearchField));
        searchField.sendKeys(textSearch);
        WebElement searchBtn = driver.findElement(By.xpath(locatorSearchBtn));
        searchBtn.click();
        // new WebDriverWait(driver, 100);
        return this;
    }

}
