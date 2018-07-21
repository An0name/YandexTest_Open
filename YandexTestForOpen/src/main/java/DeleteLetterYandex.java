import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class DeleteLetterYandex extends YandexMainPage{

    protected static void inboxLetter() {
        //ожидание выполнения кода, для того, чтобы письмо пришло в папку "Входящие"
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement inbox = driver.findElement(By.linkText("Входящие"));
        inbox.click();
    }

    protected static void clickLetter() {
        WebElement letter = driver.findElement(By.className("b-messages__subject"));
        letter.click();

        WebElement letter1 = driver.findElement(By.className("b-messages__from__text"));
        letter1.click();


    }
    protected static void deleteLetter() {
        WebElement newLetter = driver.findElement(By.name("delete"));
        newLetter.click();
    }

    protected static void checkDeleteLetter() {
        Assert.assertEquals(true, driver.findElement
                (By.className("b-statusline"))
                .getText().contains("Письмо удалено"));
        System.out.println("Проверка на удаление письма прошла успешно. Подробнее в файле: C:TMP/log_file.log");
    }

}
