package tests.ZeynepAytop.US_012Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeynepAytop.HomePages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001 {
    /*
    "Given kullanıcı ana sayfaya gider "https://shop.clarusway.com/"
When kullanıcı dropdown menüden Bags'ı seçer
Then kullanıcı Bags ı seçtiğini doğrular"
     */

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        HomePages hp = new HomePages();
        hp.selectBags();

       Assert.assertTrue(hp.dropDown.getText().contains("Bags"));

       Driver.closeDriver();






    }
}
