package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunction;

public class _01_FindingByLinkText {

//    id    -> By.Id()
//    name  -> By.name
//    class -> By.class
//
//    partialLinkText and linkText works ONLY in -a- tags

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // linkText: The visible text of the link is used as a selector.
        WebElement myOrdersLink = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("myOrdersLink.getText() = " + myOrdersLink.getText());

        // partialLinkText: You can use a part of the visible text of the link as a selector.
        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        MyFunction.wait(5);
        driver.quit();
    }
}
