package Pages.openmrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMrsLoginPage {
    public OpenMrsLoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='username']")
  private  WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;


    @FindBy (xpath = "//li[@id='Inpatient Ward']")
    private  WebElement inpatientWardButton;



    @FindBy (id = "loginButton")
    private  WebElement loginButton;

    public void login1(String  username , String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        inpatientWardButton.click();

        loginButton.click();

    }
}
