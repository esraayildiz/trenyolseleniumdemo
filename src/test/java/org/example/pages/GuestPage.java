package org.example.pages;

import org.example.constants.GuestPageConstants;

public class GuestPage extends BasePage {

    public void clickLogin(){
        //methods.waitBySeconds(300);
        methods.clickElement(GuestPageConstants.acceptButton);
        methods.waitBySeconds(2);
        methods.clickElement(GuestPageConstants.loginButton);
    }

}
