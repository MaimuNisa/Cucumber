package stepdefinitions.productsteps;

//import Utils.ConfigReader;
//import Utils.DriverHelper;
//import io.cucumber.java.Scenario;
//import org.apache.commons.io.FileUtils;
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Date;
//
//public class HooksProduct {
////    WebDriver driver = DriverHelper.getDriver();
////
////    @Before
////    public void beforeScenario (){
////
////      driver.navigate().to(ConfigReader.readProperty("producturl"));
////    }
////
////    @After
////    public void afterScenario (Scenario scenario){
////        //System.out.println("after scenario");
////        //DriverHelper.tearDown();
////        Date currentDate = new Date();
////        String screenshotFileName = currentDate.toString().replace(" ", "-")
////                .replace(":", "-");
////        if(scenario.isFailed()){
////            File schreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////            try {
////                FileUtils.copyFile(schreenshotFile, new File("src/test/java/screenshot/" + screenshotFileName + ".png"));
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
////        DriverHelper.tearDown();
////    }
//
//    WebDriver driver = DriverHelper.getDriver();
//
//    @Before
//    public void beforeScenario() {
//        driver.navigate().to(ConfigReader.readProperty("producturl"));
//    }
//
//    @After
//    public void afterScenario(Scenario scenario) throws IOException {
//        System.out.println("After scenario");
//
//        Date currentDate = new Date();
//        String screenshotfileName = currentDate.toString().replace(" ", "-")
//                .replace(":", "-");
//        if (scenario.isFailed()) {
//            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//            try {
//                FileUtils.copyFile(screenshotFile, new File(new File("src/test/java/screenshot/" + screenshotfileName) + ".png"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        DriverHelper.tearDown();
//    }



import Pages.weborderpages.LoginPage;
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

public class HooksProduct {

    WebDriver driver = DriverHelper.getDriver();
   // LoginPage loginPage = new LoginPage(driver);

    @Before
    public  void beforeScenario(){
        driver.navigate().to(ConfigReader.readProperty("producturl"));

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
       // driver.quit();
     //   driver = null;
    }
}
