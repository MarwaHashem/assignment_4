package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddToCartTests extends BaseTests{

    @Test
    public void testAddToCartToApp(){
        NavigateBarPage navigateBarPage = new NavigateBarPage(driver);
        LoginPage loginPage = navigateBarPage.clickLoginFromNavigatBar();

        HomePage homePage = loginPage.loginToApp("Marwahashem@gmail.com", "Marwa2313505");
        Assert.assertEquals(homePage.verifyHomePage(),"Marwa");
        ProdPage prodPage = navigateBarPage.clickProdFromNavBar();
        Assert.assertEquals(prodPage.getAllProdText(), "ALL PRODUCTS");
        AddToCartPage addToCartPage=prodPage.hoverFirstProd();
        addToCartPage.addedMsg();
        prodPage.hoverSecondProd();
        ShopingCart shopingCart=addToCartPage.verifyProd();
        Assert.assertEquals(shopingCart.myShopingCart(),2);
        Assert.assertEquals(shopingCart.verifyPriceOfBothProd(),2);
        Assert.assertEquals(shopingCart.verifyQuntOfBothProd(),2);
        Assert.assertEquals(shopingCart.verifyTotalPriceOfBothProd(),2);


    }






}
