package day14;


import org.junit.Test;
import org.openqa.selenium.Dimension;
import utility.BaseDriver;
import utility.MyFunction;

public class _03_WindowSize extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://www.youtube.com/");
        MyFunction.wait(5);

        driver.manage().window().maximize();
        Dimension screenDimension = driver.manage().window().getSize();
        System.out.println("screenDimension.width = " + screenDimension.width);
        System.out.println("screenDimension.height = " + screenDimension.height);

        MyFunction.wait(5);
        Dimension newDimension = new Dimension(516, 600);

        driver.manage().window().setSize(newDimension); // I bring the window on the screen to the desired dimensions and start the test like that.

        //  Tests....

        waitAndClose();
    }
}
