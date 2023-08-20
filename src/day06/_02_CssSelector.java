package day06;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _02_CssSelector extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String message = "Hello Selenium!";

        WebElement textBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        textBox.sendKeys(message);

        WebElement button = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        button.click();

        WebElement message2 = driver.findElement(By.cssSelector("[id='display']"));

        if (message2.getText().contains(message))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        waitAndClose();
    }
}
