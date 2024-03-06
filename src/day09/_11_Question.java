package day09;


//    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
//    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
//    tıklatma işleminden sonra URL de
//    kombi kelimesinin geçtiğini doğrulayın.


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BaseDriver;
import utility.MyFunction;

import java.util.List;

public class _11_Question extends BaseDriver {

    @Test
    public void test() {

        Actions actions = new Actions(driver);

        driver.get("https://www.mediamarkt.com.tr/");

        List<WebElement> consent = driver.findElements(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']//p"));
        if (!consent.isEmpty()) {
            consent.get(0).click();
        }

        WebElement allCategories = driver.findElement(By.xpath("//*[@id='header']/header/div[3]/div[1]/a"));    // a linktext
        WebElement whiteGoods = driver.findElement(By.xpath("//*[@id='header']/header/div[3]/div[1]/ul/li[6]/a")); // a linktext
        WebElement combiBoilers = driver.findElement(By.xpath("//*[@id='submenu-cat6']/div/ul[3]/li[5]/a"));  //a linktext

        actions.moveToElement(allCategories).build().perform();
        MyFunction.wait(2);
        actions.moveToElement(whiteGoods).build().perform();
        MyFunction.wait(2);

        actions.click(combiBoilers).build().perform();
        // combiBoilers.click();

        String url = driver.getCurrentUrl();

        Assert.assertTrue("The word combi boiler could not be found in the URL.", url.contains("kombi"));

        waitAndClose();
    }
}
