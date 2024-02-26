package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _05_ActionClickTest extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://demoqa.com/buttons");

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver);// Web page opened for action.

        //clickButton.click()
        Action action = actions.moveToElement(clickButton).click().build();
        // Go to click on the element, wait there, prepare the action.
        System.out.println("The action is prepared");
        MyFunction.wait(4);
        action.perform(); // The action is happening. process, apply.
        System.out.println("Action has taken place");

        // short form --> actions.moveToElement(element).click().build().perform();

        waitAndClose();
    }
}
