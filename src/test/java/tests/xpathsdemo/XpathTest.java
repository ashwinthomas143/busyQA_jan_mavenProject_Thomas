package tests.xpathsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class XpathTest extends BaseTest {

    String url = "http://omayo.blogspot.com/";


    @Test
    void xpathTest() {

        //AAA
        //Arrange -> test data that is required for our test
        By linkElementsPath = By.xpath("//div[@class='widget LinkList']//a");
        //expected count coming from requirement specifications
        int expectedCount = 5;

        //ACT -> perform required actions

        driver.get(url);
        List<WebElement> linkElements = driver.findElements(linkElementsPath);
        ArrayList<String> linkTexts = new ArrayList<>();
        ArrayList<String> linkUrls = new ArrayList<>();

        for (WebElement linkElement : linkElements) {
            System.out.println(linkElement.getText());
            linkTexts.add(linkElement.getText());
            linkUrls.add(linkElement.getAttribute("href"));
            System.out.println(linkElement.getText() + " : " + linkElement.getAttribute("href"));
        }

        //Assert -> validations point
        Assert.assertEquals(linkTexts.size(), expectedCount, "Actual size count is not matching the expected count!");
    }

    @Test
    void exceptionTest() {
        driver.get(url);
        //driver.findElement(By.linkText("Open a popup window")).click();


        List<WebElement> linkElements = driver.findElements(By.linkText("Open a popup window"));
        System.out.println(linkElements);

        driver.navigate().refresh();
        //linkElements = driver.findElements(By.linkText("Open a popup window"));
        System.out.println(linkElements);


        //Stale ELEMENT Exception

//        WebElement linkElement = driver.findElement(By.xpath("(//input[@class='classone'])[1]"));
//        linkElement.sendKeys("selenium");
//
//        driver.navigate().refresh();
//
//        linkElement.sendKeys("selenium");


        //Stale ELEMENT Exception and how to counteract it

        WebElement linkElement = driver.findElement(By.xpath("(//input[@class='classone'])[1]"));
        linkElement.sendKeys("selenium");

        driver.navigate().refresh();

        linkElement = driver.findElement(By.xpath("(//input[@class='classone'])[1]"));
        linkElement.sendKeys("selenium");
    }

    @Test
    public void findElementTest() {
        driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/");
        List<WebElement> linkURLS = driver.findElements(By.xpath("//a[@class='wp-block-button__link']"));

        for(WebElement linkURL:linkURLS) {
            System.out.println(linkURL.getText() + " : " + linkURL.getAttribute("href"));
        }
    }

}
