package day13;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;
import java.util.Set;

public class _01_WindowsIntro extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://www.selenium.dev/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunction.wait(2);

        String mainPageWindowId = driver.getWindowHandle(); // I got the id of my location i.e. home page

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : links) {
            // link.click();
            js.executeScript("arguments[0].click();", link);
        }

        Set<String> windowsIds = driver.getWindowHandles();
        for (String id : windowsIds) {
            System.out.println("id = " + id);
        }

        MyFunction.wait(2);
        driver.switchTo().window(mainPageWindowId); // Switch to the corresponding Window (Tab)

        waitAndClose();
    }
}
