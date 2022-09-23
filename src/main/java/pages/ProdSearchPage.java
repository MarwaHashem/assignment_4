package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProdSearchPage extends BasePage {

  private By SuccessAllProdsearch = By.xpath("//div[@class=\"productinfo text-center\"]");

  private By firstSearch=By.xpath("(//div[@class=\"productinfo text-center\"])[1]");
  private By secondSearch=By.xpath("(//div[@class=\"productinfo text-center\"])[2]");
  private By thirdSearch=By.xpath("(//div[@class=\"productinfo text-center\"])[3]");

    public ProdSearchPage(WebDriver driver) { super(driver); }


    public void scrolToAllSearch(){
        scrollToElement(600);
    }
    public void hoverToALLSearch(){
        hoverToElement(firstSearch);
        hoverToElement(secondSearch);
        hoverToElement(thirdSearch);
    }
    public int getAllsearched(){
        return getSizeOfSearched(SuccessAllProdsearch);}



}
