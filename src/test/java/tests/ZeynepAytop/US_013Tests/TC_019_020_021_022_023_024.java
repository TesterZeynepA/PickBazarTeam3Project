package tests.ZeynepAytop.US_013Tests;

import PickBazarProject.pages.ZeynepA.ClothingPages;
import PickBazarProject.utilities.ConfigReader;
import PickBazarProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_019_020_021_022_023_024 {
    /*
    "Given kullanıcı Clothing sayfasına gider "https://shop.clarusway.com/clothing"
    TC_019: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Women Dress"" dropdown
menu butonunu görür
Then kullanıcı ""Women Dress"" dropdown menu butonunu gördüğünü doğrular"

TC_020: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Outer Wear"" dropdown
menu butonunu görür
Then kullanıcı ""Outer Wear"" dropdown menu butonunu gördüğünü doğrular"

TC_021: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Pants"" dropdown
menu butonunu görür
Then kullanıcı ""Pants"" dropdown menu butonunu gördüğünü doğrular"

TC_022: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Tops""
menu butonunu görür
Then kullanıcı ""Tops"" menu butonunu gördüğünü doğrular"

TC_023: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Skirts""
menu butonunu görür
Then kullanıcı ""Skirts"" menu butonunu gördüğünü doğrular"

TC_024: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sol tarafında ""Shirts""
menu butonunu görür
Then kullanıcı ""Shirts"" menu butonunu gördüğünü doğrular"
     */

    @Test(dataProvider = "getDataButtons",dataProviderClass = ClothingPages.class)
    public void test(WebElement data) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarClothingUrl"));

        ClothingPages cp = new ClothingPages();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        Assert.assertTrue(data.isDisplayed());

       // Driver.closeDriver();
    }
}
