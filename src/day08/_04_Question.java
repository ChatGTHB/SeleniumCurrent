package day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;
import utility.MyFunction;

public class _04_Question extends BaseDriver {
    /**
     Test Scenario:

     1- Go to https://www.ebay.co.uk/ page
     2- Select the Baby option from the categories.
     3- Click on the search button.
     4- Verify that the word Baby is mentioned in the left title section on the screen where the results appear
     */


    @Test
    public void Test1() {
        driver.get("https://www.ebay.co.uk/");
        MyFunction.wait(2);

        WebElement webSelect = driver.findElement(By.id("gh-cat"));
        Select javaSelect = new Select(webSelect);
        javaSelect.selectByValue("2984");
        MyFunction.wait(2);

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();
        MyFunction.wait(2);

        WebElement headerText = driver.findElement(By.className("b-pageheader__text"));

        Assert.assertTrue("The searched word could not be found", headerText.getText().contains("Baby"));

        waitAndClose();
    }
}
