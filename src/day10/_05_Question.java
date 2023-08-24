package day10;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BaseDriver;

public class _05_Question extends BaseDriver {

    /**
     * Go to this site. http://demo.seleniumeasy.com/ajax-form-submit-demo.html
     * Enter Name.
     * Enter comments.
     * Click on Submit.
     * Form submitted Successfully! text should be displayed.
     * Check with Assert
     * (Do not use XPath)
     *
     *=========================*******************************=======================
     *
     * Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
     * Name giriniz.
     * Comment giriniz.
     * Submit'e tıklayınız.
     * Form submited Successfully! yazısı görüntülenmelidir.
     * Assert ile kontrol ediniz
     * (XPath kullanmayınız)
     */

    @Test
    public void Test() {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("Customer Happiness");

        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("My new product turned out quite well, thank you.");

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));
        WebElement message = driver.findElement(By.id("submit-control"));

        Assert.assertTrue("Searched Message not found", message.getText().equals("Form submited Successfully!"));

        waitAndClose();
    }
}












