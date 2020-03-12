import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VeganVitaminPage {

    WebDriver driver;


    private By addToBasketButton = By.xpath("//*[@aria-label='Add to basket']");
    private By closeWindowButton = By.xpath("//*[@class='athenaAddedToBasketModal_close']");

    public VeganVitaminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToBasket(){
//        driver.findElement(addToBasketButton).click();
        driver.findElement(addToBasketButton).sendKeys(Keys.ENTER);
    }


    public void closeProductWindow() {
        driver.findElement(closeWindowButton).click();

    }
}
