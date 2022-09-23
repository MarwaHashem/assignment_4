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
        Assert.assertEquals(shopingCart.getpriceFirstProd(), "Rs. 500");
        Assert.assertEquals(shopingCart.getpriceSecondProd(), "Rs. 400");
        Assert.assertEquals(shopingCart.getquntFirstProd(), "1");
        Assert.assertEquals(shopingCart.getquntSecondProd(), "1");
        Assert.assertEquals(shopingCart.gettotalFirstProd(), "Rs. 500");
        Assert.assertEquals(shopingCart.gettotalSecondProd(), "Rs. 400");



    }


}
