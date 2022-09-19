package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait =new WebDriverWait(driver, Duration.ofSeconds(40));
    }
   public WebElement locateElement( By elementLocator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        wait.until(ExpectedConditions.elementToBeClickable (elementLocator));
        return driver.findElement(elementLocator);
    }
    public List<WebElement> listElements(By elementLocator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        wait.until(ExpectedConditions.elementToBeClickable (elementLocator));
        return driver.findElements(elementLocator);
    }
    public void clickElement(By elementLocator){ locateElement(elementLocator).click();}
    public void typeOnInputField(By elementLocator,String text){locateElement(elementLocator).sendKeys(text);}
    public String getTextOfElement (By elementLocator){ return locateElement(elementLocator).getText();}
    public int getSizeOfSearched (By elementLocator){ return listElements(elementLocator).size();}

    public WebElement hoverToElement(By elementLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        wait.until(ExpectedConditions.elementToBeClickable (elementLocator));

        Actions actions = new Actions(driver);
         actions.moveToElement(driver.findElement(elementLocator));
         actions.perform();
        return driver.findElement(elementLocator);
     }
}
