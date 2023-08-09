package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.hepsiburada.com");

    }
}
