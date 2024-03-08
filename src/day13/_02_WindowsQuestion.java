package day13;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;
import java.util.Set;


public class _02_WindowsQuestion extends BaseDriver {

    /**
     * Scenario:
     * Click on the links opened in a separate tab at https://www.selenium.dev/.
     * Print the title and url of the pages in all new tabs that are opened.
     * Then close all other pages except the Homepage.
     * <p>
     * *****************************************************************************
     * <p>
     * Senaryo:
     * https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
     * Açılan bütün yeni tablardaki sayfaların title ve url'lerini yazdırınız.
     * Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
     */

    @Test
    public void Test() {

        driver.get("https://www.selenium.dev/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String mainPageWindowId = driver.getWindowHandle(); // I got the id of the home page, before the others open

        // I got all the a tags that are _blank
        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        // I clicked on the links that will open a page in a new tab
        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mail")) {
                js.executeScript("arguments[0].click();", link);
            }
        }

        // I got the IDs of the windows in all the new tabs that were opened.
        Set<String> windowsIds = driver.getWindowHandles();

        // Each tab is passed and the title and url are printed
        for (String id : windowsIds) {
            driver.switchTo().window(id);
            System.out.println("title=" + driver.getTitle() + ", url=" + driver.getCurrentUrl());
            if (id.equals(mainPageWindowId)) {
                continue;// If the id of the home page comes up, skip it.
            }
            driver.switchTo().window(id);
            driver.close();
        }

        waitAndClose();
    }
}