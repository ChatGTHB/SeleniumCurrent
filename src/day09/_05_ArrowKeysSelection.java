package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _05_ArrowKeysSelection extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox = driver.findElement(By.id("autoCompleteSingleContainer"));
        MyFunction.wait(3);

        Actions actionDriver = new Actions(driver);

        // Go to element, click inside and send "b"
        actionDriver
                .moveToElement(textBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();

        MyFunction.wait(2);

        actionDriver
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        waitAndClose();
    }

}
