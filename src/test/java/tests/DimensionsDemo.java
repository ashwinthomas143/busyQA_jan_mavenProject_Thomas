package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DimensionsDemo extends BaseTest {


    @Test
    void testDimension() {
        driver.get("https://www.google.ca/");

        Dimension Size = driver.manage().window().getSize();
        System.out.println("Height : " + Size.getHeight() + "\nWidth : " + Size.getWidth());

        Dimension d = new Dimension(500, 500);
        driver.manage().window().setSize(d);
        Dimension NewSize = driver.manage().window().getSize();
        System.out.println("New Height : " + NewSize.getHeight() + "\nNew Width : " + NewSize.getWidth());
    }

    @Test
    void testMaximize() {
        driver.get("https://www.google.ca/");
        driver.manage().window().maximize();
    }

    @Test
    void test3() {
        System.out.println("test3");
    }


}
