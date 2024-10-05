package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class _07_DragAndDropBy extends BaseDriver {

    @Test
    public void test() {
        Actions actions = new Actions(driver);

        // dragAndDropBy: Scrolls the WebElement vertically or horizontally.
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        List<WebElement> consent = driver.findElements(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']//p"));
        if (!consent.isEmpty()) {
            consent.get(0).click();
        }

        WebElement leftSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunction.wait(2);
        // dragAndDropBy(WebElement,X ,Y) x: in the horizontal direction, y: in the vertical direction

        Action action = actions.dragAndDropBy(leftSlider, 100, 0).build(); // moved 100 units in the horizontal direction
        action.perform();                                                                       // 0 : no possibility to move vertically
        //  + It moves to the right when we enter a value, - to the left when we enter a value
        //  actions.dragAndDropBy(leftSlider, 100, 0).build().perform();

        // TODO : Move the left slider to 200, the right slider to 400.

        WebElement sliderRange = driver.findElement(By.xpath("//*[@id='slider-range']"));
        int sliderRangeWidth = sliderRange.getSize().width;
        System.out.println("sliderRangeWidth = " + sliderRangeWidth);

        WebElement rightSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
        actions.dragAndDropBy(rightSlider, 101, 0).build().perform();
        // TODO ---> Done

        waitAndClose();
    }
}
