package day11;


import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utility.BaseDriver;
import utility.MyFunction;

public class _05_ScrollToBottomOfThePage extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        MyFunction.wait(2);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // Goes to the end of the page.

        MyFunction.wait(2);
        js.executeScript("window.scrollTo(0, 0);");                          // Go to the top of the page.

        waitAndClose();
    }
}
