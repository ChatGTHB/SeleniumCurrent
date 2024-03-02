package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _09_ActionKeyControlSendKeys extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox = driver.findElement(By.id("autoCompleteMultipleContainer"));
        MyFunction.wait(3);

        new Actions(driver).moveToElement(textBox)  // come to the box
                .click()                       // click
                .keyDown(Keys.SHIFT)      // press shift
                .sendKeys("k")          // send letter "k"
                .keyUp(Keys.SHIFT)        // let go of shift
                .sendKeys("erem")       // "erem" send remaining name
                .build()                      // prepare the action
                .perform();                   // perform the operation.

        waitAndClose();
    }
}
