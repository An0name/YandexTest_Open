import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FavoritesLetters extends YandexMainPage{

    protected static void favoritsLetter(){
        WebElement letter = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/span[2]/a[2]/span/span[1]/span"));
        letter.click();
    }

    protected static void favoritsLetter2(){
        WebElement letter= driver.findElement(By.name("more"));
        letter.click();
    }

    protected static void moveFavorite() {
        WebElement moveFile = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/select[2]/option[2]"));
        moveFile.click();
    }

    protected static void favoriteReady() {
        WebElement ready = driver.findElement(By.name("move"));
        ready.click();
    }

    protected static void checkFavoriteLetter() {
        Assert.assertNotNull(driver.findElement(By.className("b-mail-icon_important")));
        System.out.println("Проверка на наличие элемента 'Избранное' письма выполнена успешно. Подробнее в файле: C:TMP/log_file.log");

    }
}
