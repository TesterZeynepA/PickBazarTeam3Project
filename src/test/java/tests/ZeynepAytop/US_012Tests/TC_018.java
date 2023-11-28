package tests.ZeynepAytop.US_012Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeynepAytop.BagsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_018 {
    /*
    "Given kullanıcı Bags sayfasına gider "https://shop.clarusway.com/bags"
     TC_018: When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sağ tarafında bags
 ile ilgili ürünlerin fiyatlarını görür
Then kullanıcı sayfada bags ile ilgili ürünlerin fiyatlarını gördüğünü doğrular"
     */
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarBagsUrl"));

        BagsPages bp = new BagsPages();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        Assert.assertTrue(bp.bagsProductPrice.getText().contains("$"));

        Driver.closeDriver();

    }
}
