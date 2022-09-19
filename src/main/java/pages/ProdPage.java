package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdPage extends BasePage{

 By allProdText = By.xpath("//h2[@class=\"title text-center\"]");
    By searchBox = By.id("search_product");
    By searchBtn=By.id("submit_search");


    public ProdPage(WebDriver driver) {super(driver);}
    public String getAllProdText(){ return getTextOfElement(allProdText);}

    private By firstProd =By.xpath("(//div[@class=\"productinfo text-center\"])[1]");
    private By secondProd = By.xpath("(//div[@class=\"productinfo text-center\"])[2]");

    private By addToCart=By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]");
    private By addToCartSecondProd=By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[4]");

    public ProdSearchPage searchprod (String search_prod) {
        typeOnInputField(searchBox, search_prod);
        clickElement(searchBtn);
        return new ProdSearchPage(driver);
    }
    public AddToCartPage hoverFirstProd(){
        hoverToElement(firstProd);
        clickElement(addToCart);
        return  new AddToCartPage(driver);
    }
    public AddToCartPage hoverSecondProd(){
        hoverToElement(secondProd);
        clickElement(addToCartSecondProd);
        return  new AddToCartPage(driver);
    }

}
