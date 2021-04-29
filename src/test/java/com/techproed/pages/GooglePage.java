package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    /*
    1. Örnek : Gmail Linkine Tıklama ve Adres Doğrulama
   a) Google.com'a gideceğiz.
   b) Gmail linkini bulup tıklayacağız.
   c) Gittiğimiz sayfanın başlığını doğrulayacağız.
   * pages paketinin altına GooglePage Class'ı oluşturacağız. Ve bu Class'ın içerisinde WebElement arama işlemi gerçekleştireceğiz (@FindBy ile)
   * tests paketinin altına GoogleGmailTest Class'ı oluşturacağız. Ve bu Class'ın içerisinde sırasıyla;
      1. Driver class'ı yardımıyla, Google.com'a gideceğiz.
      2. GooglePage class'ından nesne üreteceğiz.
      3. Nesnenin içerisindeki webelementi kullanacağız.
      4. Assert işlemi yapacağız.
     */

    public GooglePage(){
        // GooglePage constructure inizi olusturan sabit kod sudur;
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (partialLinkText = "Gmail")
    public WebElement gmailLinki;
}