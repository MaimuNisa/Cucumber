package Pages.openmrs;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMrsRegisterPage {
    public OpenMrsRegisterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(name = "givenName")
    private WebElement giveName;
    @FindBy(name = "familyName")
    private WebElement familyName;

    @FindBy(id = "next-button")
    private WebElement nextButton;

    @FindBy(id = "gender-field")
    private WebElement selectgender;

    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    private WebElement dayButton;

    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    private WebElement selectBirthMonth;

    @FindBy(xpath = "//input[@id='birthdateYear-field']")
    private WebElement birthYear; //sendKEYS


    @FindBy(xpath = "//input[@id='address1']")
    private WebElement addressButton;

    @FindBy(name = "phoneNumber")
    private WebElement phoneNumberButton;

    @FindBy(id = "relationship_type")
    private WebElement relationType;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    private WebElement relativeName;


    @FindBy(id = "submit")
    private WebElement submitButton;

public void sendName(String name,String familyName) throws InterruptedException {

    this.giveName.sendKeys(name);
    this.familyName.sendKeys(familyName);
    Thread.sleep(2000);
     nextButton.click();

}
public void selectGender(String gender){
    BrowserUtils.selectBy(selectgender,gender,"text");
    nextButton.click();

}
public  void  sendBirthDate(String day,String month,String year) throws InterruptedException {
    dayButton.clear();
    dayButton.sendKeys(day);
    BrowserUtils.selectBy(selectBirthMonth,month,"text");
    birthYear.clear();
    birthYear.sendKeys(year);
    Thread.sleep(2000);
    nextButton.click();
}


public void sendAddress(String address) throws InterruptedException {

    this.addressButton.sendKeys(address);
    Thread.sleep(2000);
    nextButton.click();
}


public void phoneNumber(String phoneNumber) throws InterruptedException {
  this.phoneNumberButton.sendKeys(phoneNumber);
  Thread.sleep(2000);
  nextButton.click();

}

public  void sendRelativeInfo(String relativeType,String relativeName) throws InterruptedException {
    BrowserUtils.selectBy(this.relationType,relativeType,"text");
    this.relativeName.sendKeys(relativeName);
    Thread.sleep(2000);
    nextButton.click();


}

public void  clickConfirmButton(){
    submitButton.click();
}

}
