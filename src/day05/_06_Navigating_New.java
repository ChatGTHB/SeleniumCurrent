package day05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _06_Navigating_New extends BaseDriver {

    @Test
    public void test01() {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunction.wait(2);

        WebElement element = driver.findElement(By.id("alerttest"));
        element.click();                             // It went to the new page.
        MyFunction.wait(2);

        driver.navigate().back();
        MyFunction.wait(2);

        driver.navigate().forward();

        waitAndClose();
    }
}

