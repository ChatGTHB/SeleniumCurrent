package day06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _02_Scenario extends BaseDriver {

    // Scenario: (Using only CSSSelector)
    // Steps:
    // 1. Go to the website: https://testpages.herokuapp.com/styled/index.html
    // 2. Click on the "Calculator" link.
    // 3. Enter the number 6 in the first input field.
    // 4. Enter the number 5 in the second input field.
    // 5. Click on the "Calculate" button.
    // 6. Retrieve and print the result.
    // 7. Validate that the result is correct (6 + 5 = 11).
    // 8. Close the browser.

    @Test
    public void test1() {
        // Step 1: Navigate to the website
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Step 2: Click on the "Calculator" link
        WebElement calculator = driver.findElement(By.cssSelector("[id='calculatetest']"));
        calculator.click();
        MyFunction.wait(2);  // Waiting for 2 seconds
        
        // Step 3: Enter 6 in the first input field
        WebElement input1 = driver.findElement(By.cssSelector("[id='number1']"));
        input1.sendKeys("6");
        MyFunction.wait(2);

        // Step 4: Enter 5 in the second input field
        WebElement input2 = driver.findElement(By.cssSelector("[id='number2']"));
        input2.sendKeys("5");
        MyFunction.wait(2);

        // Step 5: Click on the "Calculate" button
        WebElement calculate = driver.findElement(By.cssSelector("[id='calculate']"));
        calculate.click();
        MyFunction.wait(2);

        // Step 6: Retrieve and print the result
        WebElement answer = driver.findElement(By.cssSelector("[id='answer']"));
        String resultText = answer.getText();
        System.out.println("Result = " + resultText);

        // Step 7: Convert result to integer and validate using Assert
        int result = Integer.parseInt(resultText);
        int expectedResult = 6 + 5;  // Expected result is 11
        Assert.assertEquals("The calculated result is incorrect!", expectedResult, result);

        // Step 8: Close the browser
        waitAndClose();
    }
}
