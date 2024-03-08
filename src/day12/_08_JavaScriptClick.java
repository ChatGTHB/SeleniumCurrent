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

        WebElement viewAllResearch= driver.findElement(By.xpath("//*[@id=\"w-node-ad4eb106-c8d7-745c-de04-04c71a563382-1a56337f\"]/a"));
        js.executeScript("arguments[0].scrollIntoView(false);", viewAllResearch);

        MyFunction.wait(2);
        // viewAllResearch.click();  // Couldn't click from the top of the page because it was under the top menu
        js.executeScript("arguments[0].click();", viewAllResearch); // We clicked it with _04_JavaScript code in HTML and it worked

        MyFunction.wait(2);
        waitAndClose();
    }
}