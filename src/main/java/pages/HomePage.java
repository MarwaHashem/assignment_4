package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By loginName = By.xpath("//b[contains(text(),'Marwa')]");

    public HomePage(WebDriver driver) { super(driver); }
    public String verifyHomePage()
    {  return getTextOfElement(loginName);}


}
