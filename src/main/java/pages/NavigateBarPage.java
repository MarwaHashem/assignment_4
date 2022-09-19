package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigateBarPage extends BasePage {

    private By prodNavBar = By.xpath("//i[@class=\"material-icons card_travel\"]");
    private By loginNavBar=By.xpath("//i[@class=\"fa fa-lock\"]");
    public NavigateBarPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickLoginFromNavigatBar () {
        clickElement(loginNavBar);
        return new LoginPage(driver);
    }
    public ProdPage clickProdFromNavBar() {
        clickElement(prodNavBar);
        return new ProdPage(driver);
    }
}