import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToFindLetter extends YandexMainPage {

    protected static void searchEnter() {
        WebElement moveReady = driver.findElement(By.name("request"));
        moveReady.click();
        moveReady.sendKeys(theme);
        WebElement buttonSearch = driver.findElement(By.name("search"));
        buttonSearch.click();
    }

    protected static void checkSearchLetter() {
        Assert.assertEquals(true, driver.findElement
                (By.className("b-messages__subject"))
                .getText().contains(theme));
        System.out.println("Проверка на поиск темы письма прошла успешно. Подробнее в файле: C:TMP/log_file.log");
    }
}