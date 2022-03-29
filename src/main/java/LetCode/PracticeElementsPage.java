package LetCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeElementsPage {

    WebDriver driver;

    public PracticeElementsPage(WebDriver driver) {
        this.driver = driver;
    }



    String linkXpath = "//a[text()='$$']";

    public void clickOnTheLink(String linkText){
        driver.findElement(By.xpath(linkXpath.replace("$$",linkText))).click();
    }

}
