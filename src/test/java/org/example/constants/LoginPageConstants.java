package org.example.constants;

import org.openqa.selenium.By;

public class LoginPageConstants {

    public static final By emailTextBox = By.id("login-email");
    public static final By passwordTextBox = By.id("login-password-input");
    public static final By signInButton = By.cssSelector("button[class='q-primary q-fluid q-button-medium q-button submit']");
}
