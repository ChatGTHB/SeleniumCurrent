package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _05_ActionHoverTest extends BaseDriver {

    @Test
    public void test() {
        driver.get("https://www.hepsiburada.com/");

        Actions actions = new Actions(driver);
        MyFunction.wait(2);

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        Action action = actions.moveToElement(element).build(); // hover over element
        action.perform(); // enable it.

        // new Actions(driver).moveToElement(element).build().perform();

        waitAndClose();
    }
}
