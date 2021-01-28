package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task3 {
    private WebElement webElement;
    private String pageURL="https://cloud.google.com/";
    private WebDriver driver;
    private String locatorSearchField="//devsite-search/form/div[1]/div/input";
//    private String locatorSearchBtn= "//*[text()=All results for \"google cloud platform pricing calculator\"]";
    private String textSearch="Google Cloud Platform Pricing Calculator";
    private String locatorSearchResult="//b[text()='Google Cloud Platform Pricing Calculator']";
    private String locatorComputerEngine="*//md-tab-item[1]/div[1]/div/div[1]/div/div";
    private String locatorNumberOfInstance="//*[@id=\"input_63\"]";
    private String locatorOS="//*[@id='select_value_label_56']";
    private String locatorDebianOS="//*[@id='select_option_65']/div[1]";
    private String locatorVMClass="//*[@id=\"select_value_label_57\"]/span[1]/div";
    private String locatorClassRegular="//*[@id=\"select_option_78\"]/div[1]";
    private String locatorIntanceType="//*[@id=\"input_106\"]";
    private String locatorChosenType="//*[@id=\"select_option_107\"]/div[1]";
    private String locatorGPUsCheckbox="//form/div[4]/div[1]/md-input-container/md-checkbox/div[1]/div[1]";




    public Task3 (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Task3 openPage() {
        driver.get(pageURL);
        new WebDriverWait(driver, 10).until(ExpectedConditions.
                presenceOfAllElementsLocatedBy(By.id("accelerate-your-transformation-with-google-cloud")));
        return this;
    }
    public Task3 search() {
       webElement = driver.findElement(By.xpath(locatorSearchField));
       webElement.sendKeys(textSearch);
       webElement.sendKeys(Keys.ENTER);
       new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locatorSearchResult)));
       webElement = driver.findElement(By.xpath(locatorSearchResult));
       webElement.click();
       return this;
    }

    public Task3 form () throws InterruptedException {
        new WebDriverWait(driver, 10).until(ExpectedConditions.
                presenceOfAllElementsLocatedBy(By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe")));
        webElement = driver.findElement(By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe"));
        driver.switchTo().frame(webElement);
        webElement = driver.findElement(By.xpath("//*[@id=\"myFrame\"]"));
        driver.switchTo().frame(webElement);


        new WebDriverWait(driver, 10).until(ExpectedConditions.
                presenceOfAllElementsLocatedBy(By.xpath(locatorGPUsCheckbox)));

        webElement = driver.findElement(By.xpath(locatorComputerEngine));
        webElement.click();
        webElement = driver.findElement(By.xpath(locatorNumberOfInstance));
        webElement.click();
        webElement.sendKeys("4");
        webElement = driver.findElement(By.xpath(locatorOS));
        webElement.click();
        webElement = driver.findElement(By.xpath(locatorDebianOS));
        webElement.click();
        webElement=driver.findElement(By.xpath(locatorVMClass));
        webElement.click();
        webElement=driver.findElement(By.xpath(locatorClassRegular));
        webElement.click();
        scrollDwn();
        webElement=driver.findElement(By.xpath(locatorIntanceType));
        Thread.sleep(100000);
        webElement.click();
        webElement=driver.findElement(By.xpath(locatorChosenType));
        webElement.click();
        webElement=driver.findElement(By.xpath(locatorGPUsCheckbox));
        webElement.click();
        Thread.sleep(10000);
        return this;
    }

    public void scrollDwn (){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
    }
}
