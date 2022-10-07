package org.example.pages;

import org.example.constants.CartPageConstants;

public class CartPage extends BasePage {

    public void clickConfirmButton(){
        methods.clickElement(CartPageConstants.confirmButton);
    }

}
