package org.example.constants;

import org.openqa.selenium.By;

public class SearchPageConstants {

    /** sonucu sepete ekle*/

    public static final String firstPart = "(//div[@class='p-card-wrppr with-campaign-view add-to-bs-card'])[";
    public static final String secondPart = "]//div[text()='Sepete Ekle']";

    public static final By myCartButton = By.cssSelector("a[href='/sepet'][class='link account-basket']");

}
