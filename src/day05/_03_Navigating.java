package day05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _03_Navigating extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        MyFunction.wait(3);
        WebElement element = driver.findElement(By.id("alerttest"));
        element.click();                             // It went to the new page.
        MyFunction.wait(3);

        System.out.println(driver.getCurrentUrl());  // Returns the URL you are currently in.

        driver.navigate().back();
        MyFunction.wait(3);
        System.out.println(driver.getCurrentUrl());  // Returns the URL you are currently in.

        driver.navigate().forward();
        MyFunction.wait(3);
        System.out.println(driver.getCurrentUrl());  // Returns the URL   you are currently in.
        System.out.println(driver.getTitle());       // Returns the TITLE you are currently in.

        waitAndClose();
    }
}
