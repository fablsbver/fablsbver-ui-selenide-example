package com.github.fablsbver.pages.practice_pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class KeyPresserPracticePage {
    private final SelenideElement keyField = $x("//input[@id='target']");
    private final SelenideElement resultText = $(byId("result"));

    public KeyPresserPracticePage pressEscape() {
        keyField.pressEscape();
        resultText.shouldHave(text("You entered: ESCAPE"));
        return this;
    }

    public KeyPresserPracticePage pressTab() {
        keyField.pressTab();
        resultText.shouldHave(text("You entered: TAB"));
        return this;
    }

}
