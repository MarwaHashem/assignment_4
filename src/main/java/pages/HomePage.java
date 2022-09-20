package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By verifyHome = By.xpath("//div[@class=\"features_items\"]//h2[@class=\"title text-center\"]");

    public HomePage(WebDriver driver) { super(driver); }

    public void scrolToVerifyHome(){
        scrollToElement(600);
    }
    public String verifyHomePage()
    {  return getTextOfElement(verifyHome);}


}
