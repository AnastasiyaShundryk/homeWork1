package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Task1;
import page.Task2;

public class Tests {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = new FirefoxDriver();
    }

    @Test(description = "Task 1 'I Can Win'")
    public void Task1() {
        String textLocator= "postform-text";
        String code ="Hello from WebDriver";
        String postformLocator ="postform-name";
        String title ="helloweb";
        String submitLocator="//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button";

        Task1 task= new Task1(driver);
        task.openPage();
        task.Note(code,textLocator,postformLocator,title,submitLocator);
    }

    @Test(description = "Task 2 'Bring It On'")
    public void Task2() {
        String textLocator= "postform-text";
        String code1="git config --global user.name  \"New Sheriff in Town\"\n";
        String code2="git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n";
        String code3 ="git push origin master --force";
        String pasteHighlightingLocator ="//*[@id=\"select2-postform-format-container\"]";
        String searchFieldLocator = "select2-search__field";
        String key = "Bash";
        String postformLocator ="postform-name";
        String title ="how to gain dominance among developers";
        String submitLocator="//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button";

        Task2 task= new Task2(driver);
        task.openPage();
        task.Note(textLocator,code1,code2,code3,pasteHighlightingLocator,searchFieldLocator,key,postformLocator,title,submitLocator);

        boolean text = driver.getPageSource().contains("how to gain dominance among developers");
        String colorText = driver.findElement(By.className("kw2")).getCssValue("color");
        System.out.println("Text color:"+colorText);
        boolean text1 = driver.getPageSource().contains("git config --global user.name  \"New Sheriff in Town\"\n");
        boolean text2 = driver.getPageSource().contains("git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n");
        boolean text3 = driver.getPageSource().contains("git push origin master --force");

    }

    @AfterMethod(alwaysRun = true)
    public void browseTearnDownr(){
        driver.quit();
        driver=null;
    }
}
