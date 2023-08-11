package day04;

import utility.MyFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        // OOP WebDriver:Interface,Parent Class        ChromeDriver,FirefoxDriver,EdgeDriver:  child class
        WebDriver driver = new ChromeDriver(); // driver = browser
//        WebDriver driver2= new FirefoxDriver();
//        WebDriver driver3= new EdgeDriver();

        driver.get("https://techno.study/tr"); //  open web page


        MyFunction.wait(3);
        //driver.close(); // closes the currently active open browser, erases from memory
        driver.quit(); // While the program is running, it both closes and deletes all opened browsers from memory
    }

/**
 * To remove the redness that is not an error but occurs when you run:
 * org.slf4j:slf4j-nop:1.7.30    ---> Add to project library from maven repository
 */
}
