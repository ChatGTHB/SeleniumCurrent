package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _02_AlertHandlingPart02 extends BaseDriver {

    @Test
    public void handlePromptAlertWithDismiss() {
        // Step 1: Navigate to the Selenium alerts page
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunction.wait(2); // Wait for the page to fully load

        // Step 2: Find and click the button that triggers a prompt alert
        WebElement promptButton = driver.findElement(By.id("prompt"));
        promptButton.click();
        MyFunction.wait(2); // Wait for the alert to appear

        // Step 3: Dismiss the prompt alert (this clicks the "Cancel" button)
        driver.switchTo().alert().dismiss();

        // Step 4: Verify that the message is "null" after dismissing the alert
        WebElement resultMessage = driver.findElement(By.id("text"));
        Assert.assertTrue("The message was not found or incorrect", resultMessage.getText().equalsIgnoreCase("null"));

        // Step 5: Close the browser after the test is done
        waitAndClose(); // Custom method to wait briefly and close the browser
    }
}
