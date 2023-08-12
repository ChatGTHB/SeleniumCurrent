package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunction;

public class _05_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // textBox ları name ile bulup adınızı ve soyadınız doldurun
        // ve butonu da id veya name ile bulup tıklatın

        WebElement firstName=driver.findElement(By.name("q8_name[first]")); //name ile bulma
        firstName.sendKeys("ismet");

        WebElement lastName=driver.findElement(By.name("q8_name[last]")); //name ile bulma
        lastName.sendKeys("temur");

        WebElement btnSubmit=driver.findElement(By.id("input_2"));
        btnSubmit.click();

        MyFunction.wait(5);
        driver.quit();
    }
}
