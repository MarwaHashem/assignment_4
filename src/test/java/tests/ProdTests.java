package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class ProdTests extends BaseTests{
    @Test
    public void testProdToApp()
    {
        NavigateBarPage navigateBarPage= new NavigateBarPage (driver);
        LoginPage loginPage = navigateBarPage.clickLoginFromNavigatBar();
        HomePage homePage = loginPage.loginToApp("Marwahashem@gmail.com", "Marwa2313505");
        Assert.assertEquals(homePage.verifyHomePage(),"Marwa");
        ProdPage prodPage = navigateBarPage.clickProdFromNavBar();
        Assert.assertEquals(prodPage.getAllProdText(), "ALL PRODUCTS");
        ProdSearchPage prodSearchPage = prodPage.searchprod("Jeans");
        int prodSearchPage1= prodSearchPage.getAllsearched();
        Assert.assertEquals(prodSearchPage1,3);



    }
}
