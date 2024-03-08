package day13;


import org.junit.Test;
import org.openqa.selenium.WindowType;
import utility.BaseDriver;
import utility.MyFunction;

public class _03_WindowsNew extends BaseDriver {

    @Test
    public void test(){

        driver.get("https://www.selenium.dev/");
        MyFunction.wait(2);

        driver.switchTo().newWindow(WindowType.TAB);  // Opens a new BLANK tab.
        // How do we call https://www.facebook.com/ in the newly opened tab?
        // Since I am in the new tab that opens, I can only open the new page with driver.get.
        driver.get("https://www.facebook.com/");

        MyFunction.wait(2);
        waitAndClose();
    }
}
