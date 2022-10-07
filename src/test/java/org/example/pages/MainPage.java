package org.example.pages;


import org.example.constants.MainPageConstants;

public class MainPage extends BasePage {

    public void searchProduct(String productName){
        methods.clearTextBox(MainPageConstants.searchTextBox);
        methods.sendKeys(MainPageConstants.searchTextBox, productName);
        methods.pressEnter(MainPageConstants.searchTextBox);
    }

}
