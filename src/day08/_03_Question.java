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
         5- Verify with assert that an input that asks you to re-enter the email pops up, does not appear before, and then appears.
         */

        driver.get("https://www.facebook.com/");

        MyFunction.wait(1);
        /**
         List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("[data-testid='cookie-policy-manage-dialog-accept-button']"));
         if (cookiesAccept.size() > 0) {
         cookiesAccept.get(0).click();
         }
         */

        List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("[data-testid='cookie-policy-manage-dialog-accept-button']"));
        if (!cookiesAccept.isEmpty()) {
            cookiesAccept.get(0).click();
        }

        MyFunction.wait(1);
        WebElement newAccountButton = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        newAccountButton.click();

        MyFunction.wait(1);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Kerem");

        MyFunction.wait(1);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Said");

        MyFunction.wait(1);
        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse("ReEmail appeared = ", reEmail.isDisplayed());

        MyFunction.wait(1);
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("keremsaidr@gxmail.com");

        MyFunction.wait(1);
        Assert.assertTrue("ReEmail did not appear = ", reEmail.isDisplayed());

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
