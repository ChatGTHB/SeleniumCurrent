package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _04_HandleAlertWithDefaultMessage extends BaseDriver {

    @Test
    public void handleAlertWithDefaultText() {
        // Step 1: Navigate to the Selenium alerts page
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunction.wait(2); // Wait for the page to fully load

        // Step 2: Find and click the button that triggers the alert with default text
        WebElement defaultPromptButton = driver.findElement(By.id("prompt-with-default"));
        defaultPromptButton.click();
        MyFunction.wait(2); // Wait for the alert to appear

        // Step 3: Capture the text displayed on the alert (prompt's default message)
        String alertText = driver.switchTo().alert().getText(); // Get the default message from the alert

        // Step 4: Accept the alert (click the "OK" button)
        driver.switchTo().alert().accept();

        // Step 5: Print the default message to the console
        System.out.println("Alert message = " + alertText);

        // Step 6: Verify that the alert text contains the word "Enter"
        Assert.assertTrue("The expected message 'Enter' was not found in the alert!", alertText.contains("Enter"));

        // Step 7: Close the browser after the test is done
        waitAndClose(); // Custom method to wait briefly and close the browser
    }
}
