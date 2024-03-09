package day14;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BaseDriver;

public class _01_B_ShadowRoot extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://itytest.ccngroup.com.tr/Era/LoginPage?ReturnUrl=%2FEra");

        WebElement shadowHost = driver.findElement(By.xpath("(//dxbl-input-editor)[1]"));
        WebElement usernameField = shadowHost.findElement(By.xpath("(//dxbl-input-editor)[1]/input"));

        wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        usernameField.sendKeys("username");

        waitAndClose();
    }
}
