package com.github.fablsbver.pages.practice_pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class WebInputsPracticePage {

    private final SelenideElement inputNumberField = $x("//input[@id='input-number']");
    private final SelenideElement inputTextField = $x("//input[@id='input-text']");
    private final SelenideElement inputPasswordField = $x("//input[@id='input-password']");
    private final SelenideElement inputDateField = $x("//input[@id='input-date']");

    private final SelenideElement displayInputsBtn = $x("//button[@id='btn-display-inputs']");
    private final SelenideElement clearInputsBtn = $x("//button[@id='btn-clear-inputs']");

    private final SelenideElement outputNumberField = $x("//strong[@id='output-number']");
    private final SelenideElement outputTextField = $x("//strong[@id='output-text']");
    private final SelenideElement outputPasswordField = $x("//strong[@id='output-password']");
    private final SelenideElement outputDateField = $x("//strong[@id='output-date']");

    public WebInputsPracticePage typeNumber(String number) {
        inputNumberField.sendKeys(number);
        return this;
    }

    public WebInputsPracticePage typeText(String text) {
        inputTextField.sendKeys(text);
        return this;
    }

    public WebInputsPracticePage typePassword(String password) {
        inputPasswordField.sendKeys(password);
        return this;
    }

    public WebInputsPracticePage typeDate(String day, String month, String year) {
        inputDateField.sendKeys(day + month + year);
        return this;
    }

    public WebInputsPracticePage clickDisplayInputs() {
        displayInputsBtn.click();
        return this;
    }

    public WebInputsPracticePage compareNumber(String number) {
        outputNumberField.shouldHave(text(number));
        return this;
    }

    public WebInputsPracticePage compareText(String text) {
        outputTextField.shouldHave(text(text));
        return this;
    }

    public WebInputsPracticePage comparePassword(String password) {
        outputPasswordField.shouldHave(text(password));
        return this;
    }

    public WebInputsPracticePage compareDate(String year, String month, String day) {
        outputDateField.shouldHave(text(year + "-" + month + "-" + day));
        return this;
    }

    public WebInputsPracticePage clickClearInputs() {
        clearInputsBtn.click();
        return this;
    }

    public WebInputsPracticePage checkInvisibilityOfTheForm() {
        outputNumberField.shouldNotBe(visible);
        outputTextField.shouldNotBe(visible);
        outputPasswordField.shouldNotBe(visible);
        outputDateField.shouldNotBe(visible);
        return this;
    }

}
