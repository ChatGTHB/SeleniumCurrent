package day10;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class _02_ActionHoverOverQuestion extends BaseDriver {

    //    Go to https://www.etsy.com/
    //    Jewellery -> Necklaces -> Bib Necklaces click
    //    Verify that the URL includes the word bib-necklaces after the click.

    @Test
    public void Test() {

        driver.get("https://www.etsy.com/");

        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (!cookiesAccept.isEmpty()) {    // if any
            cookiesAccept.get(0).click(); // close,click
        }

        WebElement jewellery = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement necklaces = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibnecklaces = driver.findElement(By.id("catnav-l3-10881"));

        Actions actionDriver = new Actions(driver);

        MyFunction.wait(2);
        actionDriver.moveToElement(jewellery).build().perform();

        MyFunction.wait(2);
        actionDriver.moveToElement(necklaces).build().perform();

        MyFunction.wait(2);
        bibnecklaces.click();
        //actionDriver.moveToElement(bib-necklaces).click().build().perform();

        MyFunction.wait(2);
        Assert.assertTrue("Bib-necklace word not found in URL", driver.getCurrentUrl().contains("bib"));

        waitAndClose();
    }
}
