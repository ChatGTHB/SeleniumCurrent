package day11;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _01_IFrameIntro extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://chercher.tech/practice/frames");

        long startTime = System.currentTimeMillis();

        //driver.switchTo().frame(0);          // It can be passed by giving indexes: index on the page
        //driver.switchTo().frame("frame1");   // You can pass by giving id, but it's slow
        //driver.switchTo().frame("iamframe"); // It can also be passed by giving name, but it's fast

        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1); // You can also export it as weblement, but it's fast.
                                         // index>webelement>name>id --> Depends on the selenium version.

        long endTime = System.currentTimeMillis();
        System.out.println("Duration = " + (endTime - startTime));

        WebElement textBox = driver.findElement(By.cssSelector("[id='topic']+input"));
        textBox.sendKeys("Türkiye");

        // If a locator in an iframe will be processed, I need to switch to that iframe first.
        // driver.switchTo().frame(0);      // switch to relevant room (iframe)
        // driver.switchTo().parentFrame(); // goes to the previous page, one back
        driver.switchTo().defaultContent(); // goes directly to the outermost page

        waitAndClose();
    }
}
