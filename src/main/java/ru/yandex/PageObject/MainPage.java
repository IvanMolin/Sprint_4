package ru.yandex.PageObject;
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

    //1ый вопрос и ответ
    private By firstQuestions = By.id("accordion__heading-0");
    private By firstReply = By.id("accordion__panel-0");

    //2ой вопрос и ответ
    private By secondQuestions = By.id("accordion__heading-1");
    private By secondReply = By.id("accordion__panel-1");

    //3тий вопрос и ответ
    private By thirdQuestions = By.id("accordion__heading-2");
    private By thirdReply = By.id("accordion__panel-2");

    //4ый вопрос и ответ
    private By fourthQuestions = By.id("accordion__heading-3");
    private By fourthReply = By.id("accordion__panel-3");

    //5ый вопрос и ответ
    private By fifthQuestions = By.id("accordion__heading-4");
    private By fifthReply = By.id("accordion__panel-4");

    //6ой вопрос и ответ
    private By sixQuestions = By.id("accordion__heading-5");
    private By sixReply = By.id("accordion__panel-5");

    //7ой вопрос и ответ
    private By seventhQuestions = By.id("accordion__heading-6");
    private By seventhReply = By.id("accordion__panel-6");

    //8ой вопрос и ответ
    private By eightQuestions = By.id("accordion__heading-7");
    private By eightReply = By.id("accordion__panel-7");

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
        WebElement element = driver.findElement(eightQuestions);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //Метод для клика по кнопке с куками
    public void clickButtonCooke(){
        driver.findElement(cookieButton).click();
    }


    //методы для клика по вопросу и получения текста ответа
    public String getTextFirstQuestion(){
        driver.findElement(firstQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(firstReply).getText());
    }

    public String getTextSecondQuestion(){
        driver.findElement(secondQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(secondReply).getText());
    }

    public String getTextThirdQuestion(){
        driver.findElement(thirdQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(thirdReply).getText());
    }

    public String getTextFourthQuestion(){
        driver.findElement(fourthQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(fourthReply).getText());
    }

    public String getTextFifthQuestion(){
        driver.findElement(fifthQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(fifthReply).getText());
    }

    public String getTextSixthQuestion(){
        driver.findElement(sixQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(sixReply).getText());
    }

    public String getTextSeventhQuestion(){
        driver.findElement(seventhQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(seventhReply).getText());
    }

    public String getTextEighthQuestion(){
        driver.findElement(eightQuestions).click();
        return new WebDriverWait(driver, 5)
                .until(driver -> driver.findElement(eightReply).getText());
    }
}
