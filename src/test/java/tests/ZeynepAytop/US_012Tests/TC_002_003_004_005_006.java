package tests.ZeynepAytop.US_012Tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeynepAytop.BagsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_002_003_004_005_006 {
    /*
    "Given kullanıcı Bags sayfasına gider "https://shop.clarusway.com/bags"

    TC_002: When kullanıcı ekranda ""Exclusive Branded bags"" yazısını görür
    Then kullanıcı ekranda ""Exclusive Branded bags"" yazısını gördüğünü doğrular

    TC_003: When kullanıcı ekranda ""Get your exclusive & branded bags delivered to you in no time""
    yazısını görür
    Then kullanıcı ekranda ""Get your exclusive & branded bags delivered to you in no time""
     yazısını gördüğünü doğrular

     TC_004: When kullanıcı ekranda ""Search"" seçeneğini görür
    Then kullanıcı ekranda ""Search"" seçeneğini gördüğünü doğrular

    TC_005: When kullanıcı arama yapmak için ekranda text alanını görür
    Then kullanıcı ekranda text alanını gördüğünü doğrular

    TC_006: When kullanıcı ekranda Search butonunu görür
    Then kullanıcı ekranda Search butonunu gördüğünü doğrular
     */
    @Test(dataProvider = "getData",dataProviderClass = BagsPages.class)
    public void test(WebElement data){

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarBagsUrl"));
        Assert.assertTrue(data.isDisplayed());
        Driver.closeDriver();
    }

}
