package com.renggauas.testing.automation.tests;

import org.testng.annotations.Test;
import com.renggauas.testing.automation.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void TC_LOGIN_001_LoginValidUser() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginForm();
        loginPage.login("tuyulpucat", "tuyulpucat");
    }
}
