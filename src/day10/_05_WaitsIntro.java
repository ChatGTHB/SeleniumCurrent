package day10;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _05_WaitsIntro extends BaseDriver {
    // Thread.Sleep(), ImplicitlyWait
    @Test
    public void Test() throws InterruptedException {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // He tried to find the element in the locator for as long as the given respite, and when he found it, it came out.

        WebElement button = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        button.click();

        // WebElement message=driver.findElement(By.id("demo"));
        // Thread.sleep(20000); // 20 seconds // Making unnecessary waiting

        WebElement message = driver.findElement(By.xpath("//p[text()='WebDriver']"));
        System.out.println("message.getText() = " + message.getText());

        MyFunction.wait(2);

        waitAndClose();
    }
}
