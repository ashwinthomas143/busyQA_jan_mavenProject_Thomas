package tests.browserCommands;

import org.testng.annotations.Test;
import tests.BaseTest;

public class BrowserTest extends BaseTest {

    @Test
    public void browserCommandsTest(){
        driver.get("https://www.amazon.ca/");
        System.out.println("Title : " + driver.getTitle());
        System.out.println("URL : " + driver.getCurrentUrl());
        System.out.println("Page Source : " + driver.getPageSource());
    }
}
