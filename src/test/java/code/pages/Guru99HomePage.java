package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage extends BrowserUtils{

    public Guru99HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[.='Add Tariff Plan']")
    private WebElement addTariffPlanLink;

    public void setAddTariffPlanLink() {
       addTariffPlanLink.click();
    }




}
