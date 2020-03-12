import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.xpath("//*[@id='username']");
    private By passwordField = By.xpath("//*[@id='password']");
    private By submitButton = By.id("login-submit");
    private By errorMessage = By.xpath("//*[contains(@class,'alert alert-error login_alertDanger')]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

   public AccountPage login(String email, String password){
        driver.findElement(emailField).click();
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);

       driver.findElement(passwordField).click();
       driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);

        driver.findElement(submitButton).click();


        return new AccountPage(driver);
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();

    }

}
