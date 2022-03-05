package assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Assignment1 extends BaseTest {

    @Test
    void testCase1() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("user");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
        String errorMessage = driver.findElement(By.xpath("//span[contains(@id,'spanMessage')]")).getText();

        if (errorMessage.equals("Invalid credentials")) {
            System.out.println("Failure");
        } else {
            System.out.println("Success!");
        }

    }

    @Test
    void testCase2() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("user123");
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

        String errorMessage = driver.findElement(By.xpath("//span[contains(@id,'spanMessage')]")).getText();

        if (errorMessage.equals("Invalid credentials")) {
            System.out.println("Failure");
        } else {
            System.out.println("Success!");
        }

    }

    @Test
    void testCase3() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("user");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

        String errorMessage = driver.findElement(By.xpath("//span[contains(@id,'spanMessage')]")).getText();

        if (errorMessage.equals("Invalid credentials")) {
            System.out.println("Failure");
        } else {
            System.out.println("Success!");
        }

    }

    @Test
    void testCase4() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

        String pageTitle = driver.getTitle();

        if(pageTitle.equals("(OrangeHRM)")){
            System.out.println("Success!");
        }

    }


}
