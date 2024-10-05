package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _03_AlertHandlingWithInput extends BaseDriver {

    @Test
    public void handlePromptAlertWithInput() {
        // Step 1: Navigate to the Selenium alerts page
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunction.wait(2); // Wait for the page to fully load

        // Step 2: Find and click the button that triggers a prompt alert
        WebElement promptButton = driver.findElement(By.id("prompt"));
        promptButton.click();
        MyFunction.wait(2); // Wait for the alert to appear

        // Step 3: Input "ismet" into the prompt alert's text field
        driver.switchTo().alert().sendKeys("kerem");

        // Step 4: Accept the alert (this clicks the "OK" button)
        driver.switchTo().alert().accept();

        // Step 5: Find the element that displays the result text
        WebElement resultMessage = driver.findElement(By.id("text"));

        // Step 6: Scroll down to the result message (in case it's not visible on the page)
        new Actions(driver).scrollToElement(resultMessage).build().perform();
        MyFunction.wait(2); // Short wait to visually observe the scrolling

        // Step 7: Verify that the result message contains the input "ismet"
        Assert.assertTrue("The expected message 'kerem' was not found!", resultMessage.getText().equalsIgnoreCase("kerem"));

        // Step 8: Close the browser after the test is done
        waitAndClose(); // Custom method to wait briefly and close the browser
    }
}
