package ru.yandex.tests;

import org.junit.Test;
import ru.yandex.pages.MainPage;
import static org.junit.Assert.*;


public class AnswersToQuestionsTest extends BaseTest {


    @Test
    public void checkReplyPriceAndPaymentQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = objMainPage.getTextReplyPriceAndPayment();
        assertEquals(expected,actual);
    }

    @Test
    public void checkNumberOfScooterQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = objMainPage.getTextReplyNumberOfScooter();
        assertEquals(expected,actual);
    }

    @Test
    public void checkTimeRentalQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String actual = objMainPage.getTextReplyTimeRental();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected,actual);
    }

    @Test
    public void checkShippingTodayQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = objMainPage.getTextReplyShippingToday();
        assertEquals(expected,actual);
    }

    @Test
    public void checkExtendOrderQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = objMainPage.getTextReplyExtendOrder();
        assertEquals(expected,actual);
    }

    @Test
    public void checkChargerScooterQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = objMainPage.getTextReplyChargerScooter();
        assertEquals(expected,actual);
    }

    @Test
    public void checkCancelOrderQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = objMainPage.getTextReplyCancelOrder();
        assertEquals(expected,actual);
    }

    @Test
    public void checkRadiusDeliveryQuestionText(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.scrollToLastQuestions();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = objMainPage.getTextReplyRadiusDelivery();
        assertEquals(expected,actual);
    }



}
