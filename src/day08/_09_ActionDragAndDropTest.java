package day08;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _09_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions driverAction = new Actions(driver);

        MyFunction.wait(2);
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        // 1st method
        driverAction.dragAndDrop(oslo, norway).build().perform();
        // take oslo take it to norway drop it

        // 2nd method: 2-stage
        driverAction.clickAndHold(oslo).build().perform(); // Take Oslo
        driverAction.moveToElement(norway).release().build().perform(); // Take it over Norway and drop it off

        waitAndClose();
    }
}
