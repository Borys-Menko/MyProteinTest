import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPage {
    private String expectedErrorMessage = "The email address or password you entered were invalid";
    private String expectedProductName = "Vegan Vitamin B12 - 60tablets";
    private String email = "testByAnderson122@gmail.com";
    private String password = "qwer1234";

    WebDriver driver;

    @BeforeMethod
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void testErrorMessage(){
        driver.get("https://www.myprotein.com/");
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.closeAlert();
        LoginPage loginPage =  mainPage.goToAccount();
        loginPage.login(email,password);
        String actualErrorMessage = loginPage.getErrorMessage();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Wrong error message");
    }

    @Test(priority = 2)
    public void testAddProductToBasket(){
        driver.get("https://www.myprotein.com/");
        MainPage mainPage = new MainPage(driver);
        mainPage.closeAlert();
        ProductPage productPage = mainPage.searchField();
        VeganVitaminPage vitaminPage = productPage.selectProduct();
        mainPage.acceptCookies();
        vitaminPage.addProductToBasket();
        vitaminPage.closeProductWindow();
        BasketPage basketPage = mainPage.baskedButton();;
        String actualProductName = basketPage.getProductName();

        Assert.assertEquals(actualProductName,expectedProductName,"Wrong product name");
    }





    @AfterMethod
    void close(){
        driver.quit();
    }

}

