package stepdefinitions.webordersteps;

import Pages.weborderpages.LoginPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPagestep {


    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);


    @Given("the users navigates to WebOrder websites")
    public void the_users_navigates_to_web_order_website() {

     driver.navigate().to(ConfigReader.readProperty("weborderurl"));

    }
    @When("the users provides credentials")
    public void the_users_provides_credentials() throws InterruptedException {
Thread.sleep(3000);
    loginPage.login("guest1@microworks.com","Guest1!");
        Thread.sleep(3000);
    }

    @Then("the user is on the home pages")
    public void the_users_is_on_the_home_page() {


        Assert.assertEquals(driver.getTitle(),"ORDER DETAILS - Weborder");


    }

    @When("The users provides correct username and wrong password")
    public void the_users_provides_correct_username_and_wrong_password() {

        loginPage.login(ConfigReader.readProperty("Weborderusername"),"wrongpassword");

    }
    @Then("The users validates the {string} error message")
    public void the_users_validates_the_error_message(String expectedMessage) {
     Assert.assertTrue(loginPage.getErrorMessage(expectedMessage));


    }

//    @When("The user provides wrong username and password")
//    public void the_user_provides_wrong_username_and_password() {
//      loginPage.login("ahmet","baldir");
//    }



    @When("The user provides wrong {string} and {string}")
    public void the_user_provides_wrong_and(String username, String password) {
    loginPage.login(username,password);
    }

    @When("The user provides empty username and password")
    public void the_user_provides_empty_username_and_password() {
        loginPage.login("","");
    }

}
