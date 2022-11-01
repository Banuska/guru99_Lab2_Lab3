package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99AddTariffPage extends BrowserUtils {
    public Guru99AddTariffPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





    @FindBy (xpath = "//h1[.='Add Tariff Plans']")
    private WebElement addTariffPlansHeader;
    @FindBy(id = "rental1")
    private WebElement monthlyRentalBox;
    @FindBy(id = "local_minutes")
    private WebElement freeLocalMinBox;
    @FindBy(id = "inter_minutes")
    private WebElement freeInternMinBox;
    @FindBy(id = "sms_pack")
    private WebElement freeSmsPackBox;
    @FindBy(id = "minutes_charges")
    private WebElement LocalPerMinBox;
    @FindBy(id = "inter_charges")
    private WebElement InternChargesBox;
    @FindBy(id ="sms_charges" )
    private WebElement SmsChargesBox;
    @FindBy (name = "submit")
    private WebElement submitButton;
    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
    private WebElement headerVerification;
    public void getAddTariffPlansHEader(String expectedHeader) {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveByOffset(0,0).doubleClick().build().perform();
        BrowserUtils.waitForPageToLoad(5);

       // Assert.assertEquals(addTariffPlansHeader.getText(),expectedHeader);*/
    }

    public void setMonthlyRentalBox(String monthlyRental)  {
          staticWait(2);

        monthlyRentalBox.sendKeys(monthlyRental);
    }

    public void setFreeLocalMinBox(String freeLocalMin) {
        staticWait(2);
      freeLocalMinBox.sendKeys(freeLocalMin);
    }

    public void setFreeInternMinBox(String freeInternMin) {
        staticWait(2);
        freeInternMinBox.sendKeys(freeInternMin);
    }

    public void setFreeSmsPackBox(String freeSmsPack) {
        staticWait(2);
     freeSmsPackBox.sendKeys(freeSmsPack);
    }

    public void setLocalPerMinBox(String localPerMin) {
        staticWait(2);
        LocalPerMinBox.sendKeys(localPerMin);
    }

    public void setInternChargesBox(String internCharges) {
        staticWait(2);
        InternChargesBox.sendKeys(internCharges);
    }

    public void setSmsChargesBox(String smsCharges) {
        staticWait(2);
        SmsChargesBox.sendKeys(smsCharges);
    }

    public void setSubmitButton() {
       submitButton.click();
    }

    public void setHeaderVerification(String expected){
        Assert.assertEquals(headerVerification.getText(),expected);
    }

}
