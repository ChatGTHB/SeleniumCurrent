package day13;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class _01_ShadowContent extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://www.akakce.com/");
        MyFunction.wait(2);

        WebElement shadowWebParent = driver.findElement(By.className("efilli-layout-tuttur"));

        SearchContext shadowContent = shadowWebParent.getShadowRoot(); // I got the shadow
        // Its content is same HTML, now let's findElement inside it

        WebElement acceptButton = shadowContent.findElement(By.cssSelector(".banner__accept-button"));
        System.out.println("acceptButton.getText() = " + acceptButton.getText());
        acceptButton.click();

        waitAndClose();
    }
}









