package pages.ZeynepAytop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePages {

    public HomePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='whitespace-nowrap'])[1]")
    public WebElement dropDown;

    @FindBy(xpath = "(//*[contains(text(),'Bags')])[1]")
    public WebElement bags;

    public void selectBags(){
dropDown.click();

Actions actions = new Actions(Driver.getDriver());
actions.moveToElement(bags).click(bags).perform();

    }

}
