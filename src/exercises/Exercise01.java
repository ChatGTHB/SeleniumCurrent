package exercises;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class Exercise01 extends BaseDriver {

    /**
     1- Open https://formsmarts.com/form/yu?mode=h5
     2- Checked the Business.
     3- Click on discover XYZ and select Online Advertising
     4- Choose every day
     5- Choose good
     6- Click using XYZ and choose option 3
     Css Selector
     Put MyFunction.wait(2); between each click vs action
     */

    @Test
    public void formTest() {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        WebElement dropDownDiscover = driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();

        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        WebElement everyDayRadio = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        everyDayRadio.click();

        WebElement goodRadio = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        WebElement dropdownHowLong = driver.findElement(By.cssSelector("select[id$='_4597']"));
        dropdownHowLong.click();

        WebElement option3 = driver.findElement(By.cssSelector("select[id$='_4597']> :nth-child(3)"));
        option3.click();

        goodRadio.click();

        waitAndClose();
    }
}
