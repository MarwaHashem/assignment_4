package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class ProdTests extends BaseTests{
    @Test
    public void testProdToApp()
    {
        NavigateBarPage navigateBarPage= new NavigateBarPage (driver);

        ProdPage prodPage = navigateBarPage.clickProdFromNavBar();
        Assert.assertEquals(prodPage.getAllProdText(), "ALL PRODUCTS");
        ProdSearchPage prodSearchPage = prodPage.searchprod("Jeans");
        prodSearchPage.scrolToAllSearch();
        prodSearchPage.hoverToALLSearch();
        int prodSearchPage1= prodSearchPage.getAllsearched();
        Assert.assertEquals(prodSearchPage1,3);



    }
}
