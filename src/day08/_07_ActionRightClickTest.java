package day08;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _07_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        MyFunction.wait(2);

        Actions actions = new Actions(driver);
        Action action = actions.contextClick(rightClickButton).build();
        action.perform();

        //actions.moveToElement(rightClickButton).contextClick().build();
        waitAndClose();
    }
}
