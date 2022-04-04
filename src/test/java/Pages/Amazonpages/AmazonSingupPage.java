package Pages.Amazonpages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSingupPage {
    public AmazonSingupPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
//    @FindBy(xpath = "//span[.='Hello, Sign in']")
//    WebElement helloButton;
//
//   @FindBy(id = "createAccountSubmit")
//    private WebElement createAmazonAccountButton;
//
//    @FindBy(id = "ap_customer_name")
//    private  WebElement name;
//
//
//    @FindBy(id = "ap_email")
//    private  WebElement email;
//
//
//    @FindBy(xpath = "//input[@name='password']")
//    private  WebElement password;
//
//
//    @FindBy(id = "ap_password_check")
//    private  WebElement passwordCheck;
//
//    @FindBy(tagName = "h1")
//    private  WebElement headerText;
//
//
//
//public void setCreateAccount(){
//   helloButton.click();
//    createAmazonAccountButton.click();
//}
//public  String getHeaderText(){
//
//    return BrowserUtils.getTextMethod(headerText);
//
//}
//
//public void  allinformation(String username,String email,String password,String passwordCheck){
//
//    name.sendKeys(username);
//    this.email.sendKeys(email);
//    this.password.sendKeys(password);
//    this.passwordCheck.sendKeys(passwordCheck);
//}


    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement helloButton;

    @FindBy(id = "createAccountSubmit")
    private WebElement createAmazonAccountButton;

    @FindBy(tagName = "h1")
    private WebElement headerText;

    @FindBy(id = "ap_customer_name")
    private WebElement name;

    @FindBy(id = "ap_email")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(id = "ap_password_check")
    private WebElement passwordCheck;


    public void setCreateAccount (){
        helloButton.click();
        createAmazonAccountButton.click();
    }

    public String getHeaderText(){
        return BrowserUtils.getTextMethod(headerText);
    }

    public void allInformation(String name, String email, String password, String passwordCheck){
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.passwordCheck.sendKeys(passwordCheck);
    }
}
