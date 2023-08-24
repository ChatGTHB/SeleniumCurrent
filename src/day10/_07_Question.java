package day10;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class _07_Question extends BaseDriver {

    /**
     Senaryo:
     https://google.com/ da selenium kelimesini aratınız.
     ilk çıkan sonuca tıklatıp, çıkan URL yi ekrana yazdırınız.
     Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız

     ===============*************************======================

     Scenario:
     Search for selenium on https://google.com/.
     Click on the first result and print the resulting URL to the screen.
     Verify that the expected url is https://www.selenium.dev/
     */

    @Test
    public void Test() {

        driver.get("https://www.google.com/");

        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[@id='L2AGLb']"));
        if (!cookiesAccept.isEmpty()) //
            cookiesAccept.get(0).click();

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium" + Keys.ENTER);

//        WebElement searchButton=driver.findElement(By.name("btnK"));
//        searchButton.click();  // Instead of these 2 lines, the ENTER key was sent above.

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/h3)[1]")));
        WebElement link1 = driver.findElement(By.xpath("(//a/h3)[1]"));
        link1.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));

        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://www.selenium.dev/"));

        waitAndClose();

        // TODO:  selenium yazısını göndermeyi ve ENTER a basmasını Actions la yapınıw,
    }
}
