import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MoveLetter extends YandexMainPage {

    protected static void moveLetter() {
        WebElement deleted = driver.findElement(By.linkText("Удаленные"));
        deleted.click();
    }

    protected static void firstLetter(){
        WebElement letter = driver.findElement(By.className("b-messages__subject"));
        letter.click();
    }

    protected static void firstLetter2(){
        WebElement letter = driver.findElement(By.name("more"));
        letter.click();
    }

    protected static void moveFileDraft() {
        WebElement moveFile = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/select[1]/option[6]"));
        moveFile.click();
    }

    protected static void moveReady() {
        WebElement moveReady = driver.findElement(By.name("move"));
        moveReady.click();
    }


}
