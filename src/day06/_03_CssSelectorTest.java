package day06;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _03_CssSelectorTest extends BaseDriver {

    @Test  // You are the test; you don't need a main method
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String message = "Hello Selenium!";

        WebElement textBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys(message);

        WebElement button = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        button.click();

        WebElement message2 = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Searched message not found", message2.getText().contains(message)); // Is it true inside?
        // If it is TRUE don't give any message, otherwise give an error message

        waitAndClose();
    }
}
