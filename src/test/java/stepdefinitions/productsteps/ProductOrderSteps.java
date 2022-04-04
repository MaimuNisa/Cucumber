package stepdefinitions.productsteps;

import Pages.productpages.ProductLoginPage;
import Pages.productpages.ProductMainPage;
import Pages.productpages.ProductOrderPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductOrderSteps {
    WebDriver driver = DriverHelper.getDriver();
    ProductLoginPage productLoginPage =new ProductLoginPage(driver);
    ProductMainPage productMainPage = new ProductMainPage(driver);
    ProductOrderPage productOrderPage =new ProductOrderPage(driver);

    @Given("The user navigates to product website homepage and click orderButton")
    public void the_user_navigates_to_product_website_homepage_and_click_order_button() {
     productLoginPage.login(ConfigReader.readProperty("productusername"),ConfigReader.readProperty("productpassword"));
     productMainPage.clickOrderButton();
    }
    @When("The user enter the product information  {string} and {string}")
    public void the_user_enter_the_product_information_and(String productName, String quantity) {
    productOrderPage.sendProductInfo(productName,quantity);
    }

    @When("The user enters the address information {string},{string},{string},{string},{string}")
    public void the_user_enters_the_address_information(String customerName, String street, String city, String state, String zipzode) {
    productOrderPage.sendAddressInformatin(customerName,street,city,state,zipzode);
    }

    @When("The user enters the card information {string},{string},{string}")
    public void the_user_enters_the_card_information(String cardType, String cardNumber, String expireDate) {
        productOrderPage.selectCard(cardType);
        productOrderPage.sendPaymentInformation(cardNumber,expireDate);

    }

    @Then("the user validates success message")
    public void the_user_validates_success_message() {
        productOrderPage.clickProcessButton();
      //  Assert.assertEquals("New order has been successfully added.",productOrderPage.getSuccessMessage());
        Assert.assertEquals("New order has been successfully added.",productOrderPage.getSuccessMessage());
    }

    @Then("The user validates product details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_user_validates_product_details(String productName,String quantity,String customerName,String street,String city,String state
            ,String zipcode,String cardType, String cardNumber,String expireDate) {

   productMainPage.clickViewOrdesrButton();
    productOrderPage.getInfo(productName,quantity,customerName,street,city,state,zipcode,cardType,cardNumber,expireDate);

    }
}
