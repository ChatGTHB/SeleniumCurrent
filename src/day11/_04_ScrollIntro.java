package day11;


import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utility.BaseDriver;
import utility.MyFunction;

public class _04_ScrollIntro extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunction.wait(2);

        //Actions actionDriver= new Actions(driver);         // We produced a driver that can run action from the driver.

        JavascriptExecutor js = (JavascriptExecutor) driver; // Casting

        js.executeScript("window.scrollTo(0, 500);");  // x, y  : Goes to the given place

        MyFunction.wait(2);
        js.executeScript("window.scrollBy(0, 500);");  // 500 more goes from where it last left off

        MyFunction.wait(2);
        js.executeScript("window.scrollBy(0, -200);"); // Goes back 200 from where it last left off

        waitAndClose();
    }
}
