package com.renggauas.testing.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HomePage extends BasePage {

    By firstProduct = By.xpath("(//a[@class='hrefch'])[1]");
    By addToCartButton = By.linkText("Add to cart");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openFirstProductDetail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // tunggu produk bisa diklik
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();

        // tunggu halaman detail & tombol Add to cart muncul
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
    }
}
