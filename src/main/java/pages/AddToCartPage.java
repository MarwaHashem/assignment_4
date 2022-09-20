package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddToCartPage extends BasePage {


  private   By alertMsg = By.xpath("//h4[contains(text(),'Added!')]");
  private   By continueBtn = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
  private By viewCartLink = By.xpath("//u[contains(text(),'View Cart')]");
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }
    public ProdPage clickContiueShoping() {
      //getTextOfElement(alertMsg);
      clickElement(continueBtn);
     return new ProdPage(driver);
    }
    public ShopingCart verifyProd()
    {
        clickElement(viewCartLink);
        return new ShopingCart(driver);
    }





}
