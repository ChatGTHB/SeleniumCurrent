package day08;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class _03_Question extends BaseDriver {

    @Test
    public void test() {

        /**
         Test Scenario

         1- Go to https://www.facebook.com/
         2- Click CreateNewAccount.
         3- In the new window that opens, enter your name, surname and email.
         4- Select your date of birth with the Select class
         */

        driver.get("https://www.facebook.com/");

        MyFunction.wait(1);
        /**
         List<WebElement> cookiesDecline = driver.findElements(By.xpath("//*[text()='İsteğe bağlı çerezleri reddet']")));
         if (cookiesDecline.size() > 0) {
         cookiesDecline.get(0).click();
         }
         */

        List<WebElement> cookiesDecline = driver.findElements(By.xpath("//*[text()='İsteğe bağlı çerezleri reddet']"));
        if (!cookiesDecline.isEmpty()) {
            cookiesDecline.get(0).click();
        }

        MyFunction.wait(1);
        WebElement newAccountButton = driver.findElement(By.xpath("//*[@id='login_link']/a[2]"));
        newAccountButton.click();

        MyFunction.wait(1);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Kerem");

        MyFunction.wait(1);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Said");

        MyFunction.wait(1);
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("keremsaidr@gxmail.com");

        WebElement webDay = driver.findElement(By.id("day"));
        WebElement webMonth = driver.findElement(By.id("month"));
        WebElement webYear = driver.findElement(By.id("year"));

        Select day = new Select(webDay);
        Select month = new Select(webMonth);
        Select year = new Select(webYear);

        day.selectByVisibleText("21");
        month.selectByValue("3");
        year.selectByVisibleText("1975");

        MyFunction.wait(3);
        waitAndClose();
    }
}
