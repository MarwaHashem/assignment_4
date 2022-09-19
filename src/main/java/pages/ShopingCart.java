package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopingCart extends BasePage{

    private By bothProd   = By.xpath("//td[@class=\"cart_product\"]");
    private By price   = By.xpath("//td[@class=\"cart_price\"]");
    private By qunt  = By.xpath("//td[@class=\"cart_quantity\"]");
    private By totalPrice  = By.xpath("//td[@class=\"cart_total\"]");

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
