package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BaseDriver;

public class _01_B_ShadowRoot extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://itytest.ccngroup.com.tr/Era/LoginPage?ReturnUrl=%2FEra");

        WebElement shadowHost = driver.findElement(By.xpath("(//dxbl-input-editor)[1]"));
        WebElement usernameField = shadowHost.findElement(By.xpath("(//dxbl-input-editor)[1]/input"));

        wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        usernameField.sendKeys("username");

        waitAndClose();

//        WebElement shadowHost = driver.findElement(By.xpath("(//dxbl-input-editor)[1]"));
//        SearchContext shadowRoot=shadowHost.getShadowRoot();
//
//        WebElement usernameField = shadowRoot.findElement(By.xpath("(//dxbl-input-editor)[1]/input"));
//        wait.until(ExpectedConditions.elementToBeClickable(usernameField));
//        usernameField.sendKeys("username");
//
//        waitAndClose();


//        WebElement shadowHost = driver.findElement(By.xpath("(//*[@class='dxbl-col-md-12 dxbl-col dxbl-fl-item'])[2]"));
//
//
//        WebElement shadowHost2 =shadowHost.findElement(By.cssSelector("#idd506e729-314a-4ff0-b9d2-122af1d0c916"));
//        SearchContext secondShadowRoot=shadowHost2.getShadowRoot();
//
//        WebElement input = secondShadowRoot.findElement(By.id("id1a189413-51d3-42f3-a27f-3e0a783d3184"));
//        input.sendKeys("ali");


//        WebElement shadowHost = driver.findElement(By.xpath("(//*[@class='dxbl-col-md-12 dxbl-col dxbl-fl-item'])[2]"));
//        MyFunction.wait(5);
//        SearchContext shadowRoot1=shadowHost.getShadowRoot();
//        MyFunction.wait(5);


//        WebElement shadowHost2 = driver.findElement(By.className("dxbl-text-edit"));
//        SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
//        WebElement input = shadowRoot2.findElement(By.className("dxbl-text-edit-input"));
//        input.sendKeys("deneme");

        //        MyFunction.wait(2);
//
//        WebElement shadowHost = driver.findElement(By.className("dxbl-text-edit"));
//        WebElement input = shadowHost.findElement(By.className("dxbl-text-edit-input"));
//        input.sendKeys("Kerem Said");

    }
}
