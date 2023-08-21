package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class _02_Scenario extends BaseDriver {

//     Scenario
//     1- https://www.saucedemo.com/
//     2- Do the login process.
//     3- Click Sauce Labs Backpack and add to cart.
//     4- Then go back (click Back to products)
//     5- Click Sauce Labs Bolt T-Shirt and add to cart.
//     6- Click to cart
//     7- Click CheckOut
//     8- Fill in the user information and click Continue
//     9- Here, test with Assert whether the sum of the costs of each item is equal to the Item total below.
//
//     XPATH will be used entirely in this question.

    @Test
    public void Cart_Test1() {

        driver.get("https://www.saucedemo.com/");

        MyFunction.wait(1);
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        MyFunction.wait(1);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunction.wait(1);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        MyFunction.wait(2);

        // 1. Product added to cart
        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();
        MyFunction.wait(2);

        WebElement addToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();
        MyFunction.wait(2);

        WebElement btnBack = driver.findElement(By.xpath("//*[@id='back-to-products']"));
        btnBack.click();
        MyFunction.wait(2);

        //2. Product added to cart
        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();
        MyFunction.wait(2);

        WebElement addToCart2 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();
        MyFunction.wait(2);

        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        MyFunction.wait(2);

        WebElement buttonCheckOut = driver.findElement(By.xpath("//*[@id='checkout']"));
        buttonCheckOut.click();
        MyFunction.wait(2);

        // Entering user information
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Kerem");
        MyFunction.wait(1);

        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Said");
        MyFunction.wait(1);

        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("323232");
        MyFunction.wait(1);

        WebElement btnContinue = driver.findElement(By.xpath("//*[@id='continue']"));
        btnContinue.click();
        MyFunction.wait(2);

        // Control of price totals of products
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double total = 0;
        for (WebElement price : prices) {
            System.out.println(price.getText());
            total = total + Double.parseDouble(price.getText().replaceAll("[^0-9,.]", ""));
        }
        System.out.println("total = " + total);

        // item total taken and converted to double
        WebElement itemtotalElement = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        Double itemtotal = Double.parseDouble(itemtotalElement.getText().replaceAll("[^0-9,.]", ""));
        System.out.println("itemtotal = " + itemtotal);

        Assert.assertTrue("Values are not equal", total == itemtotal);

        waitAndClose();
    }
}
