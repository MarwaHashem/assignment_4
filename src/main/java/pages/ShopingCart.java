package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopingCart extends BasePage{

    private By bothProd   = By.className("cart_product");
    private By price   = By.className("cart_price");
    private By qunt  = By.className("cart_quantity");
    private By totalPrice  = By.className("cart_total");

    public ShopingCart(WebDriver driver) {
        super(driver);
    }
    public int myShopingCart()
    {
      return getSizeOfSearched(bothProd);
    }
    public int verifyPriceOfBothProd()
    {
        return getSizeOfSearched(price);
    }
    public int verifyQuntOfBothProd()
    {
        return getSizeOfSearched(qunt);
    }
    public int verifyTotalPriceOfBothProd()
    {
        return getSizeOfSearched(totalPrice);
    }
}
