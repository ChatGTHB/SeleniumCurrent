package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _07_AlertPart1 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunction.wait(3);

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();

        MyFunction.wait(2);

        // alert opened.
        driver.switchTo().alert().accept();
        // Go to the alert box and press OK. so it closes.

        waitAndClose();
    }
}
