package ru.yandex.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private WebDriver driver;

    //кнопка "да все привыкли" в куках
    private By cookieButton = By.id("rcc-confirm-button");

    // кнопка "Заказать" вверху страницы
    private By orderButtonTop = By.cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g");

    // кнопка "Заказать" внизу страницы
    private By orderButtonBottom = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    //вопрос и ответ про стоимость аренды самоката
    private By questionsPriceAndPayment = By.id("accordion__heading-0");
    private By replyPriceAndPayment = By.id("accordion__panel-0");

    // вопрос и ответ про кол-во самокатов
    private By questionsNumberOfScooter = By.id("accordion__heading-1");
    private By replyNumberOfScooter = By.id("accordion__panel-1");

    //вопрос и ответ про время аренды
    private By questionsTimeRental = By.id("accordion__heading-2");
    private By replyTimeRental = By.id("accordion__panel-2");

    //вопрос и ответ про "Можно ли заказать самокат на сегодня"
    private By questionsShippingToday = By.id("accordion__heading-3");
    private By replyShippingToday = By.id("accordion__panel-3");

    //вопрос и ответ про продление аренды и отмены заказа
    private By questionsExtendOrder = By.id("accordion__heading-4");
    private By replyExtendOrder = By.id("accordion__panel-4");

    //вопрос и ответ про зарядку для самоката
    private By questionsChargerScooter = By.id("accordion__heading-5");
    private By replyChargerScooter = By.id("accordion__panel-5");

    //вопрос и ответ про отмену заказа
    private By questionsCancelOrder = By.id("accordion__heading-6");
    private By replyCancelOrder = By.id("accordion__panel-6");

    //вопрос и ответ про радиус доставки
    private By questionsRadiusDelivery = By.id("accordion__heading-7");
    private By replyRadiusDelivery = By.id("accordion__panel-7");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }


    //метод для клика по верхней кнопке "Заказать"
    public void clickButtonOrderTop(){
        driver.findElement(orderButtonTop).click();
    }

    //метод для клика по нижней кнопке "Заказать"
    public void clickButtonOrderBottom(){
        WebElement element = driver.findElement(orderButtonBottom);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(orderButtonBottom).click();
    }

    //метод для скролла до последнего вопроса
    public void scrollToLastQuestions (){
        WebElement element = driver.findElement(questionsRadiusDelivery);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //Метод для клика по кнопке с куками
    public void clickButtonCooke(){
        driver.findElement(cookieButton).click();
    }


    //методы для клика по вопросу и получения текста ответа
    public String getTextReplyPriceAndPayment(){
        driver.findElement(questionsPriceAndPayment).click();
        return driver.findElement(replyPriceAndPayment).getText();
    }

    public String getTextReplyNumberOfScooter(){
        driver.findElement(questionsNumberOfScooter).click();
        return driver.findElement(replyNumberOfScooter).getText();
    }

    public String getTextReplyTimeRental(){
        driver.findElement(questionsTimeRental).click();
        return driver.findElement(replyTimeRental).getText();
    }

    public String getTextReplyShippingToday(){
        driver.findElement(questionsShippingToday).click();
        return driver.findElement(replyShippingToday).getText();
    }

    public String getTextReplyExtendOrder(){
        driver.findElement(questionsExtendOrder).click();
        return driver.findElement(replyExtendOrder).getText();
    }

    public String getTextReplyChargerScooter(){
        driver.findElement(questionsChargerScooter).click();
        return driver.findElement(replyChargerScooter).getText();
    }

    public String getTextReplyCancelOrder(){
        driver.findElement(questionsCancelOrder).click();
        return driver.findElement(replyCancelOrder).getText();
    }

    public String getTextReplyRadiusDelivery(){
        driver.findElement(questionsRadiusDelivery).click();
        return driver.findElement(replyRadiusDelivery).getText();
    }
}
