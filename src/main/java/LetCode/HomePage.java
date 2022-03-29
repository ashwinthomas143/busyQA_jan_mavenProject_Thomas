package LetCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private String workspaceButton = "//h1[text()=' Workspace ']/following-sibling::div/a";
    private String url = "https://letcode.in/";

    public void navigateToHomePage(){
        driver.get(url);
    }


   public void clickWorkspaceButton(){
        driver.findElement(By.xpath(workspaceButton)).click();
    }


}
