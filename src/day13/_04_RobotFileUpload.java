package day13;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BaseDriver;
import utility.MyFunction;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class _04_RobotFileUpload extends BaseDriver {

    @Test
    public void Test() throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");
        MyFunction.wait(1);

        // acceptAll
        WebElement iframe = driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(iframe);

        List<WebElement> acceptAll =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Accept All']")));

        if (!acceptAll.isEmpty()) {
            acceptAll.get(0).click();
        }

        /*********************/


        Robot robot = new Robot();

        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Method to copy string to memory
        StringSelection filePath = new StringSelection("C:\\Users\\cihat\\Desktop\\Sundry\\filePath.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        MyFunction.wait(1);
        robot.keyPress(KeyEvent.VK_CONTROL); // These two keys are currently pressed, pasted in memory
        robot.keyPress(KeyEvent.VK_V);

        MyFunction.wait(1);
        robot.keyRelease(KeyEvent.VK_CONTROL); // Keys released
        robot.keyRelease(KeyEvent.VK_V);

        MyFunction.wait(1);
        robot.keyPress(KeyEvent.VK_ENTER); // File sent by pressing Enter
        robot.keyRelease(KeyEvent.VK_ENTER);

        MyFunction.wait(1);
        // I reached CheckBox by pressing tab twice.
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        // I checked it by pressing space
        MyFunction.wait(1);
        robot.keyPress(KeyEvent.VK_SPACE); // Checked
        robot.keyRelease(KeyEvent.VK_SPACE);

        MyFunction.wait(1);
        // I reached the OK button by pressing tab 2 times.
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        MyFunction.wait(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(message.isDisplayed());

        waitAndClose();
    }
}
