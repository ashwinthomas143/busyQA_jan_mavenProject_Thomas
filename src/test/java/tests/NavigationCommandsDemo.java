package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationCommandsDemo extends BaseTest{



    @Test
    void testDimension() {
        driver.navigate().to("https://www.selenium.dev/");

        driver.manage().window().maximize();
        String homepageTitle = driver.getTitle();

        driver.findElement(By.linkText("Downloads")).click();
        String downloadsPageTitle = driver.getTitle();

        driver.navigate().back();
        if (homepageTitle.equals(driver.getTitle())){
            System.out.println("Success");
        }


    }


}
