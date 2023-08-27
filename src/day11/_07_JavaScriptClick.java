package day11;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _07_JavaScriptClick extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://www.copado.com/robotic-testing");
        MyFunction.wait(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement readStoryLink= driver.findElement(By.xpath("(//a[text()='Read Story'])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", readStoryLink);

        // readStoryLink.click();  // Couldn't click from the top of the page because it was under the top menu
        js.executeScript("arguments[0].click();", readStoryLink); // We clicked it with JavaScript code in HTML and it worked

        MyFunction.wait(2);
        waitAndClose();
    }
}