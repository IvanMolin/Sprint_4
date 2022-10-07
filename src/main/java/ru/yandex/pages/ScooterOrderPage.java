package ru.yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterOrderPage {
    private WebDriver driver;

// первая форма для заказа самоката

    // поле для ввода имени
    private By fieldName = By.xpath(".//*[@placeholder='* Имя']");

    // поле для ввода фамилии
    private By fieldLastName = By.xpath(".//input[@placeholder='* Фамилия']");

    // поле для ввода адреса доставки
    private By fieldAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    // поле для ввода и выбора станции метро
    private By fieldMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");

    // поле для ввода номера телефона
    private By fieldPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //кнопка "Далее"
    private By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']");


    public ScooterOrderPage(WebDriver driver) {
        this.driver = driver;
    }


    // метод клика на поле
    public void clickFieldName(){
        driver.findElement(fieldName).click();
    }
    // метод для ввода имени
    public void inputName(String name){
        driver.findElement(fieldName).sendKeys(name);
    }

    // метод для ввода фамилии
    public void inputLastName(String lastName) {
        driver.findElement(fieldLastName).sendKeys(lastName);
    }

    // метод для ввода адреса
    public void inputAddress(String address){
        driver.findElement(fieldAddress).sendKeys(address);
    }

    // метод для выбора станции метро
    public void inputMetroStation(String station){
        driver.findElement(fieldMetroStation).sendKeys(station);
        driver.findElement(fieldMetroStation).sendKeys(Keys.DOWN);
        driver.findElement(fieldMetroStation).sendKeys(Keys.ENTER);
    }

    // метод для ввода номера телефона
    public void inputPhoneNumber(String phoneNumbers){
        driver.findElement(fieldPhoneNumber).sendKeys(phoneNumbers);
    }

    // метод для нажатия на кнопку "Далее"
    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }


    // шаг для заполнения формы "Для кого самокат"
    public void enterOrderForm (String name, String lastName, String address, String station, String phoneNumbers){
        inputName(name);
        inputLastName(lastName);
        inputAddress(address);
        inputMetroStation(station);
        inputPhoneNumber(phoneNumbers);
        clickNextButton();
    }





}
