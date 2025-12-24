package com.renggauas.testing.automation.tests;

import org.testng.annotations.Test;
import com.renggauas.testing.automation.pages.HomePage;
import com.renggauas.testing.automation.pages.CartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void TC_CART_001_AddProductToCart() {
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.openFirstProductDetail();
        cartPage.addProductToCart();
        cartPage.openCart();
    }
}
