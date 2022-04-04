package stepdefinitions.openmristeps;

import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class HooksOpenMri {
    WebDriver driver = DriverHelper.getDriver();
    // LoginPage loginPage = new LoginPage(driver);

    @Before
    public  void beforeScenario(){
        driver.navigate().to(ConfigReader.readProperty("mriurl"));

    }

    @After
    public void  afterScenario(Scenario scenario){
        //System.out.println("After Scenario");
        //DriverHelper.tearDown();

        Date currentDate  = new Date();
        String screenShootFileName = currentDate.toString().replace("","-") //3-13 2022
                .replace(":","-");

        if(scenario.isFailed()){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File(new File("src/test/java/runner/screenshot" + screenShootFileName) + "png"));
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
//DriverHelper.tearDown();
    }
}
