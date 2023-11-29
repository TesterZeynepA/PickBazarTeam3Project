package tests.ZeynepAytop.US_012Tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeynepAytop.BagsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_007 {
    /*
    "Given kullanıcı Bags sayfasına gider "https://shop.clarusway.com/bags"

 TC_007- When kullanıcı text alanına aradığı ürünü girer
Then kullanıcı Search butonunu tıklar
And aranan ürünün sonuçları sayfada görüntülenir
Then kullanıcı aradığı ürünün sayfada olduğunu doğrular
Test Data: "handbag"

     */
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarBagsUrl"));
        BagsPages bp = new BagsPages();

        bp.search.sendKeys("handbag" + Keys.ENTER);

        Assert.assertTrue(bp.firstProduct.isDisplayed());

        Driver.closeDriver();

    }
}
