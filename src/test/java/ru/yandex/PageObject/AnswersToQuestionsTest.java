package ru.yandex.PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;


public class AnswersToQuestionsTest {
    private WebDriver driver;


    @Before
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");
    }


    @Test
    public void checkFirstQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String actual = objMainPage.getTextFirstQuestion();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expected,actual);
    }

    @Test
    public void checkSecondQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = objMainPage.getTextSecondQuestion();
        assertEquals(expected,actual);
    }

    @Test
    public void checkThirdQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String actual = objMainPage.getTextThirdQuestion();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected,actual);
    }

    @Test
    public void checkFourthQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = objMainPage.getTextFourthQuestion();
        assertEquals(expected,actual);
    }

    @Test
    public void checkFifthQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = objMainPage.getTextFifthQuestion();
        assertEquals(expected,actual);
    }

    @Test
    public void checkSixthQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = objMainPage.getTextSixthQuestion();
        assertEquals(expected,actual);
    }

    @Test
    public void checkSeventhQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = objMainPage.getTextSeventhQuestion();
        assertEquals(expected,actual);
    }

    @Test
    public void checkEighthQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = objMainPage.getTextEighthQuestion();
        assertEquals(expected,actual);
    }

    @After
    public void cleanUp(){
        driver.quit();
    }

}
