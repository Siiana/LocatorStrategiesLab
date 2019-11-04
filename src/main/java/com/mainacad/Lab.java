package com.mainacad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Lab
{
    public static void main( String[] args )
    {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver","src/main/java/com/mainacad/drivers/chromedriver.exe");

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        driver.findElement(By.cssSelector("#cookie_action_close_header")).click();

        //TODO: Вывести в консоль текст Инфо сообщения
        String infoMessage = driver.findElement(By.cssSelector("p:nth-child(3) em")).getText();
        System.out.println(infoMessage);


        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        String title = driver.findElement(By.cssSelector("legend strong")).getText();
        System.out.println(title);

        //TODO: Кликнуть линк Partial Link Test
        driver.findElement(By.linkText("Partial Link Test")).click();

        //TODO: Заполнить поле First name:
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Tanya");

        //TODO: Заполнить поле Last name:
        driver.findElement(By.cssSelector("input#lastname")).sendKeys("Kuksa");

        //TODO: Выбрать пол
        driver.findElement(By.cssSelector("div:nth-of-type(14) > input:nth-of-type(2)")).click();

        //TODO: Выбрать количество лет опыта
        driver.findElement(By.cssSelector("div:nth-of-type(18) > input:nth-of-type(1)")).click();

        //TODO: Заполнить поле дата
        driver.findElement(By.cssSelector("input#datepicker")).sendKeys("01.11.2019");

        //TODO: Выбрать несколько Automation Tool
        driver.findElement(By.cssSelector("div:nth-of-type(29) > input:nth-of-type(2)")).click();
        driver.findElement(By.cssSelector("div:nth-of-type(29) > input:nth-of-type(3)")).click();

        //TODO: Выбрать континент из выпадающего списка
        Select continents = new Select(driver.findElement(By.name("continents")));
        continents.selectByVisibleText("Europe");

        //TODO: Выбрать несколько вариантов из списка Selenium Commands
        Select seleniumCommands = new Select(driver.findElement(By.name("selenium_commands")));
        seleniumCommands.selectByIndex(0);
        seleniumCommands.selectByVisibleText("WebElement Commands");

        //TODO: Кликнуть на кнопку Button
        driver.findElement(By.cssSelector("button#submit")).click();

        //TODO: Закрыть браузер
        driver.quit();
    }
}
