package stepdefinitions.AmazonSteps;


import Pages.Amazonpages.AmazonSingupPage;
import Utils.DriverHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AmazonSignupSteps {
WebDriver driver= DriverHelper.getDriver();
AmazonSingupPage amazonSingupPage = new AmazonSingupPage(driver);


    @When("the user clicks the sign in and create your amazon account button")
    public void the_user_clicks_the_sign_in_and_create_your_amazon_account_button() {

        driver.navigate().to("https://www.amazon.com/");
        amazonSingupPage.setCreateAccount();


    }
    @Then("the user validate the header")
    public void the_user_validate_the_header(io.cucumber.datatable.DataTable dataTable) {

        List<String>header = dataTable.asList();
        Assert.assertEquals(header.get(0),amazonSingupPage.getHeaderText());
    }
    @Then("the user provides the information:")
    public void the_user_provides_the_information(io.cucumber.datatable.DataTable dataTable) {

    //use index for list
     List<String> allinformationfromdataTable = dataTable.asList();
amazonSingupPage.allInformation(allinformationfromdataTable.get(0),allinformationfromdataTable.get(1),
        allinformationfromdataTable.get(2),allinformationfromdataTable.get(3));
    }


}
