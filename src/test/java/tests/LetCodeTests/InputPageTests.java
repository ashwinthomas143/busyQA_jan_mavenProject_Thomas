package tests.LetCodeTests;

import LetCode.HomePage;
import LetCode.InputPage;
import LetCode.PracticeElementsPage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class InputPageTests extends BaseTest {

    @Test
    public void inputFieldTest(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();
        homePage.clickWorkspaceButton();

        PracticeElementsPage practiceElements = new PracticeElementsPage(driver);
        practiceElements.clickOnTheLink("Edit");

        InputPage inputPage = new InputPage(driver);
        inputPage.enterFullName("Thomas");




    }
}
