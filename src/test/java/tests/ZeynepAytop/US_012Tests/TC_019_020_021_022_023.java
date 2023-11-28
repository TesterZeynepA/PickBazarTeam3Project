package tests.ZeynepAytop.US_012Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeynepAytop.BagsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_019_020_021_022_023 {
    /*
    "Given kullanıcı Bags sayfasına gider
    TC_019: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında""Purse"" menu
butonunu görür
Then kullanıcı ""Purse"" menu butonunu gördüğünü doğrular

TC_020: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Hand bags""
menu butonunu görür
Then kullanıcı ""Hand bags"" menu butonunu gördüğünü doğrular"

TC_021: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Shoulder bags""
menu butonunu görür
Then kullanıcı ""Shoulder bags"" menu butonunu gördüğünü doğrular"

TC_022: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Wallet""
menu butonunu görür
Then kullanıcı ""Wallet"" menu butonunu gördüğünü doğrular"

TC_023: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Laptop bags""
menu butonunu görür
Then kullanıcı ""Laptop bags"" menu butonunu gördüğünü doğrular"
     */

    @Test(dataProvider = "getDataButtons",dataProviderClass = BagsPages.class)
    public void test(WebElement data) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarBagsUrl"));

        BagsPages bp = new BagsPages();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        Assert.assertTrue(data.isDisplayed());

        Driver.closeDriver();
    }
}
