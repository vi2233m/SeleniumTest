package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 登录后首页
 */
public class HomePage extends MainnavPage{

    private WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//i[@class='icon user-new']")
    WebElement iconElement;
    @FindBy(xpath = "//a[contains(text(),'退出')]")
    WebElement logoutElement;

    public LoginPage logout() throws Exception{
        iconElement.click();
        logoutElement.click();
        Thread.sleep(8000);
        return new LoginPage(driver);
    }

}
