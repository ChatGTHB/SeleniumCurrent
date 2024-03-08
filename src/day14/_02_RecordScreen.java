package day14;


import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_RecordScreen extends BaseDriver {

    @Test
    public void test() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunction.wait(2);

        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("1234");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMessage = driver.findElements(By.xpath("//*[text()='Invalid credentials']"));

        if (!errorMessage.isEmpty()) { // If there is an error: I want to save a screenshot

            System.out.println("There was a mistake");

            // Record Screen

            TakesScreenshot ts = (TakesScreenshot) driver;           // Stage 1 --> I defined the screenshot variable
            File memoryState = ts.getScreenshotAs(OutputType.FILE);  // Stage 2 --> Screenshot taken, in memory
            // Save screenshot in file format: "get screenshot as file"

            // Stage 3 --> I need to save the screenshot in memory to physical file.
            // Save the screen recording in the memory, the path and the file I named
            FileUtils.copyFile(memoryState, new File("C:\\Users\\cihat\\Desktop\\Sundry\\Screenshots\\screenshot.png"));

            // TODO : Do something so that each screen recording is recorded SEPARATELY.
        }
        waitAndClose();
    }
}
