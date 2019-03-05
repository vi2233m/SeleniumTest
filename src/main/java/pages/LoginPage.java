package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 登录页
 */
public class LoginPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='account']")
    WebElement accountElement;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordElement;

    @FindBy(xpath = "//input[@value='登录']")
    WebElement loginElement;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver =driver;
    }


    /**
     *  登录操作方法
     * @param account
     * @param password
     */
    public HomePage login(String account, String password){
        accountElement.sendKeys(account);
        passwordElement.sendKeys(password);
        loginElement.click();

        return new HomePage(driver);
    }
}
