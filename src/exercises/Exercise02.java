package exercises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class Exercise02 extends BaseDriver {

    /**
          Scenario
          1- https://www.saucedemo.com/
          2- Do the login process.
          3- Click Sauce Labs Backpack and add to cart.
          4- Then go back (click Back to products)
          5- Click Sauce Labs Bolt T-Shirt and add to cart.
          6- Click to cart
          7- Click CheckOut
          8- Fill in the user information and click Continue
          9- Here, test with Assert whether the sum of the costs of each item is equal to the Item total below.
         10- Put MyFunction.wait(); between each click vs action

          XPATH will be used entirely in this question.
     */

    @Test
    public void cartTest01() {

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

        WebElement backButton = driver.findElement(By.xpath("//*[@id='back-to-products']"));
        backButton.click();
        MyFunction.wait(2);

        //2. Product added to cart
        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();
        MyFunction.wait(2);

        WebElement addToCart2 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();
        MyFunction.wait(2);

        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();
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

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='continue']"));
        continueButton.click();
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
        WebElement itemTotalElement = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double itemTotal = Double.parseDouble(itemTotalElement.getText().replaceAll("[^0-9,.]", ""));
        System.out.println("itemTotal = " + itemTotal);

        Assert.assertEquals("Values are not equal", total, itemTotal, 0.0);

        waitAndClose();
    }
}
