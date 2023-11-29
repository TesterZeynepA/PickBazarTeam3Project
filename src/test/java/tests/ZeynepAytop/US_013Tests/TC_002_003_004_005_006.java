package tests.ZeynepAytop.US_013Tests;

import PickBazarProject.pages.ZeynepA.ClothingPages;
import PickBazarProject.utilities.ConfigReader;
import PickBazarProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_003_004_005_006 {
    /*
    "Given kullanıcı Clothing sayfasına gider "https://shop.clarusway.com/clothing"

    TC_002: When kullanıcı ekranda ""Shop your designer dresses""  yazısını görür
Then kullanıcı ekranda ""Shop your designer dresses""  yazısını gördüğünü doğrular"

TC_003: When kullanıcı ekranda ""Ready to wear dresses tailored for you online. Hurry up while stock lasts.""
yazısını görür
Then kullanıcı ekranda  ""Ready to wear dresses tailored for you online. Hurry up while stock lasts.""
 yazısını gördüğünü doğrular"

TC_004: When kullanıcı ekranda ""Search"" seçeneğini görür
Then kullanıcı ekranda ""Search"" seçeneğini gördüğünü doğrular"

TC_005: When kullanıcı arama yapmak için ekranda text alanını görür
Then kullanıcı ekranda text alanını gördüğünü doğrular

TC_006: When kullanıcı ekranda Search butonunu görür
Then kullanıcı ekranda Search butonunu gördüğünü doğrular

     */
    @Test(dataProvider = "getData",dataProviderClass = ClothingPages.class)
    public void test(WebElement data){

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarClothingUrl"));
        Assert.assertTrue(data.isDisplayed());
       // Driver.closeDriver();
    }

}
