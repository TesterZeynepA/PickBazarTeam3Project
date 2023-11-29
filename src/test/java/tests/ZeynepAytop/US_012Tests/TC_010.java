package tests.ZeynepAytop.US_012Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeynepAytop.BagsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_010 {
    /*
       "Given kullanıcı Bags sayfasına gider "https://shop.clarusway.com/bags"

   TC_010- When kullanıcı text alanına hiçlik ("") girer
   Then kullanıcı Search butonunu tıklar
   And kullanıcı url nin değişmediğini görür
   Then kullanıcı url nin değişmediğini doğrular
   Test Data: ""
        */
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarBagsUrl"));

        String firstUrl= Driver.getDriver().getCurrentUrl();

        BagsPages bp = new BagsPages();
        bp.search.sendKeys("");

        String secondUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(secondUrl, firstUrl);

        Driver.closeDriver();

    }
}
