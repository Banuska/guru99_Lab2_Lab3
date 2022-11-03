package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Locale;

public class Guru99AddCustomerPage extends BrowserUtils {

    public Guru99AddCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (linkText = "Add Customer")
    private WebElement addCustomer;
    @FindBy (xpath = "//h1[.='Add Customer']")
    private WebElement addCustomerHeader;
    @FindBy(xpath = "//input[@type='radio']")
    private List<WebElement> backGroundCheck;
    @FindBy (id = "fname")
    private WebElement firstName;
    @FindBy (id = "lname")
    private WebElement lastName;
    @FindBy (id = "email")
    private WebElement email;
    @FindBy (xpath ="//textarea[@id='message']" )
    private WebElement address;
    @FindBy (id = "telephoneno")
    private WebElement mobileNumber;
    @FindBy (xpath ="//input[@name='submit']" )
    private WebElement submitButton;
    @FindBy (xpath ="//h1[.='Access Details to Guru99 Telecom']" )
    private WebElement headerVerification;

    public void setAddCustomer() {
      addCustomer.click();
        Actions actions= new Actions(Driver.getDriver());
        actions.moveByOffset(0,0).click().build().perform();
    }

    public void getAddCustomerHeader(String addcustomerHeader) {
        Assert.assertEquals(addCustomerHeader.getText(),addcustomerHeader);
    }

    public void setBackGroundCheck(String backgroundCheck) {
      for (WebElement each : backGroundCheck){
          if(each.getAttribute("id").equals(backgroundCheck)){
              each.click();
          }else {
              System.out.println("BackgroundCheck Button can not select");
          }
      }
    }
    public void setFirstName( String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber.sendKeys(mobileNumber);
    }

    public void setSubmitButton() {
        this.submitButton.click();
    }

    public WebElement getHeaderVerification() {
        return headerVerification;
    }
}
