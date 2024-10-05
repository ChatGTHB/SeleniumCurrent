package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _01_AlertHandlingPart01 extends BaseDriver {

    @Test
    public void handleSimpleAlert() {
        // Step 1: Navigate to the Selenium alerts page
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunction.wait(3); // Wait to ensure the page is loaded

        // Step 2: Find the "Click me" button to trigger a simple alert
        WebElement clickMeButton = driver.findElement(By.id("alert"));
        clickMeButton.click();
        MyFunction.wait(3); // Wait to observe the alert

        // Step 3: Handle the alert by clicking "OK" (accepting the alert)
        driver.switchTo().alert().accept(); // Accepts the alert by clicking OK

        // Step 4: Close the browser after the test is done
        waitAndClose(); // Custom method to wait briefly and then close the browser
    }
}
