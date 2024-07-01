package com.github.fablsbver.pages.practice_pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HoversPracticePage {

    private final ElementsCollection usersImg = $$x("//img[@src = '/img/avatar-blank.jpg']");
    private final SelenideElement usersLink = $x("//a[@href='/users/1']");
    private final SelenideElement userProfile = $x("//div[@class='page-layout']");

    public HoversPracticePage hoverOverImage() {
        usersImg.first().hover();
        return this;
    }

    public HoversPracticePage clickUsersLink() {
        usersLink.click();
        return this;
    }

    public HoversPracticePage checkUserProfile() {
        userProfile.shouldHave(text("User Profile"));
        return this;
    }
}
