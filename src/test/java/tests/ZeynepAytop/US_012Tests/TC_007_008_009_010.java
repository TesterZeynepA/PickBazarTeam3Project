package tests.ZeynepAytop.US_012Tests;

import org.testng.annotations.Test;
import pages.ZeynepAytop.BagsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_007_008_009_010 {
    /*
    "Given kullanıcı Bags sayfasına gider "https://shop.clarusway.com/bags"

 TC_007- When kullanıcı text alanına aradığı ürünü girer
Then kullanıcı Search butonunu tıklar
And aranan ürünün sonuçları sayfada görüntülenir
Then kullanıcı aradığı ürünün sayfada olduğunu doğrular
Test Data: "handbag"

TC_008- When kullanıcı text alanına aradığı ürünü girer
Then kullanıcı Search butonunu tıklar
And ""Sorry, No Product Found :(""  yazısı sayfada görülür
Then kullanıcı aradığı ürünün bulunamadığını doğrular"
Test Data: "Wallet"

TC_009- When kullanıcı text alanına Bags ile ilgili olmayan bir ürün girer
Then kullanıcı Search butonunu tıklar
And ""Sorry, No Product Found :(""  yazısı sayfada görülür
Then kullanıcı aradığı ürünün bulunamadığını doğrular
Test Data: "T-shirt"

TC_010- When kullanıcı text alanına Bags ile ilgili olmayan bir ürün girer
Then kullanıcı Search butonunu tıklar
And kullanıcı aradığı ürün ile ilgisi olmayan ürünleri sayfada görür
Then kullanıcı aradığı ürün ile görüntülenen ürünlerin farklı olduğunu doğrular
Test Data: "Shoes"
     */
    @Test(dataProvider = "getDataProduct",dataProviderClass = BagsPages.class)
    public void test(String data){
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarBagsUrl"));
        BagsPages bp = new BagsPages();

        bp.searchProduct(data);

    }
}
