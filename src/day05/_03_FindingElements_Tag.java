package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

import java.util.List;

public class _03_FindingElements_Tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.amazon.com.tr/");

        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        // Find all elements with -a- tag

        for (WebElement element : linkler) {
            if (!element.getText().isEmpty() && element.getAttribute("href") != null) {
                System.out.println("element.getText() = " + element.getText());
            }
        }

        waitAndClose();
    }
}
