package day12;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;

public class _03_Question extends BaseDriver {

    /**
     1-driver.get("https://chercher.tech/practice/frames"); go to page.
     2-Input the country name
     3-Check the CheckBox.
     4-Select the 2nd element of Select.
     */

    /**
     * 1-driver.get("https://chercher.tech/practice/frames"); sayfasına gidiniz.
     * 2-Inputa ülke adı yazınız
     * 3-CheckBox ı çekleyiniz.
     * 4-Select in 2.elemanını seçiniz.
     */

    @Test
    public void test() {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // Moved to the first frame.

        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        // I'm inside the 1st frame right now, I'll go to the frame inside it.
        // Index 0 because there is only 1
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

//        driver.switchTo().parentFrame();  // One back
        driver.switchTo().defaultContent(); // Went directly to the home page
        driver.switchTo().frame(1);   // Moved to frame 2.

        WebElement animalsSelect = driver.findElement(By.id("animals"));
        Select objectSelect = new Select(animalsSelect);
        objectSelect.selectByIndex(1); // 2nd element : 1 as index

        waitAndClose();
    }
}
