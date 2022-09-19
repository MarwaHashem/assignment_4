package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.io.File;
import java.io.IOException;

public class BaseTests {
    WebDriver driver;

    @BeforeMethod
    public void  setup_initiateDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");

    }

    @AfterMethod
     public void a_ScrnshotForFalier(ITestResult result)
    {
        if (result.getStatus()==ITestResult.FAILURE){
            File scrnshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try{
                FileUtils.copyFile(scrnshot,new File("./images/"+result.getName()+".png"));
            } catch (IOException e){

            }
        }
    }
    @AfterMethod
    public void z_quitDriver(){
       driver.quit();
    }
}
