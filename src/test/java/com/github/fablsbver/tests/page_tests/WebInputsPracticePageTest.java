package com.github.fablsbver.tests.page_tests;

import com.github.fablsbver.pages.home_page.HomePage;
import com.github.fablsbver.pages.practice_pages.WebInputsPracticePage;
import com.github.fablsbver.tests.base_test.BaseTest;
import org.junit.jupiter.api.Test;

public class WebInputsPracticePageTest extends BaseTest {

    @Test
    public void fillAndDisplayTheForm() {
        WebInputsPracticePage webInputsPracticePage = new HomePage()
                .openPage()
                .clickInputsBtn();
        webInputsPracticePage
                .typeNumber("6")
                .typeText("yy")
                .typePassword("tyu")
                .typeDate("11", "11", "2011")
                .clickDisplayInputs()
                .compareNumber("6")
                .compareText("yy")
                .comparePassword("tyu")
                .compareDate("2011", "11", "11")
                .clickClearInputs()
                .checkInvisibilityOfTheForm();


    }
}
