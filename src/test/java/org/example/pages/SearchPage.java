package org.example.pages;

import org.example.constants.SearchPageConstants;
import org.openqa.selenium.By;

public class SearchPage extends BasePage{

    public void clickOnSelectedProduct(int itemIndex){
        methods.scrollPage(250);
        methods.clickElement(By.xpath(SearchPageConstants.firstPart + itemIndex + SearchPageConstants.secondPart));
    }

    public void clickOnMyCart(){
        methods.scrollPage(-250);
        methods.clickElement(SearchPageConstants.myCartButton);
    }
}
