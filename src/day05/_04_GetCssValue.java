package day05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _04_GetCssValue extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));

        // We use getAttribute to access the attributes of the element.
        System.out.println("inputValEnter.getAttribute(class) = " + inputValEnter.getAttribute("class"));

        // GetCssValue is used to get CSS-Shaping values that correspond to Class
        System.out.println("inputValEnter.getCssValue(color) = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(font-size) = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(background) = " + inputValEnter.getCssValue("background"));

        waitAndClose();
    }
}
