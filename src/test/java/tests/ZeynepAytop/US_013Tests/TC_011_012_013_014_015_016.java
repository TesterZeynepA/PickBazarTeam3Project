package tests.ZeynepAytop.US_013Tests;

import PickBazarProject.pages.ZeynepA.ClothingPages;
import PickBazarProject.utilities.ConfigReader;
import PickBazarProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_011_012_013_014_015_016 {
    /*
    "Given kullanıcı Clothing sayfasına gider "https://shop.clarusway.com/clothing"

    TC_011: When kullanıcı ekranı aşağı doğru kaydırdığında ""Express Delivery"" frame ini görür
Then kullanıcı ""Express Delivery"" frame ini gördüğünü doğrular"

TC_012: BUG TİCKET AÇILDI
When kullanıcı ekranı aşağı doğru kaydırdığında ""Express Delivery"" frame i içinde
 ""Save Now"" butonunu görür
Then kullanıcı ""Save Now"" butonunu gördüğünü doğrular"

TC_013: When kullanıcı ekranı aşağı doğru kaydırdığında ""Cash On Delivery"" frame ini görür
Then kullanıcı ""Cash On Delivery"" frame ini gördüğünü doğrular"

TC_014: BUG TİCKET AÇILDI
When kullanıcı ekranı aşağı doğru kaydırdığında ""Cash On Delivery"" frame i içinde
 ""Save Now"" butonunu görür
Then kullanıcı ""Save Now"" butonunu gördüğünü doğrular"

TC_015: When kullanıcı ekranı aşağı doğru kaydırdığında ""Gift Voucher"" frame ini görür
Then kullanıcı ""Gift Voucher"" frame ini gördüğünü doğrular"

TC_016: BUG TİCKET AÇILDI
When kullanıcı ekranı aşağı doğru kaydırdığında ""Gift Voucher"" frame i içinde
 ""Shop Cuopons"" butonunu görür
Then kullanıcı ""Shop Cuopons"" butonunu gördüğünü doğrular"

     */
    @Test(dataProvider = "getDataFrames",dataProviderClass = ClothingPages.class)
    public void test(WebElement data) throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarClothingUrl"));
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        Assert.assertTrue(data.isDisplayed());

        Driver.closeDriver();
    }
}
