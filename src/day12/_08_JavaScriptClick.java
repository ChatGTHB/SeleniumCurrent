package day12;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _08_JavaScriptClick extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://www.copado.com/robotic-testing");
        MyFunction.wait(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement readStory=driver.findElement(By.xpath("//div[text()='Read Success Story']"));
        js.executeScript("arguments[0].scrollIntoView(false);", readStory);
        MyFunction.wait(2);
        //readStory.click();  // Couldn't click from the top of the page because it was under the top menu
        js.executeScript("arguments[0].click();", readStory); // We clicked it with JavaScript code in HTML and it worked

        MyFunction.wait(2);
        waitAndClose();
    }
}