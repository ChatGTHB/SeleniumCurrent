package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

import java.util.List;

public class _02_FindingElements_Tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        // Find all elements with -a- tag

        for (WebElement e : linkler) {

            if (!e.getText().equals("")) {
                System.out.println("e.getText() = " + e.getText());
            }

        }
        waitAndClose();
    }
}
