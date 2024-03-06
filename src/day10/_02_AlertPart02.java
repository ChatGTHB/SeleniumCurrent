package day10;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _02_AlertPart02 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunction.wait(3);

        WebElement clickMe2 = driver.findElement(By.xpath("//*[@onclick='myConfirmFunction()']"));
        clickMe2.click();

        MyFunction.wait(2);
        // alert opened
        driver.switchTo().alert().dismiss();
        // Go to the alert box and press CANCEL. So it closes.

        waitAndClose();
    }
}
