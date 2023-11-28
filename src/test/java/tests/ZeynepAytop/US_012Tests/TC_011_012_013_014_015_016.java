package tests.ZeynepAytop.US_012Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeynepAytop.BagsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_011_012_013_014_015_016 {
    /*
    "Given kullanıcı Bags sayfasına gider "https://shop.clarusway.com/bags"
    TC_011:
When kullanıcı ekranı aşağı doğru kaydırdığında ""Express Delivery"" frame ini görür
Then kullanıcı ""Express Delivery"" frame ini gördüğünü doğrular"

TC_012:(BUG REPORT açıldı)
When kullanıcı ekranı aşağı doğru kaydırdığında ""Express Delivery"" frame i içinde
 ""Save Now"" butonunu görür
Then kullanıcı ""Save Now"" butonunu gördüğünü doğrular"

TC_013:
When kullanıcı ekranı aşağı doğru kaydırdığında ""Cash On Delivery"" frame ini görür
Then kullanıcı ""Cash On Delivery"" frame ini gördüğünü doğrular"

TC_014:(BUG REPORT açıldı)
When kullanıcı ekranı aşağı doğru kaydırdığında ""Cash On Delivery"" frame i içinde
 ""Save Now"" butonunu görür
Then kullanıcı ""Save Now"" butonunu gördüğünü doğrular"

TC_015:
When kullanıcı ekranı aşağı doğru kaydırdığında ""Gift Voucher"" frame ini görür
Then kullanıcı ""Gift Voucher"" frame ini gördüğünü doğrular"

TC_016:(BUG REPORT açıldı)
When kullanıcı ekranı aşağı doğru kaydırdığında ""Gift Voucher"" frame i içinde
 ""Shop Cuopons"" butonunu görür
Then kullanıcı ""Shop Cuopons"" butonunu gördüğünü doğrular"

     */

    @Test(dataProvider = "getDataFrames",dataProviderClass = BagsPages.class)
    public void test(WebElement data) throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarBagsUrl"));
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        Assert.assertTrue(data.isDisplayed());
    }
}
