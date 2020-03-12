import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    private By productVitaminB12 = By.xpath("//*[@alt='Vegan Vitamin B12']");




    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public VeganVitaminPage selectProduct(){
        driver.findElement(productVitaminB12).click();
        return new VeganVitaminPage(driver);
    }



}
