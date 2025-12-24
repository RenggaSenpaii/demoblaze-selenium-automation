package com.renggauas.testing.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CartPage extends BasePage {

    By addToCartButton = By.linkText("Add to cart");
    By cartMenu = By.id("cartur");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void openCart() {
        driver.findElement(cartMenu).click();
    }
}
