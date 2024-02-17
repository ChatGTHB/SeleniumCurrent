package day03;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunction;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
                       //new FirefoxDriver();
                       //new EdgeDriver();

        driver.get("https://techno.study/tr");  // open web page


        MyFunction.wait(3);
        // waiting
        driver.quit();
    }
}
