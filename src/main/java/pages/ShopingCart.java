package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopingCart extends BasePage{

    private By bothProd   = By.className("cart_product");

    private By priceFirstProd   = By.xpath("(//td[@class=\"cart_price\"])[1]");
    private By priceSecondProd   = By.xpath("(//td[@class=\"cart_price\"])[2]");
    private By quntFirstProd  = By.xpath("(//td[@class=\"cart_quantity\"])[1]");
    private By quntSecondProd  = By.xpath("(//td[@class=\"cart_quantity\"])[2]");

    private By totalFirstProd = By.xpath("(//td[@class=\"cart_total\"])[1]");
    private By totalSecondProd   = By.xpath("(//td[@class=\"cart_total\"])[2]");

    public ShopingCart(WebDriver driver) {
        super(driver);
    }
    public int myShopingCart()
    {
      return getSizeOfSearched(bothProd);
    }
  public String getpriceFirstProd(){
       return getTextOfElement(priceFirstProd);
  }
    public String getpriceSecondProd(){
        return getTextOfElement(priceSecondProd);
    }
    public String getquntFirstProd(){
        return  getTextOfElement(quntFirstProd);
    }
    public String getquntSecondProd(){
        return   getTextOfElement(quntSecondProd);
    }
    public String gettotalFirstProd(){
        return  getTextOfElement(totalFirstProd);
    }
    public String gettotalSecondProd(){
        return getTextOfElement(totalSecondProd);
    }

  /* public int verifyPriceOfBothProd()
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
    }*/
}
