package tests.ZeynepAytop.US_013Tests;

import PickBazarProject.pages.ZeynepA.ClothingPages;
import PickBazarProject.utilities.ConfigReader;
import PickBazarProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_018 {
    /*
    "Given kullanıcı Clothing sayfasına gider "https://shop.clarusway.com/clothing"
When kullanıcı ekranı aşağı doğru kaydırdığında sayfanın sağ tarafında Clothing
 ile ilgili ürünlerin fiyatlarını görür
Then kullanıcı sayfada Clothing ile ilgili ürünlerin fiyatlarını gördüğünü doğrular"
     */
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarClothingUrl"));

        ClothingPages cp = new ClothingPages();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        Assert.assertTrue(cp.clothingProductPrice.getText().contains("$"));

        Driver.closeDriver();

    }
}
