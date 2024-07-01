package com.github.fablsbver.tests.page_tests;

import com.github.fablsbver.pages.home_page.HomePage;
import org.junit.jupiter.api.Test;
import com.github.fablsbver.pages.practice_pages.KeyPresserPracticePage;
import com.github.fablsbver.tests.base_test.BaseTest;

public class KeyPresserPracticePageTest extends BaseTest {

    @Test
    public void pressEscape() {
        KeyPresserPracticePage keyPresserPracticePage = new HomePage()
                .openPage()
                .clickKeyPresserBtn();
        keyPresserPracticePage.pressEscape();
    }

    @Test
    public void pressTab() {
        KeyPresserPracticePage keyPresserPracticePage = new HomePage().clickKeyPresserBtn();
        keyPresserPracticePage.pressTab();
    }
}
