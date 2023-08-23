package day09;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _09_AlertPart3 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunction.wait(3);

        WebElement clickMe3 = driver.findElement(By.xpath("//*[@onclick='myPromptFunction()']"));
        clickMe3.click();// alert opened

        MyFunction.wait(2);
        driver.switchTo().alert().sendKeys("Kerem"); // Go to the alert box and send the text "Kerem".
        driver.switchTo().alert().accept(); // alert closed

        MyFunction.wait(2);
        WebElement txtActual = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("The expected post did not appear", txtActual.getText().contains("Kerem"));

        waitAndClose();
    }
}
