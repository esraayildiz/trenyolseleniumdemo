package org.example.pages;

import org.example.constants.LoginPageConstants;

public class LoginPage extends BasePage {

    public void loginToTrendyol(){
        methods.sendKeys(LoginPageConstants.emailTextBox, "email");
        methods.sendKeys(LoginPageConstants.passwordTextBox, "sifre");
        methods.clickElement(LoginPageConstants.signInButton);
        methods.waitBySeconds(3);
    }
}
