import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.DriverLoad;
import java.util.concurrent.TimeUnit;

public class YandexMainPage extends DriverLoad {

    static String mainURL = "https://yandex.ru/";
    static String loginYandexMail = "Yand3xOpenTest3@yandex.ru";
    static String passYandexMail = "testOpenTest1";
    static String theme = "Новая тема сообщения";

    protected static void openMainPageYa() {
        driver.get(mainURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    protected static void openMailYandex(){
        WebElement mailYa = driver.findElement(By.linkText("Войти в почту"));
        mailYa.click();
    }

    protected static void loginMailYandex(){
        WebElement loginYA = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/form/div[1]/label/input"));
        loginYA.click();
        loginYA.sendKeys(loginYandexMail);
    }

    protected static void passwordMailYandex(){
        WebElement passYA = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/form/div[2]/label/input"));
        passYA.click();
        passYA.sendKeys(passYandexMail);
    }

    protected static void enterMail(){
        WebElement enterMail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/form/div[4]/button[1]/span/span"));
        enterMail.click();
    }



}