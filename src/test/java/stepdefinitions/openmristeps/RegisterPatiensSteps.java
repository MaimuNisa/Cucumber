package stepdefinitions.openmristeps;

import Pages.openmrs.OpenMrsLoginPage;
import Pages.openmrs.OpenMrsMainPage;
import Pages.openmrs.OpenMrsRegisterPage;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class RegisterPatiensSteps {


    WebDriver driver = DriverHelper.getDriver();
    OpenMrsLoginPage openMrsLoginPage = new OpenMrsLoginPage(driver);
    OpenMrsMainPage openMrsMainPage = new OpenMrsMainPage(driver);
    OpenMrsRegisterPage openMrsRegisterPage = new OpenMrsRegisterPage(driver);


    @Given("the user logs in to OpenMrs with following credentials")
    public void the_user_logs_in_to_open_mrs_with_following_credentials(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> usernamePasswordMap = dataTable.asMap();
        openMrsLoginPage.login1(usernamePasswordMap.get("username"), usernamePasswordMap.get("password"));


//     String name = usernamePasswordMap.get("username");
//
//     String password =usernamePasswordMap.get("password");
//
//        System.out.println(name);
//        System.out.println(password);
    }

    @When("the user registers a new patient with following information:")
    public void the_user_registers_a_new_patient_with_following_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        Map<String, String> patienInfoMap = dataTable.asMap();

        openMrsMainPage.clickregisterpatientButton();
        openMrsRegisterPage.sendName(patienInfoMap.get("GivenName"), patienInfoMap.get("FamilyName"));
        openMrsRegisterPage.selectGender(patienInfoMap.get("Gender"));
        openMrsRegisterPage.sendBirthDate(patienInfoMap.get("Day"), patienInfoMap.get("Month"), patienInfoMap.get("Year"));
        openMrsRegisterPage.sendAddress(patienInfoMap.get("Address"));
        openMrsRegisterPage.phoneNumber(patienInfoMap.get("PhoneNumber"));
        openMrsRegisterPage.sendRelativeInfo(patienInfoMap.get("Relative"), patienInfoMap.get("RelativeName"));
        openMrsRegisterPage.clickConfirmButton();
////
//
//            // Write code here that turns the phrase above into concrete actions
//            // For automatic transformation, change DataTable to one of
//            // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//            // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//            // Double, Byte, Short, Long, BigInteger or BigDecimal.
//            //
//            // For other transformations you can register a DataTableType.
//
//        }


    }


}
