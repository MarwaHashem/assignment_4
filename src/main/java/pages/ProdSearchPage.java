package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProdSearchPage extends BasePage {

  private By SuccessAllProdsearch = By.xpath("//div[@class=\"productinfo text-center\"]//p[contains(text(),'Jeans')]");


    public ProdSearchPage(WebDriver driver) { super(driver); }
    public int getAllsearched(){
        return getSizeOfSearched(SuccessAllProdsearch);}



}
