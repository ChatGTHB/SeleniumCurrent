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
import java.text.SimpleDateFormat;
import java.util.Date;
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

            TakesScreenshot ts = (TakesScreenshot) driver;                  // Stage 1 --> I defined the screenshot variable
            File memoryState = ts.getScreenshotAs(OutputType.FILE);  // Stage 2 --> Screenshot taken, in memory
            // Save screenshot in file format: "get screenshot as file"

            // Stage 3 --> I need to save the screenshot in memory to physical file.
            // Save the screen recording in the memory, the path and the file I named
            FileUtils.copyFile(memoryState, new File("C:\\Users\\cihat\\Desktop\\Sundry\\Screenshots\\screenshot.png"));
        }
        waitAndClose();
    }


    // TODO : Do something so that each screen recording is recorded SEPARATELY.

    /**
     To ensure that each screen recording is saved separately,
     you can modify your code by adding a timestamp to the file name.
     This will make each screenshot file unique.
     */
    @Test
    public void todoTest() throws IOException {

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

            TakesScreenshot ts = (TakesScreenshot) driver;                 // Stage 1 --> I defined the screenshot variable
            File memoryState = ts.getScreenshotAs(OutputType.FILE);  // Stage 2 --> Screenshot taken, in memory
            // Save screenshot in file format: "get screenshot as file"

            // Stage 3 --> I need to save the screenshot in memory to physical file.
            // Save the screen recording in the memory, the path and the file I named
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "screenshot_" + timestamp + ".png";
            FileUtils.copyFile(memoryState, new File("C:\\Users\\cihat\\Desktop\\Sundry\\Screenshots\\" + fileName));
        }
        waitAndClose();

        /**
         In this updated code, I added the following lines:

         String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
         String fileName = "screenshot_" + timestamp + ".png";

         These lines generate a timestamp using the current date and time
         and format it as "yyyyMMdd_HHmmss" (e.g., 20240309_153012).

         Then, I concatenate the timestamp with the file name
         to create a unique file name for each screenshot.

         FileUtils.copyFile(memoryState, new File("C:\\Users\\cihat\\Desktop\\Sundry\\Screenshots\\" + fileName));

         Finally, I use the updated file name when saving the screenshot file to ensure that each screen recording is recorded separately.
         */
    }
}
