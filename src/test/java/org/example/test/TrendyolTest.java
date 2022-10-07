package org.example.test;


import org.example.driver.Driver;
import org.example.pages.*;
import org.junit.jupiter.api.Test;

public class TrendyolTest extends Driver {

    @Test
    public void trendyolTest(){

        GuestPage guestPage = new GuestPage();
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        SearchPage searchPage = new SearchPage();
        CartPage cartPage = new CartPage();

        guestPage.clickLogin();

        loginPage.loginToTrendyol();

        mainPage.searchProduct("oppo a55 mat seramik");

        searchPage.clickOnSelectedProduct(1);

        mainPage.searchProduct("iphone xr mat seramik");

        searchPage.clickOnSelectedProduct(2);

        searchPage.clickOnMyCart();

        cartPage.clickConfirmButton();

    }

}
