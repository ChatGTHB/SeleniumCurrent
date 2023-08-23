package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

public class _01_DragAndDropBy extends BaseDriver {

    @Test
    public void Test1() {

        // dragAndDropBy: Scrolls the WebElement vertically or horizontally.
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions actions = new Actions(driver);

        WebElement leftSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunction.wait(2);
        // dragAndDropBy(WebElement,X , Y) x: in the horizontal direction, y: in the vertical direction
        Action action = actions.dragAndDropBy(leftSlider, 100, 0).build();// moved 100 units in the horizontal direction
        action.perform();                                     // 0 : no possibility to move vertically
        // + It moves to the right when we enter a value, - to the left when we enter a value
        //actions.dragAndDropBy(leftSlider, 100, 0).build().perform();

        waitAndClose();

        // TODO : Move the left slider to 200, the right slider to 400.
        // int width=leftSlider.getSize().width;
    }
}
