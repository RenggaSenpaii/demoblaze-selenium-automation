package com.renggauas.testing.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By loginMenu = By.id("login2");
    By usernameField = By.id("loginusername");
    By passwordField = By.id("loginpassword");
    By loginButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginForm() throws InterruptedException {
        driver.findElement(loginMenu).click();
        Thread.sleep(1000);
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
