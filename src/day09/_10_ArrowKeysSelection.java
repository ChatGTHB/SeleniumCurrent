package day09;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class _10_ArrowKeysSelection extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://demoqa.com/auto-complete");

        List<WebElement> consent = driver.findElements(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']//p"));
        if (!consent.isEmpty()) {
            consent.get(0).click();
        }

        WebElement textBox = driver.findElement(By.id("autoCompleteSingleInput"));
        MyFunction.wait(2);

        // textBox a git, içine tıklat, b hrfine bas, aşağı yön tuşuna bas, enter a bas.
        Actions actions = new Actions(driver);

        actions
                .moveToElement(textBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();

        // Tuşa basıldığında seçeneklerin çıkması için bir süre gerekiyor
        MyFunction.wait(2);

        actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        waitAndClose();
    }

}
