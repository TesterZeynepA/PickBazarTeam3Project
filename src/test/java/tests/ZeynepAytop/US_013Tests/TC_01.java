package tests.ZeynepAytop.US_013Tests;

import PickBazarProject.pages.ZeynepA.HomePages;
import PickBazarProject.utilities.ConfigReader;
import PickBazarProject.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01 {
    /*
    "Given kullanıcı ana sayfaya gider "https://shop.clarusway.com/"
When kullanıcı dropdown menüden Clothing'i seçer
Then kullanıcı Clothing'i seçtiğini doğrular"
     */

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        HomePages hp = new HomePages();
        hp.selectClothing();

        Assert.assertTrue(hp.dropDown.getText().contains("Clothing"));

        Driver.closeDriver();
    }
}

