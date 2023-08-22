package day08;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _06_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        MyFunction.wait(2);

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(doubleClickButton).doubleClick().build();
        action.perform();

        waitAndClose();

        // short form --> actions.doubleClick(doubleClickButton).build().perform();
    }
}
