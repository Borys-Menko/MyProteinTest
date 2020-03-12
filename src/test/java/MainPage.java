import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    private By closeAlertButton = By.xpath("//*[@class='emailReengagement_close_button']");
    private By loginLink = By.xpath("//*[@class='responsiveAccountHeader_openAccountButton']");
    private By searchField = By.name("search");
    private By searchButton = By.xpath("//*[@class='headerSearch_button']");
    private By basketButton = By.xpath("//*[@class='responsiveFlyoutBasket_name']");
    private By cookiesButton = By.xpath("//*[@class='cookie_modal_button']");
    private String productName = "Vitamin B12";



   public MainPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public LoginPage goToAccount(){
       driver.findElement(loginLink).click();
       return new LoginPage(driver);
    }
    public void acceptCookies(){
    driver.findElement(cookiesButton).click();
    }

    public void closeAlert(){
       driver.findElement(closeAlertButton).click();
    }


    public ProductPage searchField(){
       driver.findElement(searchField).sendKeys(productName);
       driver.findElement(searchButton).click();

       return new ProductPage(driver);
    }
    public BasketPage baskedButton(){
       driver.findElement(basketButton).click();
       return new BasketPage(driver);
    }

}
