import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class MailYandex extends YandexMainPage {
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    protected static void lightVersion() {
        WebElement light = wait.until(visibilityOfElementLocated(By.linkText("Лёгкая версия")));
        light.click();
    }

    protected static void writeLetter() {
        WebElement newLetter = wait.until(visibilityOfElementLocated(By.linkText("Написать")));
        newLetter.click();
    }

    protected static void forWhom() {
        WebElement forWhom = wait.until(visibilityOfElementLocated(By.name("to")));
        forWhom.click();
        forWhom.sendKeys(loginYandexMail);
        forWhom.sendKeys(Keys.TAB);
    }

    protected static void newTheme() {
        WebElement newTheme = driver.findElement(By.name("subj"));
        newTheme.click();
        newTheme.sendKeys(theme);
    }

    protected static void sendLetter() {
        WebElement sendButton = driver.findElement((By.name("doit")));
        sendButton.click();

    }

    protected static void checkLetter() {
        Assert.assertEquals(true, driver.findElement
                (By.className("b-statusline"))
                .getText().contains("Письмо отправлено"));
        System.out.println("Проверка на отправку письма прошла успешно. Подробнее в файле: C:TMP/log_file.log");
    }


}
