package com.github.fablsbver.pages.practice_pages;

import com.codeborne.selenide.Selenide;
import com.github.fablsbver.properties.TestProperties;

public class BasicAuthenticationPage {
    public BasicAuthenticationPage switchAndLogIn() {
        Selenide.switchTo().activeElement().sendKeys(TestProperties.getProperty("baseLoginAndPassword"));
        return this;
    }
}
