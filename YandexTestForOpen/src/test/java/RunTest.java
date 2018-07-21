
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunTest extends YandexMainPage {

    // Инициализация логера
    private static final Logger log = Logger.getLogger(RunTest.class);

    @Before
    public void setUp() {
        log.info("Драйвер прогружен");
        log.info("Запуск теста");
        log.info("Открыт браузер");
    }

    @After
    public void end() {
        //Закрываем браузер после окончания любого теста
        driver.close();
    }

    @Test
    public void testSendLetter_01() {
        YandexMainPage.openMainPageYa();
        log.info("Открыта главная страница Яндекс");
        YandexMainPage.openMailYandex(); //
        log.info("Открыт вход в почту");
        YandexMainPage.loginMailYandex();
        log.info("Логин введен");
        YandexMainPage.passwordMailYandex();
        log.info("Пароль введен");
        YandexMainPage.enterMail();
        log.info("Вход выполнен");
        MailYandex.lightVersion();
        log.info("Перешли в легкую версию");
        MailYandex.writeLetter();
        log.info("Написать сообщение выбрано");
        MailYandex.forWhom();
        log.info("Выбрали свой Email для получателя");
        MailYandex.newTheme();
        log.info("Новая тема сообщения создана");
        MailYandex.sendLetter();
        log.info("Письмо отправлено");
        MailYandex.checkLetter();
        log.info("Проверка на отправку прошла успешно");
    }

    @Test
    public void testDeleteLetter_02() {
        YandexMainPage.openMainPageYa();
        log.info("Открыта главная страница Яндекс");
        YandexMainPage.openMailYandex(); //
        log.info("Открыт вход в почту");
        YandexMainPage.loginMailYandex();
        log.info("Логин введен");
        YandexMainPage.passwordMailYandex();
        log.info("Пароль введен");
        YandexMainPage.enterMail();
        log.info("Вход выполнен");
        MailYandex.lightVersion();
        log.info("Перешли в легкую версию");
        DeleteLetterYandex.inboxLetter();
        log.info("Перешли во Входящие");
        DeleteLetterYandex.clickLetter();
        log.info("Удалили сообщение");
        DeleteLetterYandex.deleteLetter();
        log.info("Сообщение удалено");
        DeleteLetterYandex.checkDeleteLetter();
        log.info("Проверка на удаление письма прошла успешно");
    }

    @Test
    public void testMoveLetter_03() {
        YandexMainPage.openMainPageYa();
        log.info("Открыта главная страница Яндекс");
        YandexMainPage.openMailYandex(); //
        log.info("Открыт вход в почту");
        YandexMainPage.loginMailYandex();
        log.info("Логин введен");
        YandexMainPage.passwordMailYandex();
        log.info("Пароль введен");
        YandexMainPage.enterMail();
        log.info("Вход выполнен");
        MailYandex.lightVersion();
        log.info("Перешли в легкую версию");
        MoveLetter.moveLetter();
        log.info("Перешли в папку Удаленные");
        MoveLetter.firstLetter();
        log.info("Перешли в первое удаленное письмо");
        MoveLetter.firstLetter2();
        log.info("Перешли в раздел ЕЩЕ для перемещения письма");
        MoveLetter.moveFileDraft();
        log.info("Выбрали Черновики");
        MoveLetter.moveReady();
        log.info("Переместили сообщение");
    }

    @Test
    public void testSearchLetter_04() {
        YandexMainPage.openMainPageYa();
        log.info("Открыта главная страница Яндекс");
        YandexMainPage.openMailYandex(); //
        log.info("Открыт вход в почту");
        YandexMainPage.loginMailYandex();
        log.info("Логин введен");
        YandexMainPage.passwordMailYandex();
        log.info("Пароль введен");
        YandexMainPage.enterMail();
        log.info("Вход выполнен");
        MailYandex.lightVersion();
        log.info("Перешли в легкую версию");
        ToFindLetter.searchEnter();
        log.info("Начало поиска письма по теме: "+theme);
        ToFindLetter.checkSearchLetter();
        log.info("Проверка на поиск письма по теме сообщения прошла успешно. Найдено письмо с темой: "+theme);
    }

    @Test
    public void testFavoriteLetter_05() {
        YandexMainPage.openMainPageYa();
        log.info("Открыта главная страница Яндекс");
        YandexMainPage.openMailYandex(); //
        log.info("Открыт вход в почту");
        YandexMainPage.loginMailYandex();
        log.info("Логин введен");
        YandexMainPage.passwordMailYandex();
        log.info("Пароль введен");
        YandexMainPage.enterMail();
        log.info("Вход выполнен");
        MailYandex.lightVersion();
        log.info("Перешли в легкую версию");
        ToFindLetter.searchEnter();
        log.info("Начало поиска письма по теме: "+theme);
        FavoritesLetters.favoritsLetter();
        log.info("Выбираем первое письмо для Избранного");
        FavoritesLetters.favoritsLetter2();
        log.info("Выбираем ЕЩЕ...");
        FavoritesLetters.moveFavorite();
        log.info("Помечаем письмо как Важное");
        FavoritesLetters.favoriteReady();
        log.info("Подтверждаем выполнение действий");
        FavoritesLetters.checkFavoriteLetter();
    }

}
