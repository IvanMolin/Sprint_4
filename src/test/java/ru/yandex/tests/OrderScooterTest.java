package ru.yandex.tests;

import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;
import ru.yandex.pages.MainPage;
import ru.yandex.pages.ScooterOrderPage;
import ru.yandex.pages.ScooterRentalPage;

public class OrderScooterTest extends BaseTest {


    // тест заказ самоката с помощью верхней кнопки "Заказать"
    @Test
    public void orderScooterOne(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.clickButtonOrderTop();
        ScooterOrderPage objScooterOrderPage = new ScooterOrderPage(driver);
        objScooterOrderPage.enterOrderForm(
                "Иван",
                "Молин",
                "Виктора-Уса 7, кв 25",
                "Октябрьская",
                "89994592222");
        ScooterRentalPage objScooterRentalPage = new ScooterRentalPage(driver);
        objScooterRentalPage.enterRentalDetails( "10.10.2022","Домофон не работает. Позвоните");
        objScooterRentalPage.clickButtonConfirm();
        String expected = "Заказ оформлен";
        String actual = objScooterRentalPage.getTextSuccessfulOrder();
        MatcherAssert.assertThat(actual, containsString(expected));

    }

    // тест заказ самоката с помощью нижней кнопки "Заказать"
    @Test
    public void orderScooterTwo(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonCooke();
        objMainPage.clickButtonOrderBottom();
        ScooterOrderPage objScooterOrderPage = new ScooterOrderPage(driver);
        objScooterOrderPage.enterOrderForm(
                "Александр",
                "Петровский",
                "Быкова 23",
                "Смоленская",
                "+79994592223");
        ScooterRentalPage objScooterRentalPage = new ScooterRentalPage(driver);
        objScooterRentalPage.enterRentalDetails( "12.10.2022","I am waiting");
        objScooterRentalPage.clickButtonConfirm();
        String expected = "Заказ оформлен";
        String actual = objScooterRentalPage.getTextSuccessfulOrder();
        MatcherAssert.assertThat(actual, containsString(expected));

    }




}
