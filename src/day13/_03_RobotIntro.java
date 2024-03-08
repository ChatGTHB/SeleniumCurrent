package day13;


import org.junit.Test;
import utility.BaseDriver;
import utility.MyFunction;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/**
 * Interview Question
 * How do you control windows windows.
 * I'll check with ROBOT Class.,
 * <p>
 * **********************************************************************************
 * <p>
 * Mülakat Sorusu
 * Windows pencerelerini nasıl kontrol edersin.
 * ROBOT Class la kontrol ederim.
 */


public class _03_RobotIntro extends BaseDriver {

    @Test
    public void Test() throws AWTException {

        driver.get("https://www.google.com/");
        MyFunction.wait(2);

        Robot robot = new Robot();

        // Java ROBOT class
        robot.keyPress(KeyEvent.VK_CONTROL);     // Press CTRL,
        robot.keyPress(KeyEvent.VK_T);           // Press T while this is pressed
        robot.keyRelease(KeyEvent.VK_T);         // Drop the T,
        robot.keyRelease(KeyEvent.VK_CONTROL);   // Release CTRL
        // New window opened?

        MyFunction.wait(2);
        // Selenium windows handle switchTo
        // Switch to the newly opened tab.
        Set<String> windowsIDS = driver.getWindowHandles();
        Iterator iterator = windowsIDS.iterator();
        String firstTab = iterator.next().toString();
        String secondTab = iterator.next().toString();
//        System.out.println("firstTab = " + firstTab);
//        System.out.println("secondTab = " + secondTab);


        // Selenium driver.get
        // Tell the driver to open facebook
        MyFunction.wait(2);
        driver.switchTo().window(secondTab);
        driver.get("https://www.facebook.com/");

        waitAndClose();
    }
}
