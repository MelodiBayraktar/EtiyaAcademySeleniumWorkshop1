package org.etiya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Bir kullanıcı olarak ben adım adım nasıl yapıyorum?
        //Görüntü = HTML

        WebDriver webDriver = new ChromeDriver();
        //webDriver.get();
        webDriver.navigate().to("https://www.saucedemo.com/v1/");
        String title = webDriver.getTitle();
        System.out.println(title);

        //Locator = Html'deki bir elemente ulaşmak için gerekli rota
        //xpath =*[@id="login_button_container]/div/form
        //fullxpath = her zaman en  baştan başlar

        //findElement() belirtilen ögeyi bulur, By türünde by alır, By.id, By.className , By.tagName methodları vardır
        WebElement usernameInput = webDriver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");

        Thread.sleep(1000);

        //sendKeys() fonksiyonu input alanına değer girmeyi sağlar, içine CharSequence değerlerini alır
        WebElement passwordInput = webDriver.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");

        Thread.sleep(1000);

        //getText(): Belirtilen öğenin metin içeriğini alır, parametre almaz ve geriye string bir değer döner.
        WebElement element = webDriver.findElement(By.id("login-button"));
        String text = element.getText();
        System.out.println(text);

        Thread.sleep(1000);

        //getAttribute():   bir web elementinin belirli bir özniteliğini alır ve String türünde bir değer döndürür.
        WebElement element2 = webDriver.findElement(By.id("user-name"));
        String value = element2.getAttribute("class");
        System.out.println(value);

        //clear()  fonksiyon bir input alanındaki metni temizler ve parametre almaz.
        WebElement input = webDriver.findElement(By.id("password"));
        input.clear();

        //isSelected()  fonksiyon bir checkbox'un seçili olup olmadığını kontrol eder ve boolean türünde bir değer döndürür.
        WebElement checkbox = webDriver.findElement(By.id("myCheckbox"));
        boolean isSelected = checkbox.isSelected();

        //isEnabled() fonksiyon bir web elementinin etkin olup olmadığını kontrol eder ve boolean türünde bir değer döndürür.
        WebElement button = webDriver.findElement(By.id("login-button"));
        boolean isEnabled = button.isEnabled();

        //submit() fonksiyon bir formu gönderir (submit) ve parametre almaz.
        WebElement form = webDriver.findElement(By.id("myForm"));
        form.submit();

        //getTagName() fonksiyon bir web elementinin etiket adını (tag name) alır ve String türünde bir değer döndürür.
        WebElement element3 = webDriver.findElement(By.id("user-name"));
        String tagName = element3.getTagName();

        //click() fonksiyonu belirtilen ögeye tıklar, bir parametre almaz.
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(1000);


        webDriver.quit();

    }
}
//en az 10 adet selenium fonksiyonu
//click fonksiyonu .. yapar ... parametrelerini alır
//loginbutton.click()