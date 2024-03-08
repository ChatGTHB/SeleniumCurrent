package day12;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;

public class _02_Question extends BaseDriver {

    /**
     Scenario :
     Go to https://chercher.tech/practice/frames,
     Write Türkiye in the first box that appears on the screen.
     Then select the avatar from the animals options.
     */

    /**
     Senaryo :
     https://chercher.tech/practice/frames sitesine gidiniz,
     Ekranda gözüken ilk kutucuğa Türkiye yazınız.
     Daha sonra animals seçeneklerinden avatarı seçiniz.
     */

    @Test
    public void test() {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);   // Passed to the first frame.

        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        // driver.switchTo().parentFrame(); // go back to parent
        driver.switchTo().defaultContent(); // go directly to homepage
        driver.switchTo().frame(1);   // I switched to the second frame.

        WebElement animalsSelect = driver.findElement(By.id("animals"));

        Select objectSelect = new Select(animalsSelect);
//        objectSelect.selectByVisibleText("Avatar");
//        objectSelect.selectByValue("avatar");
        objectSelect.selectByIndex(3);

        waitAndClose();
    }
}











