package Pages.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMainPage {


    public ProductMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Order']")
    WebElement orderButton;

    @FindBy(xpath = "//a[.='View all orders'] ")
    WebElement viewAllorderbutton;

    //a[.='View all orders']



    public void clickOrderButton(){
        orderButton.click();
    }

    public void clickViewOrdesrButton(){
        viewAllorderbutton.click();
    }
}
