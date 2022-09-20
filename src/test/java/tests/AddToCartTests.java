package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddToCartTests extends BaseTests {

    @Test
    public void testAddToCartToApp() {
        NavigateBarPage navigateBarPage = new NavigateBarPage(driver);

        ProdPage prodPage = navigateBarPage.clickProdFromNavBar();
        Assert.assertEquals(prodPage.getAllProdText(), "ALL PRODUCTS");
        prodPage.scrolToFirstProd();
        prodPage.hoverToFirstProd();
        AddToCartPage addToCartPage = prodPage.clickToFirstAddToCart();
        addToCartPage.clickContiueShoping();
        prodPage.hoverToSecondProd();
        prodPage.clickToSecondAddToCart();
        ShopingCart shopingCart = addToCartPage.verifyProd();
        Assert.assertEquals(shopingCart.myShopingCart(), 2);
        Assert.assertEquals(shopingCart.verifyPriceOfBothProd(), 2);
        Assert.assertEquals(shopingCart.verifyQuntOfBothProd(), 2);
        Assert.assertEquals(shopingCart.verifyTotalPriceOfBothProd(), 2);


    }


}
