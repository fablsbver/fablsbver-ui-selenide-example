package com.github.fablsbver.pages.home_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.github.fablsbver.pages.practice_pages.WebInputsPracticePage;
import com.github.fablsbver.pages.practice_pages.BasicAuthenticationPage;
import com.github.fablsbver.pages.practice_pages.HoversPracticePage;
import com.github.fablsbver.pages.practice_pages.KeyPresserPracticePage;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private final SelenideElement basicAuthBtn = $x("//a[@href='/basic-auth']");
    private final SelenideElement inputsBtn = $x("//a[@href='/inputs']");
    private final SelenideElement keyPresserBtn = $x("//a[@href='/key-presses']");
    private final SelenideElement hoversBtn = $x("//a[@href='/hovers']");

    public HomePage openPage() {
        Selenide.open("https://practice.expandtesting.com/");
        return this;
    }

    public BasicAuthenticationPage clickBasicAuthBtn() {
        basicAuthBtn.click();
        return new BasicAuthenticationPage();
    }

    public WebInputsPracticePage clickInputsBtn() {
        inputsBtn.click();
        return new WebInputsPracticePage();
    }

    public KeyPresserPracticePage clickKeyPresserBtn() {
        keyPresserBtn.click();
        return new KeyPresserPracticePage();
    }

    public HoversPracticePage clickHoversBtn() {
        hoversBtn.click();
        return new HoversPracticePage();
    }

}
