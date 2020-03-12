import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    WebDriver driver;

    private By productNameInBasked = By.xpath("//*[@class='athenaBasket_itemName']");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName(){
       return driver.findElement(productNameInBasked).getText();
    }
}
