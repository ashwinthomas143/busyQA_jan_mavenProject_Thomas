package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import javax.swing.plaf.DimensionUIResource;

public class FirstSeleniumCode {

    @Test
    void test1() {
        WebDriverManager.edgedriver().setup();
        RemoteWebDriver driver = new EdgeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.1");

        //Get size
        Dimension size = driver.manage().window().getSize();
        System.out.println("Width: " + size.getWidth() + "\nHeight: " + size.getHeight());

        //Set size
        Dimension d = new Dimension(150, 230);
        driver.manage().window().setSize(d);
        Dimension size1 = driver.manage().window().getSize();
        System.out.println("Width: " + size1.getWidth() + "\nHeight: " + size1.getHeight());

        //Maximize
        driver.manage().window().maximize();

    }
}
