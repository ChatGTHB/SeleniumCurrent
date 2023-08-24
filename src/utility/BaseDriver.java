package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    static {  // The condition of this is that it is extends and takes place in the first place.

        Logger logger = Logger.getLogger(""); // Get output logs.
        logger.setLevel(Level.SEVERE);             // Show only ERRORs

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // It maximizes the screen.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 30 sec delay: time to load the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // 30 sec delay: time to find the element
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void waitAndClose() {
        MyFunction.wait(5);
        driver.quit();
    }
}

//  Java fast - Website slow
//  It tries to find the java element, but the website is still loading, it says I couldn't find java before the site is loaded, and it ends,
//  When trying to find web element (FindElement/s) -->
//  Solution 1: we will give some time (20s)

//  Thread.sleep(); -> It stops Java directly for the given time. The more seconds you give, the more it stops the program. That's why it doesn't work for us.
//  For example, we gave him 20 seconds to exit when he finds us, we want him to find java at 10 seconds and exit, not to wait 20 seconds.