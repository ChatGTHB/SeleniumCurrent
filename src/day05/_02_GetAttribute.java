package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunction;

public class _02_GetAttribute {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // linkText: The visible text of the link is used as a selector.
        WebElement myOrdersLink = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("myOrdersLink.getText() = " + myOrdersLink.getText());

        // I can access the properties of the element with getAttribute (valid for all tags).
        System.out.println("myOrdersLink.href = " + myOrdersLink.getAttribute("href"));
        System.out.println("myOrdersLink.title = " + myOrdersLink.getAttribute("title"));
        System.out.println("myOrdersLink.rel = " + myOrdersLink.getAttribute("rel"));

        MyFunction.wait(5);
        driver.quit();
    }
}
