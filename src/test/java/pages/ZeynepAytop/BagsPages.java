package pages.ZeynepAytop;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class BagsPages {
    public BagsPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Exclusive Branded bags')]")
    public WebElement text;

    @FindBy(xpath = "//p[@class='text-sm text-heading lg:text-base xl:text-lg']")
    public WebElement text2;

    @FindBy(id = "search")
    public WebElement textBox;

    @FindBy(xpath = "//button[@class='flex h-full min-w-[143px] items-center justify-center rounded-lg bg-accent px-8 font-semibold text-light transition-colors duration-200 hover:bg-accent-hover focus:bg-accent-hover focus:outline-none ltr:rounded-tl-none ltr:rounded-bl-none rtl:rounded-tr-none rtl:rounded-br-none']")
    public WebElement searchButton;

    @FindBy(xpath = "//form[@class='w-full']")
    public WebElement searchArea;

    @DataProvider
    public Object[][] getData(){

        Object[][] data = {{text},{text2},{textBox},{searchButton},{searchArea}};

        return data;
    }

    @FindBy(xpath = "//input[@id='search']")
    public WebElement search;

    @FindBy(xpath = "(//h3[@role='button'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//h3[@class='w-full text-center text-xl font-semibold text-body my-7']")
    public WebElement noFoundProduct;

    public void searchProduct(String str){

        SoftAssert softAssert = new SoftAssert();

        search.sendKeys(str + Keys.ENTER);

        if (firstProduct.isDisplayed()) {
            Assert.assertTrue(firstProduct.isDisplayed());
            System.out.println("ürün bulundu");
        }else if (noFoundProduct.isDisplayed()){
            Assert.assertTrue(noFoundProduct.isDisplayed(), "Ürün bulunamadı mesajı görüntülenmedi!");
            System.out.println("ürün bulunamadı");
        }

        softAssert.assertAll();
    }

    @DataProvider
    public Object[][] getDataProduct(){

        Object[][] data = {{"handbag"},{"Wallet"},{"T-shirt"},{"Shoes"}};

        return data;
    }

    @FindBy(xpath = "(//img[@data-nimg='responsive'])[1]")
    public WebElement expressDelivery;
    @FindBy(xpath = "(//img[@data-nimg='responsive'])[2]")
    public WebElement cashOnDelivery;
    @FindBy(xpath = "(//img[@data-nimg='responsive'])[3]")
    public WebElement giftVoucher;

    @DataProvider
    public Object[][] getDataFrames(){

        Object[][] data = {{expressDelivery},{cashOnDelivery},{giftVoucher}};

        return data;
    }

    @FindBy(xpath = "//h3[contains(text(),'Gucci Purse')]")
    public WebElement bagsProduct;

    @FindBy(xpath = "//span[contains(text(),'$90.00')]")
    public WebElement bagsProductPrice;

    @FindBy(xpath = "//span[contains(text(),'Hand bags')]")
    public WebElement handsBags;

    @FindBy(xpath = "//span[contains(text(),'Laptop bags')]")
    public WebElement laptopBags;

    @FindBy(xpath = "//span[contains(text(),'Shoulder bags')]")
    public WebElement shoulderBags;

    @FindBy(xpath = "//span[contains(text(),'Purse')]")
    public WebElement purseBags;

    @FindBy(xpath = "//span[contains(text(),'Wallet')]")
    public WebElement walletBags;


    @DataProvider
    public Object[][] getDataButtons(){

        Object[][] data = {{handsBags},{laptopBags},{shoulderBags},{purseBags},{walletBags}};

        return data;
    }


}

