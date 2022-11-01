package code.stepDefinitions;

import code.pages.Guru99AddTariffPage;
import code.pages.Guru99HomePage;
import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;
import java.util.NoSuchElementException;

public class guru99AddTariffPlanSteps extends BrowserUtils {
    Guru99HomePage guru99HomePage= new Guru99HomePage();
    Guru99AddTariffPage guru99AddTariffPage=new Guru99AddTariffPage();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        System.out.println("Browser lunched and testing started");
        Driver.getDriver().get(ConfigurationReader.getProperties("Guru99_URL"));
        waitForPageToLoad(3);
    }

    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
    guru99HomePage.setAddTariffPlanLink();
    }

    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {

    guru99AddTariffPage.getAddTariffPlansHEader(string);
    }

    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String> dataTable) {
        guru99AddTariffPage.setMonthlyRentalBox(dataTable.get("Monthly Rental"));
        guru99AddTariffPage.setFreeLocalMinBox(dataTable.get("Free Local Minutes"));
        guru99AddTariffPage.setFreeInternMinBox(dataTable.get("Free International Minutes"));
        guru99AddTariffPage.setFreeSmsPackBox(dataTable.get("Free SMS Pack"));
        guru99AddTariffPage.setLocalPerMinBox(dataTable.get("Local Per Minutes Charges"));
        guru99AddTariffPage.setInternChargesBox(dataTable.get("International Per Minutes Charges"));
        guru99AddTariffPage.setSmsChargesBox(dataTable.get("SMS Per Charges"));

    }

    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        guru99AddTariffPage.setSubmitButton();

    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99AddTariffPage.setHeaderVerification(string);
    }

    }