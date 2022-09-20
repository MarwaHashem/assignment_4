package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.NavigateBarPage;

public class HomeTests extends BaseTests{
    @Test
    public void testHomeToApp() {
        NavigateBarPage navigateBarPage = new NavigateBarPage(driver);
        LoginPage loginPage = navigateBarPage.clickLoginFromNavigatBar();
        HomePage homePage = loginPage.loginToApp("Marwahashem@gmail.com", "Marwa2313505");
        homePage.scrolToVerifyHome();
        Assert.assertEquals(homePage.verifyHomePage(), "FEATURES ITEMS");
    }

}
