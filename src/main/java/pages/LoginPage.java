package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private By emailField= By.xpath("//div[@class=\"login-form\"]//input[@name=\"email\"]");
    private By pswField= By.xpath("//div[@class=\"login-form\"]//input[@name=\"password\"]");
    private By loginBtn= By.xpath("//div[@class=\"login-form\"]//button[@class=\"btn btn-default\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
public HomePage loginToApp (String email,String pass){
    typeOnInputField(emailField, email);
    typeOnInputField(pswField, pass);
    clickElement(loginBtn);
    return new HomePage(driver);
}
}
