package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonAramaTest extends TestBaseFinal {

    @Test
    public void amazonTest(){
        extentTest = extentReports.createTest("Amazon Arama Testi", "Amazon da urun ismi kontrolu");

        extentTest.info("amazon.com gidelim");
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));

        extentTest.info("AmazonPage den nesne uret");
        AmazonPage amazonPage = new AmazonPage();

        extentTest.info("Arama Kutusuna "+ ConfigurationReader.getProperty("aranilacak_kelime"+ "kelimesini yaz"));
        amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("aranilacak_kelime")+ Keys.ENTER);

        extentTest.info("sonuc bolumunun icerisindeki yazilari alalim");
        String yazilar = amazonPage.sonucBolumu.getText();

        extentTest.info("Assert islemi ile kontrol");
        Assert.assertTrue(yazilar.contains(ConfigurationReader.getProperty("aranilacak_kelime")));
        extentTest.pass("Test PASSED !");
    }
}
