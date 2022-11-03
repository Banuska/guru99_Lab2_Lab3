package code.stepDefinitions;

import code.pages.Guru99AddCustomerPage;
import code.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class guru99AddCustomerSteps extends BrowserUtils {

     Guru99AddCustomerPage guru99AddCustomerPage=new Guru99AddCustomerPage();
    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
    guru99AddCustomerPage.setAddCustomer();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String string) {
    guru99AddCustomerPage.getAddCustomerHeader(string);
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String string) {
        guru99AddCustomerPage.setBackGroundCheck(string);

    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fName, String lName, String email, String address, String pNumber) {
        guru99AddCustomerPage.setFirstName(fName);
        guru99AddCustomerPage.setLastName(lName);
        guru99AddCustomerPage.setEmail(email);
        guru99AddCustomerPage.setAddress(address);
        guru99AddCustomerPage.setMobileNumber(pNumber);
        guru99AddCustomerPage.setSubmitButton();
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        Assert.assertEquals(guru99AddCustomerPage.getHeaderVerification().getText(),string);
    }

}
