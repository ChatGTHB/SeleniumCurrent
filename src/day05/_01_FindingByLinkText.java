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
//    partialLinkText with linkText works ONLY in -a- tags
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // linkText
        WebElement myOrdersLink=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("myOrdersLink.getText() = " + myOrdersLink.getText());

        // partialLinkText
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        System.out.println("myOrdersLink.href = " + myOrdersLink.getAttribute("href"));
        System.out.println("myOrdersLink.title = " + myOrdersLink.getAttribute("title"));
        System.out.println("myOrdersLink.rel = " + myOrdersLink.getAttribute("rel"));

        MyFunction.wait(5);
        driver.quit();
    }


}
