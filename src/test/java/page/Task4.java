package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {
    private WebElement webElement;
    private WebDriver driver;
    private String emailEstimate ="//*[@id='email_quote']";

    public Task4 (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Task4 sendEmail(String email){
        webElement = driver.findElement(By.xpath(emailEstimate));
        webElement.click();
        return this;
    }
}
