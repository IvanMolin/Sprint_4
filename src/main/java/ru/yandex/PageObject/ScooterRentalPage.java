package ru.yandex.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterRentalPage {
    private WebDriver driver;

    // вторая форма заказа "Про аренду"
    // заголовок формы "Про аренду"
    private By headerOrderScooterTwo = By.className("Order_Header__BZXOb");

    //поле для выбора даты доставки самоката
    private  By fieldDateDelivery = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //поле для выбора срока аренды
    private By fieldTermRent = By.className("Dropdown-placeholder");
    // элемент для выбора срока - "двое суток"
    private By termOfTwoDays = By.xpath(".//div[@class='Dropdown-menu']/div[2]");
    //элемент для выбора срока - "пятеро суток"
    private By termOfFiveDays = By.xpath(".//div[@class='Dropdown-menu']/div[5]");

    //чекбокс для выбора черного цвета самоката
    private By checkboxBlackColor = By.id("black");

    //чекбокс для выбора белого цвета самоката
    private By checkboxGreyColor = By.id("grey");

    // поле для ввода комментария
    private By fieldInputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    // кнопка "Заказать"
    private By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

    // кнопка "Да" в подтверждении заказа
    private By buttonConfirmOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");

    // Форма "Заказ оформлен"
    private By orderFormCompleted = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");


    public ScooterRentalPage(WebDriver driver){
        this.driver = driver;
    }

    // метод для ожидания загрузки формы "Про аренду"
    public void waitingHeaderRental(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(headerOrderScooterTwo));
    }


    // метод для ввода даты доставки самоката
    public void inputDeliveryDate(String time){
        driver.findElement(fieldDateDelivery).sendKeys(time);
        driver.findElement(fieldDateDelivery).sendKeys(Keys.ENTER);
    }

    // метод для выбора срока аренды
    public void chooseRentalPeriod(){
        driver.findElement(fieldTermRent).click();
        driver.findElement(termOfTwoDays).click();
    }

    // метод для выбора черного цвета самоката
    public void chooseBlackColor(){
        driver.findElement(checkboxBlackColor).click();
    }

    // метод для ввода комментария
    public void inputComment(String comment){
        driver.findElement(fieldInputComment).sendKeys(comment);
    }

    // метод для нажатия кнопки "заказать"
    public void clickOrderButton(){
        driver.findElement(buttonOrder).click();
    }

    // метод для нажатия кнопки "ДА" в подтверждении заказа
    public void clickButtonConfirm(){
        driver.findElement(buttonConfirmOrder).click();
    }

    // метод (шаг) для заполнения формы "Про аренду"
    public void enterRentalDetails(String time, String comment){
        inputDeliveryDate(time);
        chooseRentalPeriod();
        chooseBlackColor();
        inputComment(comment);
        clickOrderButton();
    }

    // метод для проверки успешного создания заказа
    public String getTextSuccessfulOrder(){
        return driver.findElement(orderFormCompleted).getText();
    }


}
